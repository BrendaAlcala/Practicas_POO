package p8;

public class Perro extends Animal{
    
    public Perro(String name, int age){
        super(name,age);
    }
    
    @Override
    public void eat(){
        System.out.println("Perro " + name + " is eating chicken");
    }
    public void recogerPelota(){
        System.out.println(name + " recogio la pelota");
    }
    public void ladrar(){
        System.out.println(name+ " Woof");
    }
}