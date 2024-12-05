package Tema8;

import java.util.Scanner;

public class Matematicas {
    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static int invertirEnteroConCerosIzquirda(int numero) {
        // Declaraciones
        int numeroInvertido = 0;
        int longitud = 0;
        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;
            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            // Eliminar el último número del número original
            numero /= 10;
            longitud++;
            
        }
        int ceros = 0;
        while (numeroInvertido / (int) Math.pow(10, longitud - 1) == 0) {
            longitud--;
            ceros++;
        }
        while (ceros > 0) {
            System.out.print("0");
            ceros--;
        }
                return numeroInvertido;
    }

    /**
     * Método que devuelve el inverso del número que se le pasa como parámetro
     * 
     * @param numero
     * @return
     */
    public static int invertirEntero(int numero) {
        // Declaraciones
        int numeroInvertido = 0;
        while (numero != 0) {
            // Obtener el último dígito del número
            int digito = numero % 10;
            // Añadir el dígito al número invertido
            numeroInvertido = numeroInvertido * 10 + digito;
            // Eliminar el último número del número original
            numero /= 10;
        }
        // Devuelve el número invertido
        return numeroInvertido;
    }

    /**
     * Función que devuelve si el número entero que se le pasa como parámetro es
     * capicúa.
     * 
     * @param numero
     * @return
     */
    public static boolean esCapicua(int numero) {
        return (numero == invertirEntero(numero));
    }

    /**
     * Función que comprueba si el número entero que se le pasa como parámetro es
     * primo
     * 
     * @param numero
     * @return
     */
    public static boolean esPrimo(int numero) {
        boolean esPrimo = true;
        int i = 2;

        // valor absoluto
        numero = Math.abs(numero);
        while (esPrimo && i <= (numero / 2)) {
            esPrimo = (numero % i != 0);
            i++;
        }
        return esPrimo;
    }

    /**
     * Funcion que te hace la potencia de un numero 
     * @param base
     * @param expo
     * @return
     */
    public static int potencia(int base, int expo) {
        int potencia = 1;
        for (int i = 1; i <= expo; i++) {
            potencia *= base;
        }
        return potencia;
    }


    public static int numeroDeDigitos(int numero){
        int resultado = 0;

       do {
        numero /= 10;
       resultado++;
       } while (( numero / 10) != 0 || (numero % 10) !=0);
        return resultado;
    }
    /**
     * Funcion que te dice en que posicion coincide el digito que tu quieras
     * @param numero
     * @param digito
     * @return
     */
    public static String digitosCoincidentes(int numero, int digito) {
        int i = 0;
        String posicionesCoincidentes = "";
        int numeroInvertido = invertirEnteroConCerosIzquirda(numero);
        while (numeroInvertido / 10 != 0) {
            int digitoActual = numeroInvertido % 10;
            numeroInvertido = numeroInvertido / 10;
            i++;

            if (digitoActual == digito) {
                posicionesCoincidentes += i + " ";
            }
        }
        if (numeroInvertido == digito) {
            posicionesCoincidentes += (i + 1);
        }
        return posicionesCoincidentes;
    }

    public static int posicionDigito(int numero, int digito){
      
       while (numero / 10 != 0) {
        int digitoActual = numero % 10;
        numero = numero / 10;
        if (digitoActual == digito) {
            return posicionDigito; 
        } else {
            return -1;
        }
    }
        
    
}
        
    /**********************************************************************************************************/
    /**
     * Programa principal para probar la librería
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 15) {
            System.out.println("1. Capicúa");
            System.out.println("2. Primos");
            System.out.println("3. Siguiente Primo");
            System.out.println("4. Potencia");
            System.out.println("5. Digitos");
            System.out.println("6. voltea");
            System.out.println("7. digitoN");
            System.out.println("8. Posicion de digito");
            System.out.println("9. quitar por detras");
            System.out.println("10. quitar por delante");
            System.out.println("11. Pega por detras");
            System.out.println("12. Pega por delante");
            System.out.println("13. Trozo de numero");
            System.out.println("14. JuntaNumeros");
            System.out.println("15. Salir");
            System.out.print("Introduzca opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Introduzca número: ");
                    int numero1 = sc.nextInt();
                    if (esCapicua(numero1)) {
                        System.out.println("El numero " + numero1 + " es capicúa");
                    } else {
                        System.out.println("El numero " + numero1 + " NO es capicúa");
                    }
                    break;
                case 2:
                    System.out.println("Introduzca numero: ");
                    int numero2 = sc.nextInt();
                    if (esPrimo(numero2)) {
                        System.out.println("El numero " + numero2 + " es primo");
                    } else {
                        System.out.println("El numero " + numero2 + " NO es primo");
                    }
                    break;
                case 3:
                    System.out.println("Introduzca numero: ");
                    break;
                case 4:
                    System.out.println("Introduzca numero de la base: ");
                    int base = sc.nextInt();
                    System.out.println("Introduzca el exponente: ");
                    int expo = sc.nextInt();
                    int potencia = potencia(base, expo);
                    System.out.println("El resultado de esta potencia es " + potencia);
                    break;
                case 5:
                System.out.println("Introduzca un numero ");
                int numero5 = sc.nextInt();
                    
                    System.out.println("El numero " + numero5 + " tiene " + numeroDeDigitos(numero5) + " digitos");
                    break;
                case 6:
                    System.out.println("Introduzca numero a voltear: ");
                    int numero6 = sc.nextInt();
                    System.out.println("El numero volteado es "  + invertirEnteroConCerosIzquirda(numero6));
                    break;
                case 7:
                    System.out.println("Introduzca numero: ");
                    int numero7 = sc.nextInt();
                    System.out.println("Introduzca el digito a buscar: ");
                    int digito7 = sc.nextInt();
                    System.out.println("el " + digito7 + " aparece dentro de " + numero7 + " en la posicion " + digitosCoincidentes(numero7, digito7));
                    break;
                case 8:
                    System.out.println("Introduzca numero: ");
                    int numero8 = sc.nextInt();
                    System.out.println("Introduce el digito a buscar: ");
                    int digito8 = sc.nextInt();
                    System.out.println("El " + digito8 + " se encuentra " +  digito8 + "veces en el numero " +numero8);
                    break;
                case 9:
                    System.out.println("Introduzca numero: ");
                    break;
                case 10:
                    System.out.println("Introduzca numero: ");
                    break;
                case 11:
                    System.out.println("Introduzca numero: ");
                    break;
                case 12:
                    System.out.println("Introduzca numero: ");
                    break;
                case 13:
                    System.out.println("Introduzca numero: ");
                    break;
                case 14:
                    System.out.println("Introduzca numero: ");
                    break;
                default:
                    break;
            }
            System.out.println("");
        }
        sc.close();
    }
}