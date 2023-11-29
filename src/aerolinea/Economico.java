package aerolinea;

public class Economico extends Boleto {
	
	public Economico(String nombrePas, Boolean sex, int edad, String pasaporte, int asiento)
	{
		super(nombrePas,sex,edad,pasaporte, asiento);
		tipo();
		precio();
	}

	@Override
	public void precio() 
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
