package aerolinea;

public class Aeropuerto 
{
		private String codigoAeropuerto;
		private String nombre;
		
		public void agregar(String codigo, String nombre) 
		{
			setCodigoAeropuerto(codigo);
			setNombre(nombre);
		}
		
		public String getCodigoAeropuerto() 
		{return codigoAeropuerto;}
		public String getNombre() {return nombre;}
		
		private void setCodigoAeropuerto(String codigo) 
		{
			codigoAeropuerto = codigo;
		}
		
		private void setNombre(String nombre) 
		{
			this.nombre = nombre;
		}
		
	}

