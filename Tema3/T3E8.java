
import java.util.Scanner;

public class T3E8 {
    public static void main(String[] args) {
        // calculamos el dinero que le pertenece segun las horas que ha trabajado
        // Constante que define el tipo de cambio
        final int TIPO = 12;
        // Definimos e iniciamos el escaner
        Scanner sc = new Scanner(System.in);
        // leer por teclado una cantidad de horas
        System.out.print("Introduce el numero de horas semanales que ha trabajado");
        int horas = sc.nextInt();
      
        // Calculamos el valor en pesetas
        int euros = horas * TIPO;

        // Salida por pantalla
        System.out.println( horas + " horas son " + euros + " euros.");
        sc.close();
    }
}
