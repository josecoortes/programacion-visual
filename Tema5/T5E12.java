package Tema5;

import java.util.Scanner;

public class T5E12 {
    public static void main(String[] args) {
        int base = 0;
        int exponente = 0;
        int potencia = 1;
        int numero = 1;
        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Introduce la base");
            base = sc.nextInt();
            System.out.println("introduce el exponete");
            exponente = sc.nextInt();
            for (int  i = 1; i <= exponente; i++ ){
               
                potencia = potencia * base;
                System.out.println(base + "^"+ numero +" = " + potencia );
                numero++;
              
            }
        } catch (Exception e) {
            
        }finally {
            sc.close();
        }
    }
}
