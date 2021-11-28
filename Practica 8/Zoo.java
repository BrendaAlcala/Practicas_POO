package p8;
import java.util.ArrayList;

public class Zoo {
    
    private ArrayList<Animal> animales = new ArrayList<>();
    private Veterinario v = new Veterinario(CapturaEntrada.capturarCadena("Nombre del veterinario"),CapturaEntrada.capturarDoble("Salario"));
    
    public void agregarAnimal(String animal){
        
        animal = animal.trim().toLowerCase();
        Animal a = null;
        switch(animal){
            case "perro" : {
             a = new Perro(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
             break;
            }
            case "gato" : {
             a = new Gato(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
             break;
            }
            case "jirafa" : {
              a = new Jirafa(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad")); 
              break;
            }
            case "cebra" : {
                a = new Cebra(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
                break;
            }
            case "caballo" : {
                a = new Caballo(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
                break;
            }
            case "vaca" : {
                a = new Vaca(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
                break;
            }
            default : {
                System.out.println("Animal no encontrado");
            }
        }
        if(a!=null){
            animales.add(a);
        }
    }
    
    public void imprimirAnimales(){
        for(Animal a: animales){
            a.eat();
            a.sleep();
            v.vacunar(a);
            v.revisarAnimal(a);
            if(a instanceof Perro){
                ((Perro)a).ladrar();
            }
            else if(a instanceof Gato){
                ((Gato)a).maullar();
            }
            else if(a instanceof Caballo){
                ((Cebra)a).galopar();
            }
            else if(a instanceof Caballo){
                ((Caballo)a).relinchar();
            }
            else if(a instanceof Jirafa){
                ((Jirafa)a).trotar();
            }
            else if(a instanceof Vaca){
                ((Vaca)a).mugir();
            }
            System.out.println();
        }
    }
    
    public void quitarAnimal(){
        int i = 1, op;
        
        for(Animal a: animales){
            
            System.out.println("Numero del animal: " + i);
            System.out.print(a.name + "\n");
            i++;
        }
        op = CapturaEntrada.capturarEntero("Introduzca el numero del animal que desea eliminar");
        animales.remove((op-1));
        System.out.println("Animal borrado exitosamente");
    }
}