package aerolinea;

public class PrimeraClase extends Boleto
{
	public PrimeraClase(String nombrePas, Boolean sex, int edad, String pasaporte, int asiento)
	{
		super(nombrePas,sex,edad,pasaporte,asiento);
		tipo();
		precio();
	}

	@Override
	public void precio() 
	{
		super.precio=0;
	//	super.precio= precioGenerado(); Falta aqui generar el precio que va a ser conforme lo que genere el algoritmo
		// TODO Auto-generated method stub

	}

	@Override
	public void tipo() 
	{
		super.tipoBoleto="Primera Clase";
		// TODO Auto-generated method stub

	}
	

}
