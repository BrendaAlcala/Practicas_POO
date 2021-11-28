package p8;

public class Jirafa extends Animal{
    
    public Jirafa(String nombre, int edad){
        super(nombre, edad);
    }
        @Override
    public void eat(){
        System.out.println(name + "está comiendo hojas de acacia");
    }
    
    public void trotar(){
        System.out.println(name + "esta trotando");
    }
}