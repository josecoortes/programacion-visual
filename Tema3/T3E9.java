

import java.util.Scanner;

public class T3E9 {
      public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // Bienvenida
        System.out.println("Este programa calcula el area de un rectangulo");
        System.out.println("Introduce el primer numero: ");

        // lee el numero 1
        double altura = sc.nextDouble();
        // lee el numero 2
        System.out.println("Introduce el segundo numero");
        double radio = sc.nextDouble();
        
        double volumen = ((1d/3d)* (Math.PI * (radio * radio) * altura));
        // Imprime el resultado
        System.out.println("El volumen del cono es " + volumen);
        sc.close();
    }
}

