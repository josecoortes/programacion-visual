

import java.util.Scanner;

public class T3E7 {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // Bienvenida
        System.out.println("Este programa calcula el precio total sumandole el IVA mediante la base imponible");
        System.out.println("Introduce el primer numero: ");
        // lee el numero 1
        double num1 = sc.nextDouble();
        //Calcula el precio con el IVA
        double precio = num1 + (num1*0.21);
        // Imprime el resultado
        System.out.printf("precio total con IVA son %.2f" , precio);
        sc.close();
       
    }
}

