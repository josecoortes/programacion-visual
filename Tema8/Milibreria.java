package Tema8;

import java.util.Scanner;

public class Milibreria {
    public static int leerValor() {

        int numero = 0;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                numero = sc.nextInt();
                if (!(numero > 2)) {
                    System.out.println("Lo siento, el valor mínimo es 2");
                    System.out.print("Introduzca un nuevo valor: ");
                }
            } catch (Exception e) {
                System.out.println("ERROR: Debe ser un valor númerico entero");
            }
        }  while (!(numero > 2));

        sc.close();

        return numero;
    }

    public static int leerValorEntero() {

        int numero;
        boolean ok = false;
        Scanner sc = new Scanner(System.in);

        do {
            numero = sc.nextInt();
            ok = (numero > 2);
            if (!ok) {
                System.out.println("Lo siento, el valor mínimo es 2");
                System.out.print("Introduzca un nuevo valor: ");
            }
        } while (!ok);

        sc.close();

        return numero;
    }

}
