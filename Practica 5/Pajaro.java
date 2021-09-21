
package practica5;

public abstract class Pajaro {
    String nombre, color, forma, especie, habilidad;
    
    public Pajaro(String nombre, String color, String forma, String especie, String habilidad)
    {
        setNombre(nombre);
        setColor(color);
        setForma(forma);
        setEspecie(especie);
        setHabilidad(habilidad);
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setForma(String forma){
        this.forma=forma;
    }
    public void setEspecie(String especie){
        this.especie=especie;
    }
    public void setHabilidad(String habilidad){
        this.habilidad=habilidad;
    }
    public String getNombre(){
        return nombre;
    }     
    public String getColor(){
        return color;
    } 
    public String getForma(){
        return forma;
    } 
    public String getEspecie(){
        return especie;
    } 
    public String getHabilidad(){
        return habilidad;
    } 
    public abstract void getAtacar(); 
    public abstract void getEstrellarse(); 
}
