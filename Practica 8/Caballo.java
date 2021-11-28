package p8;

public class Caballo extends Animal{
    
    public Caballo(String nombre, int edad){
        super(nombre, edad);
    }
    
    @Override
    public void eat(){
        System.out.println(name + "está comiendo heno");
    }
    
    public void relinchar(){
        System.out.println(name + "está relinchando");
    }
}
