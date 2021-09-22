package banco;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class Banco { 
 
    public static void main(String[] args) {
        Scanner sn= new Scanner(System.in);
        
        boolean salir = false;
        int opcion, i, pin;
        ArrayList<Cuenta>cuentas=new ArrayList<>();

        while(!salir){
            System.out.println("1) Crear una cuenta");
            System.out.println("2) Acceder a una cuenta");
            System.out.println("3) Salir");
            
            try{
                System.out.println("Su respuesta: ");
                opcion=sn.nextInt();

                switch(opcion){
                    case 1: 
                        System.out.println("Por favor, introduzca los datos:\n");
                        Cuenta usuario = new Cuenta(Captura.capturarCadena("Nombre"),Captura.capturarFlotante("Saldo"), Captura.capturarEntero("PIN"));
                        cuentas.add(usuario);
                        System.out.println("\nSu cuenta ha sido registrada\n");
                        break;
                    case 2: 
                        System.out.println("\nPara acceder a su cuenta, introduzca su PIN: ");
                        pin=Captura.capturarEntero("PIN");
                        for(i=0;i<cuentas.size();i++){
                            
                            if(pin==cuentas.get(i).getPin()){
                                System.out.println("Usted es "+cuentas.get(i).getNombre());
                                System.out.println("Su saldo es de "+cuentas.get(i).getSaldo()+" Pesos MX\n");

                                while(!salir){
                                    System.out.println("Que operacion desea realizar");
                                    System.out.println("1) Retiro de efectivo");
                                    System.out.println("2) Depositar");
                                    System.out.println("3) Salir");

                                    try{
                                        System.out.println("Seleccione: ");
                                        opcion=sn.nextInt();

                                        switch(opcion){
                                            case 1: 
                                                cuentas.get(i).retirar(Captura.capturarFlotante("Que cantidad desea retirar"));
                                                System.out.println("Saldo actual: "+cuentas.get(i).getSaldo()+" Pesos MX\n");
                                                break;
                                            case 2: 
                                                cuentas.get(i).depositar(Captura.capturarFlotante("Que cantidad desea depositar"));
                                                System.out.println("Saldo actual: "+cuentas.get(i).getSaldo()+" Pesos MX\n");
                                                break;
                                            case 3: 
                                                salir=true;
                                                break;
                                            default:
                                                System.out.println("ERROR! Seleccione un numero del 1 al 3");
                                        }
                                    }catch(InputMismatchException e){
                                        System.out.println("Debe seleccionar un numero");
                                        sn.next();
                                    }
                                }  
                            }
                            else
                                System.out.println("PIN no registrado");
                        }                            
                        break;
                    case 3: 
                        salir=true;
                        break;
                    default:
                        System.out.println("ERROR! Seleccione un numero del 1 al 3");
                }
            }catch(InputMismatchException e){
                System.out.println("Debe seleccionar un numero");
                sn.next();
            }
        }
    }
    
}