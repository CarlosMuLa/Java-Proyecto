package aerolinea;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.time.Duration;
import java.time.LocalDateTime;


public class Vuelo 
{
	private Avion avion;
	private List<Boleto> boletos;
	private Set<Boleto> boletoscomprados;
	private Rutas route;
	private LocalDateTime horallegada;
	private LocalDateTime horasalida;
	
	
	public Vuelo(Rutas ruta,Avion plane, LocalDateTime horasalida)
	{
		route = ruta;
		avion = plane;
		boletos = new ArrayList<Boleto>();
		for (int i = 0; i < plane.getCapacidad(); i++) {
			  boletos.add(null);
			} 
		boletoscomprados = new HashSet<>(avion.getCapacidad());
		 //cada caunto va a salir este vuelo
		this.horasalida = horasalida;
		horallegada = getHoraLLegada(); //se suma la hora de salida del vuelo a la duracion del vuelo para obtener la hora de llegada
	}
	
	
	public LocalDateTime getHoraLLegada()
	{
		return  horasalida.plus(route.duracionVuelo);
	}
	
	public List<Vuelo> comprarBoleto(List<Rutas> rutas,int index, String nombre, boolean sexo, int edad, String pasaporte, int asiento,Avion plane, LocalDateTime horasalida) {
	    Boleto nuevoBoleto = new Economico(nombre, sexo, edad, pasaporte, 100);;
	    List<Vuelo> vuelos = new ArrayList<>();
	    for(int i =0; i<rutas.size();i++)
	    {
	    if (asiento < 40) 
	    {
	        nuevoBoleto = new PrimeraClase(nombre, sexo, edad, pasaporte, asiento);
	    }
	    else if (asiento > 40) {
	        nuevoBoleto = new Economico(nombre, sexo, edad, pasaporte, asiento);
	    }
	    else if (asiento >100)
	    {
	        // Lógica para otro tipo de asiento, si es necesario
	    	nuevoBoleto = new Economico(nombre, sexo, edad, pasaporte, 100);
	    }

	    // Verificar si el índice es válido y la lista tiene suficientes elementos
	    if (index >= 0 && index < avion.getCapacidad()) {
	        // Agregar el nuevo boleto a la lista de boletos
	        boletos.add(index, nuevoBoleto);
	        // Agregar el nuevo boleto a la lista de boletos comprados
	        boletoscomprados.add(nuevoBoleto);
	    } 
	    else 
	    {
	        System.out.println("Índice no válido o lista sin capacidad suficiente.");
	    }
	    
	    }
	    //se regresa los vuelos que se compro
	    for(Rutas ruta : rutas)
	    {
	    	vuelos.add(new Vuelo(ruta,plane,horasalida));
	    }
	    return vuelos;
	    //public Vuelo(Rutas ruta,Avion plane, LocalDateTime horasalida, long each)
	}
	
	public String toString()
	{
		return "El vuelo hacia "+route.destino+" tiene "+ boletoscomprados.size()+" boletos comprados de"+avion.getCapacidad();
	}
	
	public void asientos()
	{
		for ( Boleto elemento : boletoscomprados)
                System.out.println("El pasajero "+elemento.nombrePasajero+" tiene el asiento "+elemento.numAsiento+" de clase "+elemento.tipoBoleto);
	}
	
	
}
