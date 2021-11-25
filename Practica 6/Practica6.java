package p6;

public class Practica6 {

public static void main(String[] args) {
       Torneo torne = new Torneo();
       
       System.out.println("Nombre del torneo: " +torne.getNombretorneo() +"\nRegion: " + torne.getRegion());
       System.out.println("Equipos particiapantes: " + torne.getNumeroEquipos());
       System.out.println("Partidos jugados: " +torne.getPartidosJugados()+ "\nPartido pendientes: "+torne.getPartidosPendientes());
       
       for(int i=0;i<Torneo.equipos.length;i++){
           System.out.println("Nombre del equipo :"+ Torneo.equipos[i].getNombreEquipo());
           System.out.println("Division "+ Torneo.equipos[i].getDivision());
           System.out.println("Cantidad de jugadores " + Torneo.equipos[i].jugadoresTotales());
           System.out.println("Puntos obtenidos: " + Torneo.equipos[i].puntosTotales());
           for(int j=0;j<Torneo.equipos[i].jugadores.length;j++){
               System.out.println("Jugador: " + Torneo.equipos[i].jugadores[j].getNombreJugador());
               System.out.println("Numero del jugador: " + Torneo.equipos[i].jugadores[j].getNumJugador());
           }
       }
    }
} 