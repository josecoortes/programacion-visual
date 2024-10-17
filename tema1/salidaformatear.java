public class salidaformatear {

  public static void main(String[] args) {
    System.out.printf("El número %f no tiene decimales.\n", 21.); // Muestra el numero sin decimales
    System.out.printf("El número %f sale con decimales.\n", 21.0); // Muestra el numero con todos sus decimales
    System.out.printf("El %.5f sale exactamente con %d decimales.\n", 21.3421, 4); //Muestra le numero con los decimales que tu indiques.

    System.out.printf("%8d\n", 100); // rellena con espacios a la izquierda
    System.out.printf("%08d\n", 100); // rellena con ceros a la izquierda
    System.out.printf("%+d\n", 100); // muestra el signo del número
    System.out.printf("%-8d\n", 100); // rellena con espacios a la derecha
  }
}