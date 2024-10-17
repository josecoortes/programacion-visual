
import java.util.Scanner;

public class T3E5 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        // Bienvenida
        System.out.println("Este programa calcula el area de un rectangulo");
        System.out.println("Introduce el primer numero: ");

        // lee el numero 1
        double num1 = sc.nextDouble();
        // lee el numero 2
        System.out.println("Introduce el segundo numero");
        double num2 = sc.nextDouble();
        
        double area = num1 * num2;
        // Imprime el resultado
        if (num2 > 0) {
            
        
        System.out.println(num1 + " * " + num2 + " = " + area + "cm2");
        
         } else 
            System.out.println("no se puede realizar el calculo con ese numero");
    
        sc.close();
    }
}

