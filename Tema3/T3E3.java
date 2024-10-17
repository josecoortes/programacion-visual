

import java.util.Scanner;

public class T3E3 {
    public static void main(String[] args) {
        // Conversor de euros a pesetas
        // Constante que define el tipo de cambio
        final double TIPO = 166.386;
        // Definimos e iniciamos el escaner
        Scanner sc = new Scanner(System.in);
        // leer por teclado una cantidad de euros
        System.out.print("Introduce una cantidad en pesetas");
        double pesetas = sc.nextDouble();
        // Alternativa
        // double euros2 = double.parseDouble(sc.nextLine());
        // Calculamos el valor en pesetas
        double euros = pesetas / TIPO;

        // Salida por pantalla
        System.out.println(pesetas + " pesetas son " + euros + " euros.");
        sc.close();
    }
}
