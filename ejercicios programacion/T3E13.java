

import java.util.Scanner;

public class T3E13 {
    public static void main(String[] args) {
        // Conversor de seg a dias
        // Constante que define el tipo de cambio
        final long TIPO = 86400;
        System.out.println("\033[1mSEGUNDOS QUE TIENE UN DIA");
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        // Definimos e iniciamos el escaner
        Scanner sc = new Scanner(System.in);
        // leer por teclado una cantidad de dias
        System.out.print("Introduce una cantidad de dias");
        long dias = sc.nextLong();
        // Calculamos el valor en seg
        long seg = dias * TIPO;
        // Salida por pantalla
        System.out.println(dias + " dias equivalen a  " + seg + " segundos.");
        sc.close();
  }
}
