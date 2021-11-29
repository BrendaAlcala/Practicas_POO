package p9;

import java.io.Serializable;

public class Alumno implements Serializable{
    float calificaciones[] = new float[7];
    private String nombre;
    private String matricula;
    float promedio;
    
    public Alumno(){
          setNombre(CapturaEntrada.capturarCadena("Introduzca nombre del alumno"));
          setMatricula(CapturaEntrada.capturarCadena("Introduzca matricula"));
    }
    public void calcularPromedio(){
        promedio=0;
        for(int i=0;i<calificaciones.length;i++){
            promedio+=calificaciones[i];
        }
        promedio/=calificaciones.length;
    }
    public void mostrarAlumno(){
        System.out.println("\nNombre: " + nombre);
        System.out.println("Matricula: " + matricula);
        System.out.println("Calificaciones: ");
        for(int i=0;i<calificaciones.length;i++){
            System.out.println(calificaciones[i]);
        }
        System.out.println("Promedio: " + promedio);
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setMatricula(String m){
        matricula = m;
    }
    public String getNombre(){
        return nombre;
    }
    public String getMatricula(){
        return matricula;
    }
}