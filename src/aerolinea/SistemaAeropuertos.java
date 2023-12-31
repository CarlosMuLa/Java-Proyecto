package aerolinea;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class SistemaAeropuertos 
{
	private List<Rutas> rutasdisponibles;
	private List<Aeropuerto> listaDeAeropuertos;

	public SistemaAeropuertos()
	{
		rutasdisponibles = new ArrayList<>();
		listaDeAeropuertos = new ArrayList<>();
	}
	
	public List<Rutas> encontrarRuta(Aeropuerto origen, Aeropuerto destino,List<Rutas> rutas)
	{
		//el gscore es el valor que acumula el valor desde el aeropuerto inicial hasta el aeropuerto actual.
		Map<Aeropuerto, Integer> gScore = new HashMap<>();
		//el fscore almacena el valor de la suma del G score y el H score, mas adelante se explicara que es el hscore.
		Map<Aeropuerto, Integer> fScore = new HashMap<>();
		Map<Aeropuerto, Aeropuerto> aeropuertosCerca = new HashMap<>();
		//open set son los aeropuertos que todavia falta de explorar
		//PriorityQueue<Aeropuerto>: Está creando una cola de prioridad que contendrá objetos de tipo Aeropuerto.
		//En este contexto, cada aeropuerto representa un nodo en el grafo que estamos explorando.
		PriorityQueue<Aeropuerto> openSet = new PriorityQueue<>((a1,a2)->Integer.compare(fScore.getOrDefault(a1,Integer.MAX_VALUE), fScore.getOrDefault(a2,Integer.MAX_VALUE)));
		//esto es complicado de explicar aqui se crea una priority queue a1 y a2 son variables lambda de la iterfaz Comparator
		//lo que hace es que crea el orden en la que va a funcionar la cola que en este caso es que usara el fscore
		openSet.add(origen);
		//añade el aeropuerto origen a la priority queue
		gScore.put(origen,0);
		//añade el origen al mapa con un valor de 0 indicando que su valor hacia el mismo es 0
		//fScore.put(origen, heuristica(origen,destino));
		
		//mientras queden aeropuertos por recorrer
		while(!openSet.isEmpty())
			{
			Aeropuerto actual = openSet.poll();
			//cuando ya llegue al destino 
			if(actual.equals(destino))
			{
				System.out.println(reconstruirCamino(origen,destino,rutas));

				for(Rutas reconstruccion: reconstruirCamino(origen,destino,rutas));
				{
					//System.out.println(reconstruccion);
				}
				return reconstruirCamino(origen,destino,rutas);

			}
			System.out.println(obtenerRutasDesde(actual, rutas));
			for (Rutas ruta : obtenerRutasDesde(actual, rutas)) 
			{
			    Set<Aeropuerto> vecinos = obtenerVecinos(ruta.getDestinoAe(), rutas);
			    System.out.println(vecinos.size());			   
			    for (Aeropuerto vecino : vecinos) {
			        int tentativeGScore = gScore.getOrDefault(actual, Integer.MAX_VALUE) + ruta.distanciakm;
			       
			        if (tentativeGScore < gScore.getOrDefault(vecino, Integer.MAX_VALUE)) {
			            // Este es un nuevo camino más corto
			            gScore.put(vecino, tentativeGScore);
			            fScore.put(vecino, tentativeGScore + heuristica(vecino, destino, rutas));

			            if (!openSet.contains(vecino)) {
			                openSet.add(vecino);
			                System.out.println("-----openSet------");

			                System.out.println(openSet);
						}
				}
		
		}
			}
			}
		System.out.println("No se econtraron rutas disponibles");
		return null;
	}
	
	private int heuristica(Aeropuerto origen, Aeropuerto destino, List<Rutas> rutasPredefinidas) 
		{
	    for (Rutas ruta : rutasPredefinidas) 
	    {
	        if (ruta.getOrigenCodigo().equals(origen.getCodigoAeropuerto()) && ruta.getDestinoCodigo().equals(destino.getCodigoAeropuerto())) 
	            return ruta.getPrecio();
	    }
	    // No hay una ruta directa, devolver un valor alto o infinito
	    return Integer.MAX_VALUE;
		}
	
	public List<Rutas> obtenerRutasDesde(Aeropuerto origen, List<Rutas> rutasPredefinidas) {
        List<Rutas> rutasDesdeOrigen = new ArrayList<>();

        for (Rutas ruta : rutasPredefinidas) {
            if (ruta.getOrigenCodigo().equals(origen.getCodigoAeropuerto())) 
            	rutasDesdeOrigen.add(ruta);
        }
        System.out.println(rutasDesdeOrigen);

        return rutasDesdeOrigen;
    }
	
	
	public Set<Aeropuerto> obtenerVecinos(Aeropuerto aeropuerto, List<Rutas> rutasPredefinidas) {
	    Set<Aeropuerto> vecinos = new HashSet<>();

	    for (Rutas ruta : rutasPredefinidas) {
	        if (ruta.getOrigenCodigo().equals(aeropuerto.getCodigoAeropuerto())) {
	            Aeropuerto destino = obtenerAeropuertoPorCodigo(ruta.getDestinoAe().getCodigoAeropuerto(), rutasPredefinidas);
	            if (destino != null) {
	                System.out.println("destino " + destino);
	                vecinos.add(destino);
	            }
	        }
	    }
        System.out.println("destino " + vecinos);

	    return vecinos;
	}

	  private Aeropuerto obtenerAeropuertoPorCodigo(String codigo, List<Rutas> rutasPredefinidas) 
	  {
	      for (Rutas ruta : rutasPredefinidas) {
	          if (ruta.getOrigenAe().getCodigoAeropuerto().equals(codigo)) {
	              return ruta.getOrigenAe();
	          }
	          if (ruta.getDestinoAe().getCodigoAeropuerto().equals(codigo)) {
	              return ruta.getDestinoAe();
	          }
	      }
	      return null; // Manejo si el aeropuerto no se encuentra (ajustar según tus necesidades)
	  }
	
	
	private List<Rutas> reconstruirCamino(Aeropuerto origen, Aeropuerto destino, List<Rutas> rutasPredefinidas) {
	    List<Rutas> camino = new ArrayList<>();
	    Aeropuerto actual = destino;

	    while (actual != null) {
	        // Busca la ruta entre el aeropuerto anterior y el actual
	        Rutas ruta = encontrarRutaEntreAeropuertos(actual, origen, rutasPredefinidas);
	        if (ruta != null) {
	            camino.add(ruta);
	            // Actualiza el aeropuerto actual al origen de la ruta
	            actual = ruta.getOrigenAe();
	        } else {
	            // Si no hay ruta o aeropuerto anterior, termina el bucle
	            actual = null;
	        }
	    }

	    // Invierte la lista ya que la hemos construido desde el destino hasta el origen
	    Collections.reverse(camino);

	    return camino;
	}
	private Rutas encontrarRutaEntreAeropuertos(Aeropuerto origen, Aeropuerto destino, List<Rutas> rutasDisponibles) {
	    for (Rutas ruta : rutasDisponibles) {
	        if (ruta.getOrigenCodigo().equals(origen.getCodigoAeropuerto()) && ruta.getDestinoCodigo().equals(destino.getCodigoAeropuerto())) {
	            // Se encontró la ruta deseada
	            return ruta;
	        }
	    }

	    // Si no se encuentra la ruta, puedes devolver null o lanzar una excepción, dependiendo de tus necesidades.
	    // En este ejemplo, devolvemos null.
	    return null;
	}
	
	/*
	 * private Map<Aeropuerto, Aeropuerto> agregarAeropuerto(List<Rutas> ruta) {
	 * Map<Aeropuerto, Aeropuerto> aeropuertosCerca = new HashMap<>();
	 * 
	 * for(Rutas a: ruta) {
	 * aeropuertosCerca.entrySet(a.getOrigenAe(),a.getDestinoAe()); } }
	 */
	
	
	
}
	
	
	
