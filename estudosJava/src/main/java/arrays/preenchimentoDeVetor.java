package arrays;

import java.util.Scanner;

public class preenchimentoDeVetor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int v;
        
        System.out.println("Insira um número:");
            v = scan.nextInt();
            
        preenchimentoDeVetor.validarV(v); 
    
            int[] n = new int[10];
            
        for (int i = 0; i < n.length; i++) {
            
                n[i] = v;
                
            System.out.println(n[i]);
            
                v *= 2;
        }
          
    }
    
    public static int validarV(int x) {
        
        if (x <= 50) {
            System.out.println(x + " é válido!");
        } else {
            System.out.println(x + " não é válido!");
        }
        
          
    return x;     
        
    }
    
}
