package Tema4;

import java.util.Scanner;

public class T4pruebaSentenciaCadenas2 {
    public static void main(String[] args) {
        System.out.println("Indicame la nota obtenida");
        Scanner sc = new Scanner(System.in);
        
        int nota = sc.nextInt();

        //Sentencia de selección encadenadas
        if(nota<5){
            System.out.println("Suspenso");
        }
            else if(nota == 5){
                System.out.println("aprobado");
            }
            else if (nota == 6){
                System.out.println("Bien");
            }
            else if (nota == 7 || nota == 8){
                System.out.println("notable");
            }
            else if (nota == 9 || nota == 10){
                System.out.println("Sobresaliente");
            }
            else {
                System.out.println("Nota invalida");
            }
            sc.close();
        }
    }
