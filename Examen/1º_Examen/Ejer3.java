package Examen;

import java.util.Scanner;

public class Ejer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[1mVOLUMEN DE UN TEROIDE");
        System.out.println("\033[1m--------------------");
        System.out.println("\033[1m--------------------\033[0m");
        System.out.println("\033[0mIntroduzca el radio mayor (cms)");
        double radioma = sc.nextDouble() ;
        System.out.println("Introduzca el radio menor (cms)");
        double radiome = sc.nextDouble();
        double volumen = (2 * (Math.PI * Math.PI) * radioma * (radiome * radiome)); 
       
        System.out.printf("El volumen del toroide es de \033[31m" + volumen + "\033[0m cm\u00B3");
        sc.close();
    }
}
