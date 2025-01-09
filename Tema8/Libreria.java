package Tema8;

public class Libreria {

    public static int multiplicacion(int i, int j) {
        int producto = 0;
        while (j > 0){
            producto += i;
            j--;
        }

        return producto;
    }

    public static int division(int dividendo, int divisor) {
        int cociente = 0;
        while (dividendo >= divisor){
        cociente++;
        dividendo = dividendo - divisor;
        }

        return cociente;
    }

    public static int potencia(int base, int exponente){
        int resultado = 1;
        for (int i = 0; i == exponente; i++){
            resultado = multiplicacion(resultado, base);
        }

        return resultado;
    }
}
