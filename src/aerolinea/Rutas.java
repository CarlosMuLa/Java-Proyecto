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
	
	
	public String getOrigenCodigo()
	{
		return origen.getCodigoAeropuerto();
	}
	
	public String getDestinoCodigo()
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
		return destino;
	}
	public Duration getCadaCuanto()
	{
		return cadacuanto;
	}
	
	public String toString()
	{
		return getOrigenCodigo()+" -> "+getDestinoCodigo();
	}
	public String getOrigenNombre()
	{
		return origen.getNombre();
	}
	public String getDestinoNombre()
	{
		return destino.getNombre();
	}
	public String obtenerNombresCompletos()
	{
		return origen.getNombre()+" -> "+destino.getNombre();
	}


}
