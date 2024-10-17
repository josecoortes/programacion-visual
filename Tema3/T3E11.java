

import java.util.Scanner;

public class T3E11 {
    public static void main(String[] args) {
        // Conversor de KB a MB
        // Constante que define el tipo de cambio
        final double TIPO = 1024;
        // Definimos e iniciamos el escaner
        Scanner sc = new Scanner(System.in);
        // leer por teclado una cantidad de Mb
        System.out.print("Introduce una cantidad en Mb");
        double kb = sc.nextDouble();
        // Calculamos el valor en Kb
        double mb = kb / TIPO;
        // Salida por pantalla
        System.out.println(kb + " Kb son  " + mb + " Mb.");
        sc.close();
    }
}
