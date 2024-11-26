package Tema5;

import java.util.Scanner;

public class T5E17 {
    public static void main(String[] args) {

        // declaraciones
        String relleno = "";
        int altura = 0;
        Scanner sc = new Scanner(System.in);
        while (altura <= 0) {
            try {
                // entradas por teclado altura
                System.out.println("introduzca altura de las piramides: ");
                altura = sc.nextInt();
                if (altura <= 0) {
                    System.out.println("ERROR!: la altura debe de ser un entero positivo.");
                }

            } catch (Exception e) {
                System.out.println("ERROR!: la altura debe de ser un entero positivo.");
                sc.nextLine();
            } finally {
                sc.nextLine();
            }
        }

        // entradas por teclado del caracter de relleno
        while (relleno.length() != 1) {

            System.out.println("Introduca el caracter de relleno: ");
            relleno = sc.nextLine();
            if (relleno.length() !=1){
                System.out.println("ERROR: el caracter de relleno debe ser de longitud 1.");
            }
        }

        //cerrar escaner
        sc.close();

        //pintar la piramide
        int base =2  *  altura- 1;
        int espaciosBlanco = base / 2;
        String huecos = "";
        String fila = relleno;
        for (int i = 1; i <= altura; i++){
            for (int blancos = 1; blancos <= espaciosBlanco; blancos++){
                System.out.print(" ");
            }
            System.out.println(fila);                           // Imprime la fila actual
            espaciosBlanco -= 1;                                // Resta un espacio a la izquiera
            if (i == 1){
                huecos = huecos + " ";  
            } else {
                huecos = huecos + "  ";
                
            }
            fila = relleno + huecos + relleno;
            //truco usando la libreri String
          //  if ( i == altura -1 ){
              // fila = fila.replace(' ',  relleno.charAt(0));
           // }
            
    }
    }
}

