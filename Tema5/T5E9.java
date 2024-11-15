package Tema5;

import java.util.Scanner;
/*
 * 
 * Algoritmo que calculas los N PRIMEROs numeros de la 
 * serie de Fibonacci.
 * 
 * La serie de Fibonacci parte de los dso números 0 y 1 , y 
 * a partir de ahi los siguientes numeros de la serie son la suma de los dos anteriores, por ejemplo
 * 
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,....
 * 
 */
public class T5E9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        final int PRIMERO = 0;
        final int SEGUNDO = 1;
        int ultimo = 0;
        int penultimo = 0;
        int aux = 0;
        try {
            System.out.println("\033[1m PRIMEROS NÚMEROS DE LA SERIE DE FIBONACCI\033[0m");
            System.out.println("Introduzca un número");
            numero = sc.nextInt();

            /*
             * Calculamos la serie de Fibonacci
             * 
             * 
             */
            if (numero == 0) System.out.println (PRIMERO);
            else if (numero == 1) System.out.println (PRIMERO + " " + SEGUNDO);
            else {
                System.out.println (PRIMERO + " " + SEGUNDO );
                while (numero > 2 ){
                    aux = ultimo + penultimo;
                    penultimo = ultimo; 
                    ultimo = aux;

                    System.out.print(" " + ultimo );

                    //numero 
                    numero--;
                }
            }
        } catch (Exception e) {
            
        }finally {
            sc.close();
        }
    }
}
