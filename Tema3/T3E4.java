

import java.util.Scanner;

public class T3E4 {
    public static void main(String[] args) {
        
    //Este programa realiza las 4 opèraciones baiscas de dos numeros decimales
     Scanner sc = new Scanner(System.in);
        // Bienvenida
        System.out.println("Este programa multiplica dos numeros");
        System.out.println("Introduce el primer numero: ");

        // lee el numero 1
        double num1 = sc.nextDouble();
        // lee el numero 2
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        
        //Almacenamos las operaciones en varibles
        double suma = num1 + num2;
        double resta = num1 - num2;
        double division = num1 / num2;
        double multiplicacion = num1 * num2;
        // Imprime el resultado
        if (num2 > 0) {
            
        
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " / " + num2 + " = " + division );
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
         } else 
            System.out.println("no se puede realizar la division con ese numero");
    
        sc.close();
    }
}
