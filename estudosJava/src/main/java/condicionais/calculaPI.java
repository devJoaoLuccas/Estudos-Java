package aula;

import java.util.Scanner;

public class calculaPI {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
            
            float x;
            int n;
            float contador = 1;
            
        System.out.println("Insira quantas vezes você deseja que repita:");
            n = ler.nextInt();
            
        do {
            x = (2 *(2/contador)); 
            contador += 2;
            n--;             
        } while (n > 0);
            
        System.out.println("O resultado foi:" + x);
            
        
        
}    
}
