package p9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Leer{
    
    public int calificaciones[] = new int[21];
    
    public void leerArchivoCSV(){
        
        String line;
        String path = "C:\\Users\\brend\\Downloads\\practica9.csv";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            try {
                while((line = br.readLine())!= null){
                    String numeros[] = line.split(",");
                    numeros[0] = String.valueOf(numeros[0].charAt(1)) + String.valueOf(numeros[0].charAt(2));
                    for(int i = 0; i<numeros.length;i++){
                        calificaciones[i] = Integer.parseInt(numeros[i]);
                    }
                }
            } catch (IOException ex) { 
                    System.out.println("No se puede leer el archivo, error " + ex);
            }
        }
        catch(FileNotFoundException e){ 
            System.out.println("No se puede abrir el archivo, error " + e);
        }
    }
}