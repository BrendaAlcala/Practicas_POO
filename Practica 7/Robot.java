package p7;

public abstract class Robot {
    
    private int nivelBateria;
    public int identificacion;
    public String nombre;
    private String ultimaAccion;
    
    public Robot(){
        System.out.println("Registre a los tres robots");
        setNombre(CapturaEntrada.capturarCadena("Nombre"));
        setNivelBateria(CapturaEntrada.capturarEntero("Nivel actual de bateria"));
        setIdentificacion(CapturaEntrada.capturarEntero("Numero de identificacion"));
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setNivelBateria(int nivel){
        nivelBateria = nivel;
    }
    public void setIdentificacion(int identificacion){
        this.identificacion = identificacion;
    }
    public void setUltimaAccion(String tarea){
        ultimaAccion = tarea;
    }
    public String getNombre(){
        return nombre;
    }
    public int getNivelbateria(){
        return nivelBateria;
    }
    public int getidentificacion(){
        return identificacion;
    }
    public String getTarea(){
        return ultimaAccion;
    }
    public void informacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Identificacion: " + identificacion);
        System.out.println("Nivel de bateria: " + nivelBateria);
        System.out.println("Su ultima accion realizada: " + ultimaAccion);
    }
}