package p8;

public class Cebra extends Animal{
    
    public Cebra(String nombre, int edad){
        super(nombre, edad);
    }
        @Override
    public void eat(){
        System.out.println(name + "está comiendo hierba");
    }
    
    public void galopar(){
        System.out.println(name + "galopa por el pasto");
    }
    
}