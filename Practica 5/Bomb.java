package practica5;

public class Bomb extends Pajaro {
    public Bomb(){
        super("Bomb","Negro","Circular","Cuervo","Explota y destruye facilmente la piedra");
    }
    public void getAtacar() {
	System.out.print("\nSale volando y cuando se impacta explota");
    }
    public void getEstrellarse(){
	System.out.print("\nSu explosion destruye todo en un diametro de 10 metros, elimina todas las piedras");
    }
}
