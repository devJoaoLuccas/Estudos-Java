package repetição;

import java.util.Scanner;

public class numerosInteiros {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        
            int n1;
            
        System.out.println("Insira o número de repetições:");
            n1 = ler.nextInt();
        
        
        do { 
            System.out.println(n1 + " - É positivo");
            n1--;
        } while (n1 > -1);
          
        System.out.println(n1 + " O número passou a ser negativo.");    
        
}       
} 
