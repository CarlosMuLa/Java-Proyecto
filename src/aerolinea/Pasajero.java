package aerolinea;

public class Pasajero {
		private String cedula;
		private String nombre;
		private String apellido;
		private String sexo;
		private int edad;
		
		private Vuelo vuelo = null;
		
		public String getCedula() {return cedula;}
		public String getNombre() {return nombre;}
		public String getApellido() {return apellido;}
		public String getSexo() {return sexo;}
		public int getEdad() {return edad;}
		
		public void agregarNuevo(String cedula, String nombre, String apellido, String sexo, int edad) {
			this.cedula = cedula;
			this.nombre = nombre;
			this.apellido = apellido;
			this.sexo = sexo;
			this.edad = edad;
		}
		
		public void modificar(String cedula, String nombre, String apellido, String sexo, int edad) {
			agregarNuevo(cedula, nombre, apellido, sexo, edad);
		}
		
		public void asignarVuelo(Vuelo v) {
			if(vuelo == null) vuelo = v;
		}
		
		public Pasajero buscar(Pasajero p) {
			return p;
		}

	}

