package aerolinea;

import java.time.Duration;
import java.time.LocalDateTime;


public class Rutas 
{
	public Aeropuerto origen;
	public Aeropuerto destino;
	public Duration duracionVuelo;
	public int precio;
	public int distanciakm;
	private Duration cadacuanto;
	
	
	public Rutas(Aeropuerto origin, Aeropuerto destiny, long duracion, int price, int distancia, long each)
	{
		origen = origin;
		destino = destiny;
		duracionVuelo = Duration.ofMinutes(duracion);
		precio = price;
		distanciakm = distancia < 20 ? 20 :distancia;
		cadacuanto = Duration.ofMinutes(each);
	}
	
	
	public String getOrigen()
	{
		return origen.getCodigoAeropuerto();
	}
	
	public String getDestino()
	{
		return destino.getCodigoAeropuerto();
	}
	
	public int getPrecio()
	{
		return precio;
	}
	
	public Aeropuerto getOrigenAe()
	{
		return origen;
	}
	public Aeropuerto getDestinoAe()
	{
		return origen;
	}
	public Duration getCadaCuanto()
	{
		return cadacuanto;
	}
	
	public String toString()
	{
		return "El vuelo saldria de "+ origen+" y llegaria a "+destino+" con duracion de "+duracionVuelo;
	}

}
