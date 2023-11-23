package aerolinea;

public class Economico extends Boleto {
	
	public Economico(String nombrePas, Boolean sex, int edad, String pasaporte,String tipo)
	{
		super(nombrePas,sex,edad,pasaporte);
		
		
	}

	@Override
	protected void precio() 
	{
	//	super.precio= precioGenerado(); Falta aqui generar el precio que va a ser conforme lo que genere el algoritmo
		// TODO Auto-generated method stub

	}

	@Override
	public void tipo() 
	{
		super.tipoBoleto="Economico";
		// TODO Auto-generated method stub

	}

}
