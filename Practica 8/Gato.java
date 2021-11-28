package p8;

public class Gato extends Animal{
    
        public Gato(String name, int age){
        super(name,age);
        
        }
       
        @Override
        public void eat(){
            System.out.println("Gato " + name + " is eating fish");
        }
        
        public void maullar(){
            System.out.println("Gato " + name + " hace miau");
        }
}