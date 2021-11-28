package p8;

public class Vaca extends Animal{
    
    public Vaca(String nombre, int edad){
        super(nombre, edad);
    }
    
    @Override
    public void eat(){
        System.out.println(name + "está comiendo pasto");
    }
    
    public void mugir(){
        System.out.println(name + "MUUUU");
    }
}