package Tema7;

public class T7E2 {
    public static void main(String[] args) {
    int[] numerico = new int[12];

    // Array caracteres
    char[] caracteres = new char[10];

    // Array Strings
    String[] cadenas = new String[10];

    numerico[0] = 39;
    numerico[1] = -2;
    numerico[4] = 0;
    numerico[6] = 14;

    caracteres[1] = 'a';
    caracteres[9] = 'b';

    cadenas[2] = "Hola";
    cadenas[7] = "Mundo";

    for(int numero : numerico) {
        System.out.print(numero + " ");
    }
    System.out.println("");

    for (char caracter : caracteres) {
        System.out.print(caracter + " ");
    }
    System.out.println("");

    for (String cadena : cadenas) {
        System.out.print(cadena + " ");
    }

    }
}

