package arrays;

import java.util.Scanner;

public class lerNumeros {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int tamanho;
            
        System.out.println("Insira o tamanho do array:");
            tamanho = scan.nextInt();
            
            int[] numeros = new int[tamanho];
        
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Insira os números:");
                numeros[i] = scan.nextInt();
    } 
        for (int i = 0; i <numeros.length; i++) {
            System.out.println(i + "- " + numeros[i]);
        }
         
    }
    
}
