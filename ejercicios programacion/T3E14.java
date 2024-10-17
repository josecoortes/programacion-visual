

import java.util.Scanner;

public class T3E14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       // Bienvenida
       System.out.println("\033[1mVOLUMEN DE UNA ESFERA");
       System.out.println("--------------------------");
       System.out.println("--------------------------");
       System.out.println("Introduce el radio de la esfera (cms):");
       
       // lee el numero 1
       double radio = sc.nextDouble();
       double volumen = ((4/3) * Math.PI * (radio * radio * radio));
       // Imprime el resultado
       System.out.println("El volumen del teroide es de \033[31m" + volumen + "\033[0m cm\u00B3");
       sc.close();
   }
}
