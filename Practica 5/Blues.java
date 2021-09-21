package practica5;

public class Blues extends Pajaro {
    public Blues(){
        super("Blues","Azul","Circular","Azulejos","Dividirse en 3 y romper con facilidad el cristal");
    } 
    public void getAtacar(){
	System.out.print("\nSale volando y a los dos segundos se divide en 3");
    }
    public void getEstrellarse(){
	System.out.print("\nCada pajaro genera +150 de daño a los objetos cercanos, destruye todo el cristal");
    }
}
