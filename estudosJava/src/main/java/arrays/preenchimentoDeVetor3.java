package arrays;

import java.util.Scanner;

public class preenchimentoDeVetor3 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
              
            float[] vetor = new float[100];
            
        System.out.println("Insira o primeiro número do vetor:");
            vetor[0] = scan.nextFloat();
            
        for(int i = 0; i < vetor.length; i++) {
            
            System.out.println("N[" + i + "] = " + vetor[i]);
            
            while (vetor[i] > 0) {
                vetor[i] /= 2;
                System.out.println("N[" + i + "] = " + vetor[i]);
            }
                     
        }    
        
    }
}
