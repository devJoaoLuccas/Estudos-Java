package arrays;

import java.util.Scanner;

public class trocaDeVetor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int[] vetor = new int[20];
            int descartavel;
            
        for(int i = 19; i >= 0; i--) {
            
            System.out.println("Insira um número:");
                vetor[i] = scan.nextInt();
            
        }    
        
        for(int i = 0; i < vetor.length; i ++) {
             
            
            System.out.println("N ["+ i + "] = " + vetor[i]);
            
        }
        
        
    }
}
