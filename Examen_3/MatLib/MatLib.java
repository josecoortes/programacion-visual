package Examen_3;

public class MatLib {

    /**
     * Esta función realiza una suma
     * @param a
     * @param b
     * @return
     */
    public static int Suma(int a, int b) {

        return a + b;
    }

    /**
     * Esta función realiza un incremento de +1 a un numero
     * @param a
     * @return
     */
    public static int incremento(int a) {

        return Suma(a, 1);

    }

    /**
     * Esta función realiza una resta
     * @param i
     * @param j
     * @return
     */
    public static int resta(int i, int j) {

        return Suma(i, -j);
    }

    /**
     * Esta función realiza un decremento de -1 a un numero
     * @param i
     * @return
     */
    public static int dec(int i) {
        return resta(i, 1);
    }

    /**
     * Esta función te permite saber si el numero i es mayor que el j
     * @param i
     * @param j
     * @return
     */
    public static boolean esMayor(int i, int j) {
        if (resta(i, j) > 0) {
            return true;
        }
        return false;
    }

    /**
     * Esta función te permite saber si el numero i es menor que el j
     * @param i
     * @param j
     * @return
     */
    public static boolean esMenor(int i, int j) {
        if (resta(j, i) > 0) {
            return true;
        }

        return false;
    }

    /**
     * Esta función te permite saber si el numero i es igual que el j
     * @param i
     * @param j
     * @return
     */
    public static boolean esIgual(int i, int j) {
        boolean resultado = false;
        if (!esMayor(i, j) && !esMenor(i, j)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * Esta función realiza una multiplicación
     * @param i
     * @param j
     * @return
     */
    public static int multiplica(int i, int j) {
        int producto = 0;
        while (j > 0) {
            producto = Suma(i, producto);
            j = resta(j, 1);
        }
        return producto;
    }

    /**
     * Esta función realiza una división
     * @param i
     * @param j
     * @return
     */
    public static int divide(int i, int j) {
        int resultado = 0;
        while (i > 0) {
            i = resta(i, j);
            resultado = incremento(resultado);
        }

        return resultado;
    }

    /**
     * Esta función te calcula el resto de una división
     * @param i
     * @param j
     * @return
     */
    public static int resto(int i, int j) {
        while (i > 0) {
            i = resta(i, j);
            if (i < 0) {
                i = Suma(i, j);
                break;
            }
        }
        return i;
    }

    /**
     * Esta función te realiza la potencia de un numero elevado a la cantidad que desees
     * @param i
     * @param j
     * @return
     */
    public static int potencia(int i, int j) {
        int resultado = 1;
        while (j > 0) {
            resultado = multiplica(resultado, i);
            j = resta(j, 1);
        }
        return resultado;
    }

    /**
     * Esta función realiza el cuadrado de un numero
     * @param i
     * @return
     */
    public static int cuadrado(int i) {
        int resultado;
        resultado = multiplica(i, i);
        return resultado;
    }

    /**
     * Esta función te eleva al cubo el numero que desees
     * @param i
     * @return
     */
    public static int cubo(int i) {
        int resultado;
        resultado = multiplica(multiplica(i, i), i);
        return resultado;
    }

    /**
     * Esta función te permite saber si un numero es multiplo de otro
     * @param i
     * @param j
     * @return
     */
    public static boolean esMultiplo(int i, int j) {
        boolean resultado = false;
        int resto;
        resto = resto(i, j);
        if (!(resto > 0)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * Esta función te permite saber si un numero es divisor de otro
     * @param i
     * @param j
     * @return
     */
    public static boolean esDivisor(int i, int j) {
        boolean resultado = false;
        int resto;
        resto = resto(j, i);
        if (!(resto > 0)) {
            resultado = true;
        }
        return resultado;
    }

    /**
     * Esta función te permite saber si el número introducido es primo
     * @param i
     * @return
     */
    public static boolean esPrimo(int i) {
        boolean primo = true;
        if (resta(i, 1) > 0) {
            primo = false;
        } else {
            for (int a = 2; resta(i, a) > 0; incremento(a)) {
                primo = (resto(a, i) != 0);
            }
        }

        return primo;
    }
/**
 * Esta función te permite saber si el numero introducido es un cuadrado perfecto
 * @param i
 * @return
 */
    public static boolean esCuadradoPerfecto(int i) {
        return true;
    }

    public static void piramide(int i) {

    }

}
