package practica2.poo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2POO {

    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        
        boolean salir = false;
        int opcion, i;
        Estudiante alumno[]=new Estudiante[10];
        
        alumno[0]=new Estudiante("Brenda","Matematicas",150037,89);
        alumno[1]=new Estudiante("Polo","Ingles",172583,72);
        alumno[2]=new Estudiante("Pancho","Quimica",162543,58);
        alumno[3]=new Estudiante("Cindy","Geografia",144525,97);
        alumno[4]=new Estudiante("Jocy","Biologia",123065,98);
        
        while(!salir){ 
            System.out.println("1) Capturar alumnos");
            System.out.println("2) Mostrar alumnos");
            System.out.println("3) Cambiar calificacion");
            System.out.println("4) Salir");
            
            try{
                System.out.print("Su respuesta: ");
                opcion=sn.nextInt();

                switch(opcion){  
                    case 1: 
                        for(i=5;i<10;i++)
                        {
                            System.out.println("\nAlumno "+(i+1)+":");
                            alumno[i]=new Estudiante(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarCadena("Materia"),CapturaEntrada.capturarEntero("NumControl"),CapturaEntrada.capturarEntero("Cali"));
                        }
                        break;
                    case 2: 
                        System.out.println("A continuacion se muestra la informacion de todos los alumnos: \n");
                        for(i=0;i<10;i++)
                        {
                            System.out.println("\nAlumno "+(i+1)+": "+alumno[i].getNombre());
                            System.out.println("Numero de control: "+alumno[i].getNumControl());
                            System.out.println("Materia: "+alumno[i].getMateria());
                            System.out.println("Calificacion: " +alumno[i].getCali());
                            System.out.println("Estado de la materia: "+alumno[i].AsignarEstado());
                        }
                        break;
                    case 3: 
                        System.out.println("Introduzca el numero del alumno que quiere modificar (1-10): \n");
                        i =sn.nextInt();
                        alumno[i-1].setCali(CapturaEntrada.capturarEntero("Introduzca la nueva calificacion: "));
                        System.out.println("\nLa nueva calificacion se ha actualizado\n");
                        break;
                    case 4:
                        salir=true;
                        break;
                    default:
                        System.out.println("ERROR! Seleccione un numero del 1 al 4");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe seleccionar un numero");
                sn.next();
            }
        }
    }
}