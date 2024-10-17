
import java.util.Scanner;

public class T3E2 {

    public static void main(String[] args) {
        // Conversor de pesetas a euros
        // Constante que define eltipo de cambio
        final double TIPO = 166.386;
        // Definimos e iniciamos el escaner
        Scanner sc = new Scanner(System.in);
        // leer por teclado una cantidad de euros
        System.out.print("Introduce una cantidad en euros");
        double euros = sc.nextDouble();
        // Alternativa
        // double euros2 = double.parseDouble(sc.nextLine());
        // Calculamos el valor en pesetas
        double pesetas = euros * TIPO;

        // Salida por pantalla
        System.out.println(euros + " € son " + pesetas + " pesetas.");
        sc.close();
        System.out.println("la madre de joaqui esta buena");
    }
}