package repetição;

import java.util.Scanner;

public class maiorNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            int n1, n2, n3;
            
        
        System.out.println("Insira o número de repetição");
            n1 = ler.nextInt();
            
        for (int i = 0; i < n1; i++){
            
        System.out.println("Insira um número:");
            n2 = ler.nextInt();
            
        System.out.println("Insira um número:");
            n3 = ler.nextInt();
            
           if (n2 > n3) {
               System.out.println(n2 + " > " + n3);
           } if (n3 > n2) {
               System.out.println(n3 + " > " + n2);
           } if (n2 == 0 || n3 == 0) {
               System.out.println("Erro");
               break;
           }  
        }    
        
        
        
}    
}
