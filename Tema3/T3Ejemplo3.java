import java.util.Scanner;

public class T3Ejemplo3 {

    public static void main(String[] args) {
        String linea = "";
        String adios = "Adios";
        Scanner entrada = new Scanner(System.in);
        while (!adios.equals(linea)) {
            System.out.println("Introduce una cadena de caracteres");
            linea = entrada.nextLine();
        }

        // Para comparar el contenido del objeto
        System.out.println(linea.equals(adios));

        entrada.close();
    }
}