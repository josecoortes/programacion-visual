package Tema5;

import java.util.Scanner;

public class T5E8 {
    public static void main(String[] args) {
        //declaraciones
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        try{
            System.out.println("Introduzca un numero: ");
            numero = sc.nextInt();

            //pinta cabecera tabla
            System.out.println("   n   |   n2   |   n3");
            System.out.println("---------------------------");
            System.out.println();

            //Calcula y pinta las potencias de los 5 siguientes números
            for(int i = 1; i <= 5; i++) {
                System.out.printf(" %4d  |  %4d  |  %4d  \n", numero, (numero*numero), (numero*numero*numero));
                numero++;
            }




        } catch (Exception e){
            System.out.println("ERROR: Se debe introducir un valor numerico");

        } finally{
            sc.close();
        }
    }
}
