package Prac1_POO;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Prac1_POO {

    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        
        boolean salir = false;
        int opcion,i,suma=0, caliBaja, caliAlta;
        int[] calificaciones=new int[5];
        String [] nombres=new String[5];
        float promedio;
        
        while(!salir){
            System.out.println("1) Capturar nombres y calificaciones");
            System.out.println("2) Imprimir calificaciones y promedio de calificaciones");
            System.out.println("3) Imprimir calificaciones y calificacion mas baja");
            System.out.println("4) Imprimir calificaciones y calificacion mas alta");
            System.out.println("5) Salir");
            
            try{
                System.out.println("Su respuesta: ");
                opcion=sn.nextInt();

                switch(opcion){
                    case 1: 
                        for(i=0;i<5;i++)
                        {
                            System.out.println((i+1)+". Nombre: ");
                            nombres[i]=sn.next();
                            System.out.println(" Calificacion: ");
                            calificaciones[i]=sn.nextInt();
                            if(calificaciones[i]<0 || calificaciones[i]>100)
                            {
                                System.out.println("Ingrese una calificacion valida, entre 1 y 100");
                                break;
                            }
                            suma+=calificaciones[i];
                        }
                        break;
                    case 2: 
                        for(i=0;i<5;i++)
                        {
                            System.out.println(" Calificaciones: ");
                            for(i=0;i<5;i++)
                            {
                                System.out.println("Nombre: "+nombres[i]+" - Calificacion: "+calificaciones[i]);
                            }
                            promedio=suma/5;
                            System.out.println("Promedio: "+promedio);
                        }
                        break;
                    case 3: 
                        for(i=0;i<5;i++)
                        {
                            System.out.println(" Calificaciones: ");
                            caliBaja=calificaciones[0];
                            for(i=0;i<5;i++)
                            {
                                System.out.println(calificaciones[i]);
                                
                                if(caliBaja>calificaciones[i])
                                   caliBaja = calificaciones[i];
                            }
                            System.out.println("Calificacion mas baja: "+caliBaja);
                        }
                        break;
                    case 4:
                        for(i=0;i<5;i++)
                        {
                            System.out.println(" Calificaciones: ");
                            caliAlta=calificaciones[0];
                            for(i=0;i<5;i++)
                            {
                                System.out.println(calificaciones[i]);
                                
                                if(caliAlta<calificaciones[i])
                                   caliAlta = calificaciones[i];
                            }
                            System.out.println("Calificacion mas alta: "+caliAlta);
                        }
                        break;
                    case 5:
                        salir=true;
                        break;
                    default:
                        System.out.println("ERROR! Seleccione un numero del 1 al 5");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe seleccionar un numero");
                sn.next();
            }
        }
    }
}
