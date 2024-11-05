package Tema4;

import java.util.Scanner;
/**
 * Calculadora de horas ordinarias y horas extra de trabajo
 */
public class T4E3 {
    public static void main(String[] args) {
        // Declaraciones
        final float PRECIO_HORA = 12f;
        final float PRECIO_HORA_EXTRA = 16f;
        final int HORAS_LECTIVAS = 40;
        float horas;
        float sueldo;
        
        // Lee los numneros
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el número de horas trabajadas durante la semana: ");
        horas = sc.nextFloat();
        // Calcula el sueldo semanal
        if( horas <= HORAS_LECTIVAS){
            sueldo = horas * PRECIO_HORA;
            // Muestra el resultado por pantalla
            System.out.println("Tu sueldo es de " + sueldo);
        }
            else {
                sueldo = ((horas - HORAS_LECTIVAS) * PRECIO_HORA_EXTRA) + (HORAS_LECTIVAS * PRECIO_HORA) ;
                   // Muestra el resultado por pantalla
                System.out.println("El sueldo semanal que le corresponde es de " + sueldo);
            }
        sc.close();
    }
}