package p9;

import java.util.Scanner;

public class CapturaEntrada {

    public static String capturarCadena(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
}