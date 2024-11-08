package Tema5;

import java.util.Scanner;

public class T5E4 {
    public static void main(String[] args) {
        //declaraciones
        final int OPORTUNIDADES = 4;
        int contador = 1;
        String combinacion = "0000";
        boolean acierto = false;
        Scanner sc = new Scanner(System.in);
        /*
         * Este switch rellena de 0 a la izquiera la combinacion en caso de que hayamos pueso menos de 4 numeros
         * 
         * 
         */
        switch (combinacion.length()) {
            case 1: 
            combinacion = "000" + combinacion;
                break;
            case 2:
            combinacion = "00" + combinacion;
                break;
            case 3: 
            combinacion = "0" + combinacion;
        
            default:
                break;
        }

        while(!acierto && contador <= OPORTUNIDADES) {
            System.out.print("Escribe el numero de combinación correcto: ");
            String intento = sc.nextLine();

            //comprueba
            if (intento.equals(combinacion)){
                acierto = true;
                System.out.println("\033[1mSe ha abierto la caja fuerte\033[0m");
            } else {
                System.out.println("Clave incorrecta");
            }

            //Incrementa contador
            contador++;
            if (!acierto){
                System.out.println("Lo siento ha agotado las oportunidades");
                System.out.println("Se ha llamado a la policia");


            }
        }
        
        sc.close();
    }
}
