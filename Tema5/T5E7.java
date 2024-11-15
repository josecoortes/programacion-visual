package Tema5;

import java.util.Scanner;

public class T5E7 {
    
    public static void main(String[] args) {
        // Declaraciones

        int valor = 0;
        int numero = 0;
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        // menu

        System.out.println("Este programa calcula la media de los números positivos introducidos.");
        System.out.println("Para parar, introduce un número negativo");
        System.out.println("Vaya introduciendo números: ");
        do {
                try {
                    numero = sc.nextInt();
                    if (numero >= 0) {
                        valor += numero;
                        contador++;
                    }
                } catch (Exception e) {
                    System.out.println("ERROR: sólo deben de poner valores numericos. Intentalo de nuevo. ");
                    sc.nextLine();
                }
            } while (numero >= 0);

            //calculamos media 
            float media = valor / contador;
            System.out.println("la media de los numeros introducidos es: " + media);
            sc.close();
        }
    }


