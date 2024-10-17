public class EjemploVariablesEnCadenas {
    public static void main(String args[]) {
        String nombre = "Jose";
        int edad = 18;
        int meses = 10;

        // Ejemplo usando printf sin necesidad de concatenar
        System.out.printf("Me llamo %s, tengo %s años y %s meses.\n", nombre, edad, meses);

        // Ejemplo usando println y concatenación de cadenas de caracteres
        System.out.println("Me llamo " + nombre + ",tengo " + edad + " años y tengo " + meses + " meses .");
        

    }
}