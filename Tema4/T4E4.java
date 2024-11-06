package Tema4;

import java.util.Scanner;

public class T4E4 {
    public static void main(String[] args) {
        System.out.println("El programa resuelce ecuaciones de primer grado (del tipo ax + b = 0)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el valor de a");
        double a = sc.nextDouble();
        System.out.println("Introduzca el valor de b");
        double b = sc.nextDouble();
        if (a == 0 ){
           System.out.println("Esta ecuacion no tiene solucion real.");
        } else {
            double x = -b /a;
            System.out.println("El valor de x es " + x );
        }
        sc.close();
    }
}
