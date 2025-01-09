package Tema8;

import Tema8.Libreria;

public class Main {
    
    public static void main(String[] args) {
        System.out.println("Multiplicación: " + (Libreria.multiplicacion(5,4) == 20));
        System.out.println("division: " + (Libreria.division(8,4) == 2));
        System.out.println("potencia: " + (Libreria.potencia(3,3) == 27));
    }
}
