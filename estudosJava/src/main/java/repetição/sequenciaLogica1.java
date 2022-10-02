package repetição;

import java.util.Scanner;

public class sequenciaLogica1 {
    public static void main(String[] args) {
        
            int a = inserirNumero();
            int c, d, e, f;
        
        for (int i = 1; i <= a; i++) {
            
        if (a < 1000) {  
            
            c = i * i;
            d = i * i * i;
            
        System.out.println(i + " " +c + " " + d);    
        
            e = c + 1;
            f = d + 1;
        
        System.out.println(i + " " + e + " " + f);
            
        } else {
            System.out.println("Valor inválido");
            i = a;
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
