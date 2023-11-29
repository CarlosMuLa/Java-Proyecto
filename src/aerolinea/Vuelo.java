package aerolinea;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
import java.time.Duration;
import java.time.LocalDateTime;


public class Vuelo 
{
	private Avion avion;
	private List<Boleto> boletos;
	private Set<Boleto> boletoscomprados;
	private Rutas route;
	private LocalDateTime horallegada;
	private LocalDateTime horasalida;
	private Duration cadacuanto;
	
	public Vuelo(Rutas ruta,Avion plane, LocalDateTime horasalida, long each)
	{
		route = ruta;
		avion = plane;
		boletos = new ArrayList<Boleto>();
		for (int i = 0; i < plane.getCapacidad(); i++) {
			  boletos.add(null);
			} 
		boletoscomprados = new HashSet<>(avion.getCapacidad());
		cadacuanto = Duration.ofMinutes(each); //cada caunto va a salir este vuelo
		this.horasalida = horasalida;
		horallegada = getHoraLLegada(); //se suma la hora de salida del vuelo a la duracion del vuelo para obtener la hora de llegada
	}
	
	
	public LocalDateTime getHoraLLegada()
	{
		return  horasalida.plus(route.duracionVuelo);
	}
	
	public void comprarBoleto(int index, String nombre, boolean sexo, int edad, String pasaporte, int asiento) {
	    Boleto nuevoBoleto;

	    if (asiento < 40) {
	        nuevoBoleto = new PrimeraClase(nombre, sexo, edad, pasaporte, asiento);
	    } else if (asiento > 40) {
	        nuevoBoleto = new Economico(nombre, sexo, edad, pasaporte, asiento);
	    } else {
	        // Lógica para otro tipo de asiento, si es necesario
	        return;
	    }

	    // Verificar si el índice es válido y la lista tiene suficientes elementos
	    if (index >= 0 && index < avion.getCapacidad()) {
	        // Agregar el nuevo boleto a la lista de boletos
	        boletos.add(index, nuevoBoleto);
	        // Agregar el nuevo boleto a la lista de boletos comprados
	        boletoscomprados.add(nuevoBoleto);
	    } else {
	        System.out.println("Índice no válido o lista sin capacidad suficiente.");
	    }
	}
	
	public String toString()
	{
		return "El vuelo hacia "+route.destino+" tiene "+ boletoscomprados.size()+" boletos comprados de"+avion.getCapacidad();
	}
	
	public void asientos()
	{
		for ( Boleto elemento : boletoscomprados)
                System.out.println("El pasajero "+elemento.nombrePasajero+" tiene el asiento "+elemento.numAsiento+" de clase "+elemento.tipoBoleto);
	}
	
}
