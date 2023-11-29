package aerolinea;

import java.time.LocalDateTime;

public class FelipeAngeles 
{
	public static void main(String[]args)
	{
		LocalDateTime ldt1 = LocalDateTime.now();
		Avion a1 = new Avion(0);
		  Avion a2 = new Avion(1);
		  Avion a3 = new Avion(2);
		  Avion a4 = new Avion(3);
		  Avion a5 = new Avion(4); 
		  Avion a6 = new Avion(5);
		  Aeropuerto aeropuerto1 = new Aeropuerto("JFK", "Aeropuerto John F. Kennedy", "Estados Unidos");
	        Aeropuerto aeropuerto2 = new Aeropuerto("LHR", "Aeropuerto de Heathrow", "Reino Unido");
	        Aeropuerto aeropuerto3 = new Aeropuerto("CDG", "Aeropuerto Charles de Gaulle", "Francia");
	        Aeropuerto aeropuerto4 = new Aeropuerto("HND", "Aeropuerto de Haneda", "Japón");
	        Aeropuerto aeropuerto5 = new Aeropuerto("SYD", "Aeropuerto Kingsford Smith", "Australia");
	        Aeropuerto aeropuerto6 = new Aeropuerto("PEK", "Aeropuerto Internacional de Pekín", "China");
	        Aeropuerto aeropuerto7 = new Aeropuerto("DXB", "Aeropuerto Internacional de Dubái", "Emiratos Árabes Unidos");
	        Aeropuerto aeropuerto8 = new Aeropuerto("SIN", "Aeropuerto de Singapur Changi", "Singapur");
	        Aeropuerto aeropuerto9 = new Aeropuerto("FRA", "Aeropuerto de Fráncfort", "Alemania");
	        Aeropuerto aeropuerto10 = new Aeropuerto("AMS", "Aeropuerto de Ámsterdam Schiphol", "Países Bajos");
	        Aeropuerto aeropuerto11 = new Aeropuerto("IST", "Aeropuerto de Estambul", "Turquía");
	        Aeropuerto aeropuerto12 = new Aeropuerto("CAN", "Aeropuerto Internacional de Cantón-Baiyun", "China");
	        Aeropuerto aeropuerto13 = new Aeropuerto("ICN", "Aeropuerto Internacional de Incheon", "Corea del Sur");
	        Aeropuerto aeropuerto14 = new Aeropuerto("ATL", "Aeropuerto Internacional Hartsfield-Jackson", "Estados Unidos");
	        Aeropuerto aeropuerto15 = new Aeropuerto("MEX", "Aeropuerto Internacional de la Ciudad de México", "México");
	        Aeropuerto aeropuerto16 = new Aeropuerto("YYZ", "Aeropuerto Internacional Toronto Pearson", "Canadá");
	        Aeropuerto aeropuerto17 = new Aeropuerto("LAX", "Aeropuerto Internacional de Los Ángeles", "Estados Unidos");
	        Aeropuerto aeropuerto18 = new Aeropuerto("BKK", "Aeropuerto Suvarnabhumi", "Tailandia");
	        Aeropuerto aeropuerto19 = new Aeropuerto("JNB", "Aeropuerto Internacional O. R. Tambo", "Sudáfrica");
	        Aeropuerto aeropuerto20 = new Aeropuerto("MUC", "Aeropuerto de Múnich", "Alemania");
	        Aeropuerto aeropuerto21 = new Aeropuerto("DEL", "Aeropuerto Indira Gandhi", "India");
	        Aeropuerto aeropuerto22 = new Aeropuerto("SYX", "Aeropuerto Internacional de Sanya Phoenix", "China");
	        Aeropuerto aeropuerto23 = new Aeropuerto("PTY", "Aeropuerto Internacional de Tocumen", "Panamá");
	        Aeropuerto aeropuerto24 = new Aeropuerto("HEL", "Aeropuerto de Helsinki-Vantaa", "Finlandia");
	        Aeropuerto aeropuerto25 = new Aeropuerto("KIX", "Aeropuerto Internacional de Kansai", "Japón");
	        Aeropuerto aeropuerto26 = new Aeropuerto("GIG", "Aeropuerto Internacional de Río de Janeiro-Galeão", "Brasil");
	        Aeropuerto aeropuerto27 = new Aeropuerto("GRU", "Aeropuerto Internacional de São Paulo-Guarulhos", "Brasil");
	        Aeropuerto aeropuerto28 = new Aeropuerto("EZE", "Aeropuerto Internacional de Ezeiza", "Argentina");
	        Aeropuerto aeropuerto29 = new Aeropuerto("SCL", "Aeropuerto Internacional Arturo Merino Benítez", "Chile");
	        Aeropuerto aeropuerto30 = new Aeropuerto("LIM", "Aeropuerto Internacional Jorge Chávez", "Perú");

//public Rutas(Aeropuerto origin, Aeropuerto destiny, long duracion, int price, int distancia)
	        Rutas ruta1 = new Rutas(aeropuerto1, aeropuerto2, 480, 5000, 5500);
	        Rutas ruta2 = new Rutas(aeropuerto21, aeropuerto3, 180, 1300, 12100);
	        Rutas ruta3 = new Rutas(aeropuerto30, aeropuerto4, 240, 4000, 25200);
	        Rutas ruta4 = new Rutas(aeropuerto4, aeropuerto5, 300, 600, 30007);
	        Rutas ruta5 = new Rutas(aeropuerto29, aeropuerto22, 240, 400, 25500);
	        Rutas ruta6 = new Rutas(aeropuerto22, aeropuerto3, 300, 600, 30080);
	        Rutas ruta7 = new Rutas(aeropuerto28, aeropuerto26, 480, 550, 55300);
	        Rutas ruta8 = new Rutas(aeropuerto21, aeropuerto30, 180, 300.10, 11200);
	        Rutas ruta9 = new Rutas(aeropuerto23, aeropuerto10, 240, 400.55, 20500);
	        Rutas ruta10 = new Rutas(aeropuerto18, aeropuerto5, 300, 700, 30070);
	        Rutas ruta11= new Rutas(aeropuerto27, aeropuerto14, 240, 940, 25600);
	        Rutas ruta12 = new Rutas(aeropuerto14, aeropuerto5, 300, 1600, 37000);
	        Rutas ruta13 = new Rutas(aeropuerto16, aeropuerto24, 480, 2500, 55800);
	        Rutas ruta14 = new Rutas(aeropuerto21, aeropuerto25, 180, 3300, 12100);
	        Rutas ruta15 = new Rutas(aeropuerto6, aeropuerto11, 240, 560, 2500);
	        Rutas ruta16 = new Rutas(aeropuerto11, aeropuerto12, 300, 670, 3000);
	        Rutas ruta17 = new Rutas(aeropuerto7, aeropuerto17, 240, 490, 2500);
	        Rutas ruta18 = new Rutas(aeropuerto8, aeropuerto15, 300, 6010, 3000);
	        Rutas ruta19 = new Rutas(aeropuerto9, aeropuerto20, 480, 5500, 55100);
	        Rutas ruta20 = new Rutas(aeropuerto21, aeropuerto6, 180, 3700, 12600);
	        Rutas ruta21 = new Rutas(aeropuerto3, aeropuerto4, 240, 4800, 25800);
	        Rutas ruta22 = new Rutas(aeropuerto8, aeropuerto23, 300, 6500, 37000);
	        Rutas ruta23= new Rutas(aeropuerto10, aeropuerto4, 240, 200, 25060);
	        Rutas ruta24 = new Rutas(aeropuerto4, aeropuerto5, 300, 6600, 30500);
	        Rutas ruta25 = new Rutas(aeropuerto1, aeropuerto2, 480, 8900, 550);
	        Rutas ruta26 = new Rutas(aeropuerto21, aeropuerto3, 180, 1100, 123);
	        Rutas ruta27 = new Rutas(aeropuerto3, aeropuerto13, 240, 4400, 2550);
	        Rutas ruta28 = new Rutas(aeropuerto4, aeropuerto5, 300, 6000, 3000);
	        Rutas ruta29 = new Rutas(aeropuerto3, aeropuerto9, 240, 4100, 2500);
	        Rutas ruta30 = new Rutas(aeropuerto4, aeropuerto25, 300, 6700, 3000);
	        Rutas ruta31 = new Rutas(aeropuerto11, aeropuerto2, 480, 5200, 5500);
	        Rutas ruta32 = new Rutas(aeropuerto21, aeropuerto13, 180, 3300, 5200);
	        Rutas ruta33 = new Rutas(aeropuerto23, aeropuerto4, 240, 4300, 2500);
	        Rutas ruta34 = new Rutas(aeropuerto14, aeropuerto10, 300, 3600, 3000);
	        Rutas ruta35= new Rutas(aeropuerto30, aeropuerto15, 240, 4050, 2500);
	        Rutas ruta36 = new Rutas(aeropuerto25, aeropuerto5, 300, 6050, 3000);
	        Rutas ruta37 = new Rutas(aeropuerto27, aeropuerto4, 240, 4070, 2500);
	        Rutas ruta38 = new Rutas(aeropuerto19, aeropuerto5, 300, 6060, 3000);
	        Rutas ruta39= new Rutas(aeropuerto3, aeropuerto24, 240, 4090, 2500);
	        Rutas ruta40 = new Rutas(aeropuerto5, aeropuerto4, 300, 6600, 3000);//public void comprarBoleto(int index, Stringnombre,boolean sexo,int edad, String pasaporte, int asiento)
		  // public Vuelo(Rutas ruta,Avion plane, LocalDateTime horasalida,LocalDateTime each) 
		  Vuelo v1 = new Vuelo(ruta1,a1,ldt1,120); 
		  v1.comprarBoleto(0,"Carlos", false, 10, "1234", 41); 
		  v1.comprarBoleto(130, "incienso", true, 19, "hila", 0);
		  v1.asientos(); 
		 
	}

}
