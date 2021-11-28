package p8;

public class Veterinario {
    private String nombre;
    private double salario;
    
    public Veterinario(String nombre, double salario){
        setSalario(salario);
        setNombre(nombre);
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSalario(){
        return salario;
    }
    public String getNombre(){
        return nombre;
    }
    
    public void vacunar(Animal a){
        a.setVacunacion(true);
    }
    
    public void revisarAnimal(Animal a){
        if(a.vacunado){
            System.out.println(a.name + " está vacunado");
        }
        else{
            System.out.println(a.name + " no está vacunado");
        }
    }       
}