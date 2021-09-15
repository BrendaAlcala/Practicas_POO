package prac3;


import java.util.Scanner;

public class CE {
    public static String cCad(String msg){
        Scanner sc = new Scanner(System.in);
        System.out.print(""+msg+": ");
        return (sc.nextLine());
    }
}