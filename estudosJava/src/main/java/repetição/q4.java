package repetição;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            int a; 
        
        for(int i = 0; i < 5; i++) {
            System.out.println("Escreva um número: ");
                a = ler.nextInt();
                a *= 2;
            System.out.println("O resultado da multiplicação é " + a);            
        }
            System.out.println("Fim do progama.");
        
    }
}
               
    
        
