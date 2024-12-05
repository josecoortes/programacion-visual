import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

         int base = 0;
        int exponente = 0;
        int potencia = 1;
        Scanner sc = new Scanner(System.in);

        // Leemos base y exponente de teclado:
        System.out.print("Introduzca base: ");
        base = sc.nextInt();
        System.out.print("Introduzca exponente: ");
        exponente = sc.nextInt();
        
        System.out.println(potencia);
        sc.close();
    }
}
