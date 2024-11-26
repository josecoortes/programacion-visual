package Examen;

import java.util.Scanner;

public class Ejer5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[1mCALCULADORA DE TIEMPO");
        System.out.println("\033[1m--------------------");
        System.out.println("\033[1m--------------------\033[0m");
        System.out.println("Introduzca una cantidad de segundos: ");
        int num = sc.nextInt();
        int horas = num / 3600;
        int min = (num / 60) - (60 * horas);
        int seg = num - ((3600 * horas) + (60 * min));
        System.out.println(num + " Segundos son \033[48;5;11m" + horas + " horas\033[0m, \033[48;5;1m" + min
                + " minutos \033[0my \033[48;5;2m" + seg + " segundos.");
        sc.close();
    }
}
