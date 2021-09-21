package practica5;

public class Chuck extends Pajaro{
    public Chuck(){
        super("Chuck","Amarillo","Triangular","Canario","Aumento de velocidad y destruye facilmente la madera");
    }	
    public void getAtacar(){
	System.out.print("\nSale volando y aumenta la velocidad en el aire");
    }
    public void getEstrellarse(){
	System.out.print("\nElimina toda la madera, genera +500 de daño");
    }
} 