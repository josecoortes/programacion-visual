package Tema6;

import java.util.Random;

public class T6Ejemplo1 {

    public static void main(String[] args) {
        // Números entre [0,1) con decimales
        for (int i = 1; i < 11; i++) {
            System.out.println(Math.random());
        }

        // Números entre [0,10] numeros enteros
        for (int i = 1; i < 11; i++) {
            System.out.println((int) (Math.random() * 10) + 1);
        }

        // Numeros entre [3,7] numeros enteros
        for (int i = 1; i < 11; i++) {
            System.out.println((int) ((Math.random() * 4) + 3));
        }

        // Numeros entre [3,7] numeros enteros
        System.out.println((int) ((Math.random() * 5) + 3));
        final int CARAS_DADO_ROL = 12;
        /*
         * 
         * Para simular el lanzamiento de un daod, necesitamos obtener
         * un numero aleatorio en el intervalo [1,6]
         */

         System.out.println("Lanzamiento de dado : " + (int) (Math.random() * 6 + 1));

         /*
          * ALTERNATIVA 
          */
          Random rand = new Random();
          // Dado de 12 caras
          System.out.println("Lanzamiento de dado con clase random: " + (rand.nextInt(CARAS_DADO_ROL) + 1));

          //Intervalo entero [3,7]
          System.out.println("Lanzamiento de dado con clase random: " + (rand.nextInt(5) + 3));

    }
}
