package Tema5;

import java.util.Scanner;

public class T5E11 {
    public static void main(String[] args) {
        //declaraciones 
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int exponente = 0;
        int potencia = 1;
       try {
        //leemos base y exponente por teclado
        System.out.println("Introduce la base");
        base = sc.nextInt();
        System.out.println("introduce el exponete");
        exponente = sc.nextInt();

        //calculamos la potencia
        for (int i = 1; i <= exponente; i++) {
            potencia = potencia * base;
        }
        System.out.println("La potencia basae " + base + " y exponente " + exponente + " es " + potencia + ".");
       }
        catch (Exception e) {
        System.out.println("ERROR!! debe de introducir un caracter númerico");
        } finally {
            sc.close();
        }



    }
}
