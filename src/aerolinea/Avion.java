package aerolinea;

public class Avion 
{
	private String modelostr;
	private int capacidad;
	private float velocidad;

	
	String modelosA[] = {"Boeing 737","Airbus A320","Boeing 777","Airbus A330","Boeing 747"};
	public Avion (int model)
	{
		setModel(model);
		setCapacidad(model);
		setVelocidad(model);
	}
	
	private void setModel(int i)
	{
		if (i>=5) {
			i = 0;
			modelostr=modelosA[i];
		}
		else 
			modelostr=modelosA[i];
	}
	
	private void setCapacidad(int model)
	{
		switch(model)
		{
		case 0:
			capacidad = 149;
			break;
		
		case 1: 
			capacidad = 240;
			break;
		case 2:
			capacidad = 440;
			break;
		case 3:
			capacidad = 406;
			break;
		case 4:
			capacidad = 660;
			break;
		default:
			capacidad = 149;
		}
	}
	
	private void setVelocidad(int model)
	{
		switch(model)
		{
		case 0:
			velocidad = 900;
			break;
		
		case 1: 
			velocidad = 900;
			break;
		case 2:
			velocidad = 950;
			break;
		case 3:
			velocidad = 913;
			break;
		case 4:
			velocidad = 950;
			break;
		default:
			velocidad = 900;
		}	
	}
	public String toString()
	{
		return "El avion modelo " +modelostr+" tiene una capacidad de "+capacidad+" pasajeros y puede alcanzar una velocidad de " +velocidad+"km/h"; 
	}
	
	public String getModelo()
	{
		return modelostr;
	}
	
	public int getCapacidad()
	{
		return capacidad;
	}
	
	public float getVelocidad()
	{
		return velocidad;
	}
}
