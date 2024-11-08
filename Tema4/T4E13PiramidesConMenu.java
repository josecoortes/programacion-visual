package Tema4;

import java.util.Scanner;

public class T4E13PiramidesConMenu {
   
public static void main(String[] args) {
    
    //Declaraciones
    int orientacion = 0;
    String caracter ="";
    Scanner sc = new Scanner(System.in);

    //Pintar el menú
      do{
        try{
        System.out.println("Este programa pinta una pirámide.");


        //caracter de relleno
        while (caracter.length() != 1 ) {
            System.out.println("Introduce el cáracter de rellleno: ");
            caracter = sc.nextLine();
            if (caracter.length() !=1){
                System.out.println("ERROR: El carácter tiene que ser de longitud 1\n");
            }
        }
        
        

        //Orientación
        System.out.println("1. Con el vértice hacia arriba");
        System.out.println("2. Con el vértice hacia abajo");
        System.out.println("3. Con el vértice hacia derecha");
        System.out.println("4. Con el vértice hacia izquierda");
        System.out.println("5. Salir");
        System.out.println("Elija un tipo de pirámide:");
        orientacion = sc.nextInt();

        //Controla que la opción este entre 1 y 5.
        if(orientacion < 1 || orientacion > 5){
            //throw new Exception();
            System.out.println("ERROR: La opción debe ser un numero del 1 al 5 \n");
        }

        switch ( orientacion ){
            case 1:
            System.out.println("  " + caracter );
            System.out.println(" " + caracter + caracter + caracter );
            System.out.println(caracter + caracter + caracter + caracter + caracter);
                break;
            case 2:
            System.out.println(caracter + caracter + caracter + caracter + caracter);
            System.out.println(" " + caracter + caracter + caracter );
            System.out.println("  " + caracter );
                break;
            case 3:
            System.out.println(caracter);
            System.out.println(caracter + caracter );
            System.out.println(caracter + caracter + caracter );
            System.out.println(caracter + caracter );
            System.out.println(caracter);

                break;
            case 4:
            System.out.println("  " + caracter);
            System.out.println(" " + caracter + caracter );
            System.out.println(caracter + caracter + caracter );
            System.out.println(" " + caracter + caracter );
            System.out.println("  " + caracter);
                break;
            default: System.out.println("ERROR : La opción debe de ser un numero del 1 al 5 \n");

        
        }
      } catch (Exception e){
            System.out.println("ERROR: La opción debe ser un numero del 1 al 5 \n");
      } finally{
        sc.nextLine();
      }

    } while (orientacion != 5);
    sc.close();
  }
}

