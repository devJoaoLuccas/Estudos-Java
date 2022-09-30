package repetição;

import java.util.Scanner;

public class numerosImpares {
    public static void main(String[] args) {
        
            int impar = inserirNumero();
        
        for(int i = 0; i <= impar; i++) {
                  
            if (i % 2 != 0) {
                
                System.out.println(i);
                
            }
        }
    }
    
    public static int inserirNumero() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número:");
            int numero = scan.nextInt();
            
    return numero;        
        
    }

    
}
