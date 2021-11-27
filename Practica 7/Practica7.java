package p7;

public class Practica7{

    public static void main(String[] args) {
        
        MagnumOpus magO = new MagnumOpus();
        MiniRobotCuchillos mr1 = new MiniRobotCuchillos();
        MiniRobotManosCalientes mr2 = new MiniRobotManosCalientes();
        int opcion;
        int tarea;
        int i=0;
        
        System.out.println("\nEmpecemos a preparar el platillo");
        do{
        opcion=0;
        tarea=0;
            do{
                System.out.println("\nSeleccione robot: ");
                System.out.println("1) " + magO.getNombre());
                System.out.println("2) " + mr1.getNombre());
                System.out.println("3) " + mr2.getNombre());
                opcion = CapturaEntrada.capturarEntero("Robot");
                if(opcion == 2 && mr1.tarearealizada||(opcion == 3 && mr2.tarearealizada)){
                    System.out.println("Este robot ya realizo una tarea");
                    opcion = CapturaEntrada.capturarEntero("Robot");
                }
                System.out.println();
            }while(opcion<=0||opcion>=5);
            do{
                System.out.println("Tarea que desea asignarle: ");
                System.out.println("1) Cortar los ingredientes");
                System.out.println("2) Cocinar");
                System.out.println("3) Servir plato");
                tarea = CapturaEntrada.capturarEntero("Tarea");
                if(!(tarea == (i+1))){
                    System.out.println("No se realizo la tarea anterior");
                    tarea = 0;
                }
                System.out.println();
            }while(tarea>=4||tarea<=0);
            if((opcion == 2 && tarea == 2)||(opcion==2 && tarea == 3)){
                String continuar = CapturaEntrada.capturarCadena("Este robot no es apto para realizar esta accion");
                opcion = 0;
                tarea = 0;
            }
            if((opcion == 3 && tarea ==1)||(opcion==3 && tarea ==3)){
                String continuar = CapturaEntrada.capturarCadena("Este robot no es apto para realizar esta accion");   
                opcion = 0;
                tarea = 0;
            }
            switch(opcion){
                case 1:{
                    switch(tarea){
                        case 1: {
                            System.out.println(magO.cortarAlimentos());
                            magO.setUltimaAccion("Preparar ingredientes");
                            break;
                        }
                        case 2:{
                            System.out.println(magO.cocinar());
                            magO.setUltimaAccion("Cocinar");
                            break;
                        }
                        case 3:{
                            System.out.println(magO.servirComida());
                            magO.setUltimaAccion("Servir");
                            break;
                        }
                    }
                }
                break;
                case 2:{
                    switch(tarea){
                        case 1: {
                            System.out.println(mr1.cortarAlimentos());
                            mr1.tareaC = true;
                            mr1.setUltimaAccion("Preparar ingredientes");
                            mr1.tarearealizada = true;
                            break;
                        }
                        case 2:{
                            System.out.println(mr1.cocinar());
                            mr1.tareaC = false;
                            mr1.setUltimaAccion("Cocinar");
                            mr1.tarearealizada = true;
                            break;
                        }
                        case 3:{
                            System.out.println(mr1.servirComida());
                            mr1.tareaC = false;
                            mr1.setUltimaAccion("Servir");
                            mr1.tarearealizada = true;
                            break;
                        }
                    }
                break;
                }
                case 3:{
                    switch(tarea){
                        case 1: {
                            System.out.println(mr2.cortarAlimentos());
                            mr2.tareaC = false;
                            mr2.setUltimaAccion("Preparar ingredientes");
                            mr2.tarearealizada = true;
                            break;
                        }
                        case 2:{
                            System.out.println(mr2.cocinar());
                            mr2.tareaC = true;
                            mr2.setUltimaAccion("Cocinar");
                            mr2.tarearealizada = true;
                            break;
                        }
                        case 3:{
                            System.out.println(mr2.servirComida());
                            mr2.tareaC = false;
                            mr2.setUltimaAccion("Servir");
                            mr2.tarearealizada = true;
                            break;
                        }
                    }
                break;    
                }
            }
        i++;
        }while(tarea!=3);
        
        if(mr1.getTarea() == null && mr2.getTarea() == null){
            System.out.println("¡Hurra! El plato estaba delicioso");
        }
        else if(mr1.getTarea() != null && mr2.getTarea() == null){
            if(mr1.tareaC == true){
                System.out.println("¡Hurra! El plato estaba delicioso");
            }
            else{
                System.out.println("Fallaste en uno de los pasos");
            }
        }
        else if(mr1.getTarea() == null && mr2.getTarea() != null){
            if(mr2.tareaC == true){
                System.out.println("¡Hurra! El plato estaba delicioso");
            }
            else{
                System.out.println("Fallaste en uno de los pasos");
            }
        }
        else if(mr1.tareaC == true && mr2.tareaC == true){
            System.out.println("¡Hurra! El plato estaba delicioso");
        }
        else if((mr1.tareaC == false && mr2.tareaC == true)||(mr1.tareaC == true && mr2.tareaC == false)){
            System.out.println("Fallaste en uno de los pasos");
        }
        else if(mr1.tareaC == false && mr2.tareaC == false){
            System.out.println("La comida fue un desastre :(");
        }
        magO.informacion();
        mr1.informacion();
        mr2.informacion();
    }
}