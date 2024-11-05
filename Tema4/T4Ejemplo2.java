package Tema4;

import java.util.Scanner;

public class T4Ejemplo2 {

    public static void main(String[] args) {
        //escaner
        Scanner sc  = new Scanner(System.in);

        //lee de teclado hasta que el numero sea negativo
        int contador = 0;
        int suma = 0;
        int  numero = sc.nextInt();
        do {
            contador++;
            suma = suma +  numero; 
            numero = sc.nextInt();
        } while (numero != 0);

        System.out.println("Se han introducido " + contador + "numero en total y " +
        "la suma de todos ellos es " + suma + ".");
        sc.close();
    
    }





    
}