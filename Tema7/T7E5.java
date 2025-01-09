package Tema7;

public class T7E5 {
    public static void main(String[] args) {
        
    
    int[] num = new int[10];

    int max = num[0];
    int min = num[0];
    for (int n : num){
        if (n > max){
            max = n;
            System.out.println(num + "maximo");
        }
        if (n < min){
            min = n;
            System.out.println(num + "minimo");
        }
        System.out.println(num);
    }
    }
}
