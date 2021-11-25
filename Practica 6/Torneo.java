package p6;
        
public class Torneo {
    
     int numeroEquipos;
     int partidosJugados;
     int partidosPendientes;
     String NombreTorneo;
     String region;
     
     static Equipo equipos[] = new Equipo[5];
     
    public Torneo(){
        setNombreTorneo("UEFA Champions League");
        setRegion("Europa");
        setPartidosJugados(5);
        numeroEquipos = equipos.length;
        setPartidosPendientes(15);
        addEquipos();
    }
    public void setPartidosJugados(int partidos)
    {
        partidosJugados = partidos;
    }
    public void setNombreTorneo(String nombre)
    {
        NombreTorneo = nombre;
    }
    public void setRegion(String region)
    {
        this.region = region;
    }
    public void setPartidosPendientes(int partidos){
        partidosPendientes = partidos;
    }
    public void addEquipos(){
        for(int i=0;i<equipos.length;i++){
            equipos[i] = new Equipo();
            equipos[i].setNombreEquipo(CapturaEntrada.capturarCadena("Nombre del Equipo"));
            equipos[i].setDivision(1);
            equipos[i].setEntrenador(CapturaEntrada.capturarCadena("Nombre del entrenador"));
            equipos[i].setTorenosGanados(CapturaEntrada.capturarEntero("Torneos ganados"));
            equipos[i].setTorneosPerdidos(CapturaEntrada.capturarEntero("Torneos perdidos"));
            equipos[i].setTorneosTotales(CapturaEntrada.capturarEntero("Torneos totales"));
            equipos[i].setJugadores(i);
        }
    }
    public String getRegion()
    {
        return region;
    }
    public String getNombretorneo()
    {
        return NombreTorneo;
    }
    public int getPartidosPendientes()
    {
        return partidosPendientes;
    }
    public int getNumeroEquipos()
    {
        return equipos.length;
    }
    public int getPartidosJugados()
    {
        return partidosJugados;
    }
    
}