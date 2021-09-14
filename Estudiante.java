package practica2.poo;

public class Estudiante {
    String nombre, materia, estado;
    int numControl, cali;
    
    public Estudiante(String nombre, String materia, int numControl, int cali)
    {
        setNombre(nombre);
        setMateria(materia);
        setNumControl(numControl);
        setCali(cali);
        AsignarEstado();
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public void setMateria(String materia){
        this.materia=materia;
    }
    
    public void setNumControl(int numControl){
        this.numControl=numControl;
    }
    
    public void setCali(int cali){
        this.cali=cali;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getMateria(){
        return materia;
    }
    
    public int getNumControl(){
        return numControl;
    }
    
    public int getCali(){
        return cali;
    }
    
    //Metodo AsignarEstado
    public String AsignarEstado(){
        if(cali<60)
            estado="Reprobado";
        else
            if(cali<=100 && cali>=0)
                estado="Aprobado";
            else
                estado="Calificacion fuera del rango 0-100";
        return estado;
    }
    //Metodo cambiarCalificacion
    public void CambiarCalificacion(int cambioCali)
    {
        cali=cambioCali;
    }    
}