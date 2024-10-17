

import java.util.Scanner;

public class T3E10 {
      public static void main(String[] args) {
        // Conversor de MB a KB
        // Constante que define el tipo de cambio
        final double TIPO = 1024;
        // Definimos e iniciamos el escaner
        Scanner sc = new Scanner(System.in);
        // leer por teclado una cantidad de Mb
        System.out.print("Introduce una cantidad en Mb");
        double Mb = sc.nextDouble();
        // Calculamos el valor en Kb
        double Kb = Mb * TIPO;
        // Salida por pantalla
        System.out.println(Mb + " Mb son  " + Kb + " Kb.");
        sc.close();
    }
}
