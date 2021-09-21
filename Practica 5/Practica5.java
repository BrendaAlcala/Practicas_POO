package practica5;

public class Practica5 {

    public static void main(String[] args) {
        int i;
        Pajaro bird[] = new Pajaro[3];
        bird[0] = new Blues(); 
	bird[1] = new Bomb();
	bird[2] = new Chuck();
        
        System.out.println();
        for(i=0;i<3;i++)
        {
            System.out.println("\n\nPajaro "+(i+1));
            System.out.println("\nNombre: "+bird[i].getNombre());
            System.out.println("\nColor: "+bird[i].getColor());
            System.out.println("\nForma: "+bird[i].getForma());
            System.out.println("\nEspecie: "+bird[i].getEspecie());
            System.out.println("\nHabilidad: "+bird[i].getHabilidad());
            bird[i].getAtacar();
            bird[i].getEstrellarse();
        }
    }
    
}
