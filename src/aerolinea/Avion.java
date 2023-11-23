package aerolinea;

public class Avion 
{
	public int modeloint;
	public String modelostr;
	public int capaciad;
	public float velocidad;

	
	String modelosA[] = {"Boeing 737","Airbus A320","Boeing 777","Airbus A330","Boeing 747"};
	public Avion (int model, int capacidad, float velocidad)
	{
		
	}
	
	private void setModel(int i)
	{
		if (i>=5)
			i = 4;
		else 
			modelostr=modelosA[i];
	}
}
