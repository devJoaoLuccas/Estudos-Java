package arrays;

import java.util.Scanner;

public class preenchimentoDeVetor2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número:");
            int T = scan.nextInt();
            
        
            int[] N = new int[1000];
            int resposta = 0;
            
        
        
        for(int i =0; i < N.length; i++) {
            
            System.out.println("N[" + i + "] = " + resposta);
            
                resposta++;
                
            if (resposta == T) {
                resposta = 0;
            }     
            
        }
            
        
    }
}
