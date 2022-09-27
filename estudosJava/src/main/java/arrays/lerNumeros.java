package arrays;

import java.util.Scanner;

public class lerNumeros {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a quantidade números que você deseja inserir:");
            int tamanho = scan.nextInt();
            
            int[] numeros = new int[tamanho];
            
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Insira os números desejados:");
                numeros[i] = scan.nextInt();
        }
         
        for(int numero : numeros){
            System.out.println(numero);
        }
         
    }
    
}
