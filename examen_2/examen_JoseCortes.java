package examen_2;

import java.util.Scanner;

public class examen_JoseCortes {
    public static void main(String[] args) {
        // declaraciones
        Scanner sc = new Scanner(System.in);
        int numMin = 0;
        int numMax = 0;
        int numAleatorio = 0;
        char colorTabla = ' ';
        char blancoNegro = 'B';

        final String BORDE_HORIZONTAL_BLANCO_NEGRO = " ---";
        final String BORDE_VERTICAL_BLANCO_NEGRO = "|";
        final String BORDE_HORIZONTAL = "\u2550\u2550\u2550";
        final String BORDE_VERTICAL = "\u2551";

        // Uniones superiores
        final String ARRIBA_IZQ = "\u2554";
        final String ARRIBA_MED = "\u2566";
        final String ARRIBA_DER = "\u2557";

        // Uniones medias
        final String MEDIO_IZQ = "\u2560";
        final String MEDIO_MED = "\u256C";
        final String MEDIO_DER = "\u2563";

        // Uniones inferiores
        final String ABAJO_IZQ = "\u255A";
        final String ABAJO_MED = "\u2569";
        final String ABAJO_DER = "\u255D";
        int alto = 10;
        int ancho = 10;
        System.out.println("GRAPHIFY");
        System.out.println("======================");
        // Pedimos el primer número que sera el minimo
        while (numMin <= 0) {

            try {
                System.out.println("Introduce el valor mínimo del rango: ");
                numMin = sc.nextInt();
                if (numMin < 0) {
                    System.out.println("ERROR! el número debe de ser un entero positivo");
                }
            } catch (Exception e) {
                System.out.println("ERROR! el número debe de ser un entero positivo");
                sc.nextLine();
            }
        }
        // Pedimos el segundo número que sera el máximo
        while (numMax <= 0) {
            try {
                System.out.println("Introduce el valor máximo del rango: ");
                numMax = sc.nextInt();
                if (numMax < numMin) {
                    System.out.println("ERROR! el numero que debe introducir debe de ser mayor al valor minimo");
                }
            } catch (Exception e) {
                System.out.println("ERROR! el número debe de ser un entero positivo");
                sc.nextLine();
            }
        }
        // Pedimos al usuario si quiere que se dibuje en blanco y negro o a color

        try {
            System.out.print("Dibujo la gráfica en blanco y negro o en color (B/C): ");
            colorTabla = sc.next().charAt(0);
        } catch (Exception e) {
            System.out.println("ERROR! debe de introducir un cáracter");
            sc.nextLine();
        }
        // Importamos un numero aleatorio entre los dos valores solicitados incluyendo
        // ambos
        numAleatorio = (int) (Math.random() * (numMax - numMin + 1)) + numMin;
        System.out.println(numAleatorio);
        // desglosamos numero a numero el numero aleatorio
        String sNumero = String.valueOf(numAleatorio);
        if (colorTabla == blancoNegro) {

            for (int i = 0; i < sNumero.length(); i++) {
                alto = sNumero.length();

                for (int fila = 0; fila < alto; fila++) {
                    if (fila == 0) {
                        System.out.println(BORDE_HORIZONTAL_BLANCO_NEGRO);
                        System.out.println(BORDE_VERTICAL_BLANCO_NEGRO + " " + sNumero.charAt(i) + " "
                                + BORDE_VERTICAL_BLANCO_NEGRO);
                        System.out.println(BORDE_HORIZONTAL_BLANCO_NEGRO);
                    } else {
                        System.out.println(BORDE_VERTICAL_BLANCO_NEGRO + " " + sNumero.charAt(i) + " "
                                + BORDE_VERTICAL_BLANCO_NEGRO);
                        System.out.println(BORDE_HORIZONTAL_BLANCO_NEGRO);
                    }
                }
            }

        } else {
            // Filas
            alto = sNumero.length();
            for (int fila = 0; fila <= alto; fila++) {
                String bordesHorizontales = "";
                String bordesVerticales = "";
                // Columnas
                for (int columna = 0; columna <= ancho; columna++) {
                    if (fila == 0) {
                        if (columna == 0) {
                            bordesHorizontales += ARRIBA_IZQ + BORDE_HORIZONTAL;
                        } else if (columna == ancho) {
                            bordesHorizontales += ARRIBA_DER;

                        } else {
                            bordesHorizontales += ARRIBA_MED + BORDE_HORIZONTAL;
                        }
                    } else if (fila == alto) {
                        if (columna == 0) {
                            bordesHorizontales += ABAJO_IZQ + BORDE_HORIZONTAL;
                        } else if (columna == ancho) {
                            bordesHorizontales += ABAJO_DER;
                        } else {
                            bordesHorizontales += ABAJO_MED + BORDE_HORIZONTAL;
                        }
                    } else {
                        if (columna == 0) {
                            bordesHorizontales += MEDIO_IZQ + BORDE_HORIZONTAL;
                        } else if (columna == ancho) {
                            bordesHorizontales += MEDIO_DER;
                        } else {
                            bordesHorizontales += MEDIO_MED + BORDE_HORIZONTAL;
                        }
                    }
                    if (fila != alto) {
                        if (columna == 0) {
                            bordesVerticales += BORDE_VERTICAL + " " + sNumero.charAt(fila) + " ";
                        } else {
                            bordesVerticales += BORDE_VERTICAL + "   ";
                        }
                    }
                }
                System.out.println(bordesHorizontales);
                System.out.println(bordesVerticales);

            }
            sc.close();

        }
    }
}
