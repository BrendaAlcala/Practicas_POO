package p7;

public class MagnumOpus extends Robot implements Tareas{
    
    public MagnumOpus(){
        super();
    }
    @Override
    public String cortarAlimentos(){
        return ("Soy el primer chef, me llamo "+nombre+" He preparado los ingredientes");
    }
    @Override
    public String cocinar(){
        return ("Soy Magum Opus " + nombre +" He codinado el platillo");
    }
    @Override
    public String servirComida(){
        return ("Soy Magum Opus " + nombre +" He servido el platillo");
    }
}