package p8;

public class Practica8 {

    public static void main(String[] args) {
         
      int op;
      Zoo zoo = new Zoo();
      do{
        System.out.println("Seleccione una opcion: ");
        System.out.println("1) Agregar animal");
        System.out.println("2) Eliminar animal");
        System.out.println("3) Mostrar animales");
        System.out.println("4) Salir");
        op = CapturaEntrada.capturarEntero("Opcion");
        switch(op){
         case 1:{
             zoo.agregarAnimal(CapturaEntrada.capturarCadena("Animal que desea agregar"));
            break;
            }
         case 2:{
             zoo.quitarAnimal();
             break;
            }
         case 3:{
             zoo.imprimirAnimales();
             break;
            }
        }
        }while(op!=4);
        /*
        Animal a = new Animal(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
        Perro p = new Perro(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
        Gato g = new Gato(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
        
        a.eat(); //principal
        a.sleep();//principal
        p.eat();//principal
        p.sleep(); //secundaria
        g.eat();//principal
        g.sleep();//secundaria 
       */ 
      /*
      Animal animal = new Perro(CapturaEntrada.capturarCadena("Nombre"),CapturaEntrada.capturarEntero("Edad"));
      animal.sleep();
      animal.eat();
      */
      /*
      Animal[] animalArray = new Animal[3];
      animalArray[0] = new Animal("An animal",1);
      animalArray[1] = new Perro("Polo",4);
      animalArray[2] = new Gato("Miou",7);
      
      for(Animal a: animalArray){
          a.eat();
          a.sleep();
          if(a instanceof Perro){
              ((Perro) a ).ladrar();
          }
      }
      */
    }
}