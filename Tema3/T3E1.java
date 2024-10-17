import java.util.Scanner;

public class T3E1 {

    public static void main(String[] args) {
        // abrimos escaner
        Scanner sc = new Scanner(System.in);
        // Bienvenida
        System.out.println("Este programa multiplica dos numeros");
        System.out.println("Introduce el primer numero: ");

        // lee el numero 1
        int num1 = sc.nextInt();
        // lee el numero 2
        System.out.println("Introduce el segundo numero");
        int num2 = sc.nextInt();

        // Imprime el resultado

        System.out.println(num1 + " * " + num2 + " = " + num1 * num2);
        System.out.println();
        sc.close();
    }

}
