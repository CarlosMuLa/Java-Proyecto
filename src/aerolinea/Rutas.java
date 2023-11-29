package aerolinea;

import java.time.Duration;
import java.time.LocalDateTime;


public class Rutas 
{
	public Aeropuerto origen;
	public Aeropuerto destino;
	public Duration duracionVuelo;
	public double precio;
	public int distanciakm;
	
	
	public Rutas(Aeropuerto origin, Aeropuerto destiny, long duracion, double price, int distancia)
	{
		origen = origin;
		destino = destiny;
		duracionVuelo = Duration.ofMinutes(duracion);
		precio = price;
		distanciakm = distancia < 20 ? 20 :distancia;
	}
	
	

}
