package p6;

public class Jugador {
    
     String posicion;
     String nombre;
     int puntosAnotados;
     int NumJugador;
     double estatura;
     
    public void setEstatura(double estatura)
    {
        this.estatura = estatura;
    }
    public String getNombreJugador()
    {
        return nombre;
    }
    public void setNombre(String nomb)
    {
       nombre = nomb;
    }
    public void setpuntosAnotados(int puntos)
    {
        puntosAnotados = puntos;
    }
    public void setNumJugador(int num)
    {
        NumJugador = num;
    }
    public void setPosicion(String pos)
    {
        posicion = pos;
    }
    public int getNumJugador()
    {
        return NumJugador;
    }
    public int getPuntosAnotados()
    {
        return puntosAnotados;
    }
    
}