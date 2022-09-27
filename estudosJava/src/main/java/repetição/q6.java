package repetição;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            float n1,n2;
            float potencia = 1;
        
        System.out.println("Insira o primeiro número:");
            n1 = ler.nextFloat();
        
        System.out.println("Insira o segundo número:");
            n2 = ler.nextFloat();
            
        
        for(int i = 0; i <= n2; i++) {
            potencia *= n1;
        }    
        
        System.out.println("O resultado da potência é: " + potencia);    
            
    }
}
