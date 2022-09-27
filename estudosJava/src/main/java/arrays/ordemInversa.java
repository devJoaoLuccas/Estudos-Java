package arrays;

import java.util.Scanner;

public class ordemInversa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int[] numeros = new int[5];
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Insira um número:");
                numeros[i] = scan.nextInt();
        }
        
        System.out.println("Listando os números em ordem inversa:");
        
        for(int i = 4; i >= 0; i--) {
            System.out.println(" - " + numeros[i]);
        }
    }
}
