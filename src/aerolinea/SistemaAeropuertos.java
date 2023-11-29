package aerolinea;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SistemaAeropuertos 
{
	private List<Rutas> rutasdisponibles;

	public SistemaAeropuertos()
	{
		rutasdisponibles = new ArrayList<>();
	}
	
	public List<Rutas> encontrarRuta(Aeropuerto origen, Aeropuerto destino)
	{
		//el gscore es el valor que acumula el valor desde el aeropuerto inicial hasta el aeropuerto actual.
		Map<Aeropuerto, Integer> gScore = new HashMap<>();
		//el fscore almacena el valor de la suma del G score y el H score, mas adelante se explicara que es el hscore.
		Map<Aeropuerto, Integer> fScore = new HashMap<>();
		
		//PriorityQueue<Aeropuerto>: Está creando una cola de prioridad que contendrá objetos de tipo Aeropuerto.
		//En este contexto, cada aeropuerto representa un nodo en el grafo que estamos explorando.
		PriorityQueue<Aeropuerto> openSet = new PriorityQueue<>
	}
	
	
	
}
