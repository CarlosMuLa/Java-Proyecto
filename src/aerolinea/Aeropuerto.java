package aerolinea;

public class Aeropuerto 
{
		private String codigoAeropuerto;
		private String nombre;
		private String pais;
		private String estado;
		
		
		public Aeropuerto(String codigo, String nombre,String pais) 
		{
			setCodigoAeropuerto(codigo);
			setNombre(nombre);
			setPais(pais);
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
		
		private void setPais(String nombre) 
		{
			this.pais = nombre;
		}
		public boolean esInternacional(String pais)
		{
			if (this.pais != pais)
				return true;
			else 
				return false;
		}
		
	}

