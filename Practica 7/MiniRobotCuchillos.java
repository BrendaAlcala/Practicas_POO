package p7;

public class MiniRobotCuchillos extends Robot implements Tareas{
    public boolean tarearealizada = false;
     public boolean tareaC;
    
    public MiniRobotCuchillos(){
        super();
    }
    @Override
    public String cortarAlimentos(){
        tarearealizada = true;
        return ("Soy Mini Robot " + nombre + " He preparado los ingredientes");
    }
    @Override
    public String cocinar(){
        tarearealizada = true;
        return ("Soy Mini Robot " + nombre +" No logré cocinar");
    }
    @Override
    public String servirComida(){
        tarearealizada = true;
        return ("Soy Mini Robot " + nombre +" No logré servir el plato");
    }
}