package Examen;

import java.util.Scanner;

public class Ejer2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[1mVUELTAS DE LA TIERRA");
        System.out.println("\033[1m--------------------");
        System.out.println("\033[1m--------------------\033[0m");
        System.out.println("Introduzca un número de años: ");
        double dias = sc.nextDouble() ;
        double conversor = 365;
        double vueltas = dias * conversor;
        System.out.println("La tierra habrá dado un total de " + vueltas + " Vueltas en " + dias + " años");
        sc.close();
    }
}