package Tema14;


public class MatLib {

    /**
     * 
     * @param a
     * @param b
     * @return suma
     */
    // Suma dos números
    public static int suma(int a, int b) {
        return a+b;
        }

    /**
     * 
     * @param a
     * @return incremento
     */
    //Incrementa una Unidad
    public static int inc(int a){
        return a+1;
    }

    /**
     * 
     * @param a
     * @param b
     * @return resta de dos numeros
     */
    // Resta dos números
    public static int resta(int a, int b) {
    return a + (-b); 
    }

    /**
     * 
     * @param a
     * @return decremento en una unidad
     */
    //Decrementa una unidad
    public static int dec(int a){
        return a + (-1);
    }

    /**
     * 
     * @param a
     * @param b
     * @return booleano dependiendo si es mayor o no
     */
    // Es mayor a otro
    public static boolean esMayor(int a, int b) {
        boolean resultado = false;
        int diferencia = a + (-b); 
        if (diferencia > 0) { 
            resultado = true;
        }
        return resultado;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return booleano dependiendo si es menor o no
     */
    // Es menor a otro
    public static boolean esMenor(int a, int b) {
        boolean resultado = false;
        int diferencia = b + (-a); 
        if (diferencia > 0) { 
            resultado = true;
        }
        return resultado;
    }
    
    /**
     * 
     * @param a
     * @param b
     * @return si es igual a otro o no
     */
    // Es igual a otro
    public static boolean esIgual(int a, int b) {
        boolean resultado = false;
        if (!esMayor(a, b) && !esMenor(a, b)) { 
            resultado = true;
        }
        return resultado;
    }

    /**
     * 
     * @param a
     * @param b
     * @return multiplicacion de a y b 
     */
    //Multiplica 
    public static int multiplica(int a, int b){
        int resultado = 0;
        while (b>0) {
            resultado = resultado + a;
            b = b +(-1);
        }
        return resultado;
    }

    /**
     * 
     * @param a
     * @param b
     * @return division de dos numeros 
     */
    // Divide dos números
    public static int divide(int a, int b) {
        int cociente = 0;
        while (a > 0) {
            a = a + (-b);
            if (a > 0) {
                cociente = cociente + 1;
            }
        }
        return cociente;
    }

    //Resto de la división
    public static int resto(int a, int b) {
        while (a > 0) {
        a = a + (-b);
            if (a < 0) {
            a = a + b; 
            }
        }
        return a;
    }

    // Calcula la potencia de un número
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        while (exponente > 0) {
            resultado = multiplica(resultado, base);
            exponente = exponente + (-1);
        }
        return resultado;
    }

    // Calcula el cuadrado de un número
    public static int cuadrado(int a) {
        return multiplica(a, a);
    }

   // Calcula el cubo de un número
   public static int cubo(int a) {
    return multiplica(multiplica(a, a), a);//Mal?
    }

    // Verifica si a es múltiplo de b
    public static boolean esMultiplo(int a, int b) {
    boolean resultado = false;
    int resto;
    resto = resto(a, b); 
        if (!(resto > 0)) { 
            resultado = true;
    }
    return resultado;
    }

    // Verifica si b es divisor de a
    public static boolean esDivisor(int a, int b) {
    boolean resultado = false;
    int resto;
    resto = resto(b, a);
    if (!(resto > 0)) {
        resultado = true;
    }
    return resultado;
    }


    // Verifica si un número es primo
    public static boolean esPrimo(int a) {
        return true;
    }

    // Verifica si un número es un cuadrado perfecto
    public static boolean esCuadradoPerfecto(int a) {
        return false;
    }

    //Piramide 
    public static void piramide(int a){

    }



}





    
    

