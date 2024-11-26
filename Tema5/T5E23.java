package Tema5;

import java.util.Scanner;

public class T5E23 {
    public static void main(String[] args) {

        // declaraciones
        int numero = 0;
        int digito = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        // lee el numero por teclado
        while (numero == 0) {
            try {
                System.out.println("Introduzca un numero entero: ");
                numero = sc.nextInt();
            } catch (Exception e) {
                System.out.println("ERROR: Se debe introducir un número entero");
                sc.nextLine();
            }
        }
        // lee el digito por teclado
        while (digito / 10 != 0) {
        try {
            System.out.println("Introduce un digito: ");
            digito = sc.nextInt();
            if (digito / 10 != 0) {
                System.out.println("ERROR: Se debe introducir digito de una sola cifra");
            }
        } catch (Exception e) {
            System.out.println("ERROR: Se debe introducir un número entero");
            sc.nextLine();

        }
    }
        // sc.nextLine();

        int numeroInv = 0;
        int numOriginal = numero;
        String posicionesActuale = "";
        while (numero / 10 != 0) {
            numeroInv = (numeroInv * 10) + numero % 10;
            numero = numero / 10;
        }
        numeroInv = (numeroInv * 10) + numero % 10;
        // Dividimos progresivamente entre 10 hasta quedarnos sin número
        int i = 0;
        while (numeroInv / 10 != 0) {
            int digitoActual = numeroInv % 10;
            numeroInv = numeroInv / 10;
            i++;
            if (digitoActual == digito) {
                posicionesActuale += i + " ";
            }
        }
        if (numeroInv == digito) {
            posicionesActuale += i + 1;
        }
        if (i == 1) {
            System.out
                    .println("Contando de izquierda a derecha,el " + digito + " no aparece en el numero " + numOriginal);
        } else {
            System.out.println("Contando de izquierda a derecha,el " + digito + " aparece dentro de " + numOriginal +
                    " en las siguientes posiciones: " + posicionesActuale);
            sc.close();
        }
    }
}


