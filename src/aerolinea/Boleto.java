package aerolinea;

import java.time.LocalDateTime;

abstract class Boleto 
{
	//la clase no tiene modificador de acceso ya que no tiene caso instanciar 
	protected int numAsiento;
	protected String nombrePasajero;
	protected Boolean sexo;
	protected int edadPasajero;
	protected String numPasaporte;
	protected LocalDateTime fecha;
	public float precio;
	protected String tipoBoleto;
	//protected Aerolinea aerolinea; falta implementar la clase aerolinea
	
	protected Boleto(String nombrePas, Boolean sex, int edad, String pasaporte)
	{
		nombrePasajero = nombrePas;
		sexo = sex;
		edadPasajero = edad;
		numPasaporte = pasaporte;
	}
	
	public abstract void precio();
	
	public abstract void tipo();
	
	public String toString()
	{
		return "El boleto "+numAsiento+" para el pasajero "+nombrePasajero+" de edad "+edadPasajero+" del sexo "+sexo+" para el dia "+fecha+" del tipo de boleto "+tipoBoleto+" por un total de "+precio;
	}
	

}
