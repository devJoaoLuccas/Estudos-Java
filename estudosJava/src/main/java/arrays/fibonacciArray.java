package arrays;

import java.util.Scanner;

public class fibonacciArray {
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
    
                int casoDeTeste;
                int entrada = 0;
                int numero;
                
                int[] N = new int[60];
            
                N[0] = 0;
                N[1] = 1;

                        
          
        for(int i = 2; i < 60; i ++) {
            
                N[i] = N[1] + N[2];
                                   
                N[2] = N[1];
                N[1] = N[i];
                   
                      
        }    
        
        System.out.println("Insira o número de entrada:");
                entrada = scan.nextInt();
            
        while(entrada>0) {
            
            System.out.println("Insira um número:");
                numero = scan.nextInt();
            
            System.out.println("Fib[" + numero + "] = " + N[numero]);
            
                entrada--;
        }

            
    }    
    
}
