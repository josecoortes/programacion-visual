package Examen;

import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\033[1mTANGO MODAS");
        System.out.println("\033[1m--------------------");
        System.out.println("\033[1m--------------------\033[0m");
        System.out.println("Introduzca código de articulo: ");
       int articulo = sc.nextInt() ;
        System.out.println("Introduce precio: ");
       double preciouni = sc.nextDouble();
        System.out.println("Introduce unidades vendidas: ");
       int unidades = sc.nextInt();
        System.out.println("Introduce descuento (%): ");
       int descuento = sc.nextInt();
        System.out.println("");
        System.out.println("Su ticket: ");
        System.out.println("");
        System.out.println("\033[1mTANGO MODAS");
        System.out.println("\033[1m--------------------");
        System.out.println("\033[1m--------------------\033[0m");
        System.out.println(articulo + "\t\t" + preciouni + "€");
       double precio = unidades * preciouni;
        System.out.println( unidades + " Unidades\t" + precio);
       double  preciodes = precio * descuento/100;
        System.out.println("-" + descuento + "%\t\t-" + preciodes );
       double precioiva = precio * 0.16;
       System.out.println("16% IVA\t\t" + precioiva);
       double preciofin = ((precio + precioiva) - preciodes);
       System.out.println("\033[48;5;8mTOTAL\t\t\033[0m" + preciofin);
    sc.close();

    }
}
