
import java.util.Scanner;

public class T3E15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Bienvenida
       System.out.println("\033[1mCALCULADORA DE MEDIDAS IMPERIALES\033[0m");
       System.out.println("--------------------------");
       System.out.println("--------------------------");
       System.out.println("Introduce una longitud en metros:");
       final double TIPO1 = 1.09361;
       final double TIPO2 = 39.3701;
       final double TIPO3 = 3.28084;
       // lee el numero 1
       double metros = sc.nextDouble();
       //Calculamos las diferentes medidas
       double pulgadas = metros * TIPO2;
       double yardas = metros * TIPO1;
       double pies = metros * TIPO3;
       //mostramos el resultado
       System.out.println("\033[1m" + metros + "metros \033[0m son:\n");
       System.out.printf("\033[43m" + pulgadas + "pulgadas\033[0m\n");
       System.out.printf("\033[42m " + pies + "pies\033[0m\n");
       System.out.printf("\033[41m" + yardas + "yardas\033[0m\n");
       sc.close();
    }

       
   }