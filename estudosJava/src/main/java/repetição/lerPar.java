package repetição;

import java.util.Scanner;

public class lerPar {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            int n1;
            int contador = 0;
        
        for (int i = 0; i < 10; i++){    
            
        System.out.println("Insira um número:");
            n1 = ler.nextInt();
                   
        if (n1 % 2 == 0) {
           System.out.println("Parabéns o número é par");           
          } else {
            System.out.println("O número é impar");
            break;
        }
        }
        
        
        
}    
    
    
    
}
