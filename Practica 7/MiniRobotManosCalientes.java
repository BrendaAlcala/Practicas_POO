package p7;

public class MiniRobotManosCalientes extends Robot implements Tareas{
    
    public boolean tarearealizada = false;
     public boolean tareaC;
    
    public MiniRobotManosCalientes(){
        super();
    }
    @Override
    public String cortarAlimentos(){
        tarearealizada = true;
        return ("Me llamo "+nombre+ " No logré cortar los alimentos ");
    }
    @Override
    public String cocinar(){
        tarearealizada = true;
        return ("Me llamo "+nombre+" He cocinado el platillo");
    }
    @Override
    public String servirComida(){
        tarearealizada = true;
        return ("Me llamo "+nombre+" No logré servir la comida");
    }
}