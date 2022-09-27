package procedimentos;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            int num;
    
        System.out.println("Insira um número:");
            num = scan.nextInt();
            
        fatorial.calcularFatorial(num);
        
    }
    
    public static int calcularFatorial(int n) {
        
            int resposta = 1;
        
        for(int i = n; i > 0; i--) {
            
            resposta *= i;
            
        }
        
        System.out.println("O resultado da fatoração foi: " + resposta);
        
        return resposta;
    }
    
}
