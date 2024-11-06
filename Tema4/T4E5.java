package Tema4;

import java.util.Scanner;

public class T4E5 {
    public static void main(String[] args) {
        System.out.println("Calculo del tiempo de caida de un objeto");
        final double g = 9.81;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la altura (en metros) desde la que cae el objeto:");
        double altura = sc.nextFloat();
        double tiempo = Math.sqrt((altura * 2 ) / g);
        System.out.printf("El objeto tardara %.2f " , tiempo , "segundos");
    }
}
