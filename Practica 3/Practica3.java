package prac3; 

public class Practica3 {

    public static void main(String[] args) {
        
        Mexicano mexican[]=new Mexicano[3];
        int i;
        
        System.out.println("Por favor, introduzca los datos de las 3 personas:\n");
        for(i=0;i<3;i++)
            mexican[i]= new Mexicano(CE.cCad("Nombre"),CE.cCad("Apellido Paterno"),CE.cCad("Apellido Materno"),CE.cCad("Dia"),CE.cCad("Mes"),CE.cCad("Anio"),CE.cCad("Genero"),CE.cCad("Estado"));
        
        System.out.println("\nCURP del Mexicano 1: \n");
        System.out.println(mexican[0].getCurp());
        System.out.println("\nRFC del Mexicano 2: \n");
        System.out.println(mexican[1].getRfc());
        System.out.println("\nCURP Y RFC del Mexicano 3: \n");
        System.out.println("CURP: "+mexican[2].getCurp());
        System.out.println("RFC: "+mexican[2].getRfc());
    }
    
}
