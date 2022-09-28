package arrays;

import java.util.Scanner;

public class substituicaoVetor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int[] numeros = new int[10];
            
        for(int i = 0; i < numeros.length; i++) {
            System.out.println("Insira um número:"); 
                numeros[i] = scan.nextInt();
        }    
            
        for(int i = 0; i < numeros.length; i++) {
            if (numeros[i] <= 0) {
                numeros[i] = 1;
            }
            
            System.out.println(i + " - " + numeros[i]);
                
        }    
           
      }    
    
}
