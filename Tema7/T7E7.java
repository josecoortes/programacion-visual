package Tema7;

import java.util.Random;
import java.util.Scanner;

public class T7E7 {
    public static void main(String[] args) {
        //declaraciones
        int numero[] = new int [100];
        String auxiliar[] = new String[100];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i< numero.length; i++){
            numero[i] = rand.nextInt(21);
            
        }
        for(int i = 0; i < numero.length; i++){
            System.out.print(numero[i] + " ");
        }
        System.out.println("");
        System.out.println("¿Que numero quieres cambiar");
        int ocurrencias = sc.nextInt();
        System.out.println("¿Por qué numero quieres cambiarlo");
        int sustituto = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i< numero.length; i++) {
            String sNum = "";

            if (numero[i] == ocurrencias) {
                sNum = "\"" + sustituto +"\"";
            }

            auxiliar[i] = String.valueOf(numero[i]);

            System.out.println("");
            for (String num : auxiliar) {
                System.out.print( num + " ");
            }
        }
        sc.close();         
    }
    
   }

