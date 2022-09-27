package repetição;

import java.util.Scanner; 

public class primo {
    public static void main(String[] args) {
        
            int numero = inserirNumero();
        
        if(testaPrimo(numero) == true) {
            System.out.println("O " + numero + " é primo");
        } else {
            System.out.println("O " + numero + " não é primo");
        }    
        
    }
            
    public static int inserirNumero() {
        
        Scanner scan = new Scanner(System.in);
        
            int n;
            
        System.out.println("Insira um número:");
            n = scan.nextInt();
        
    return n;     
    }
    
     public static boolean testaPrimo(int numero)
    {   int divisor, total=0; 
        for (divisor=1; divisor <= numero; divisor++)
        {
            if ((numero % divisor) == 0)
            {
                total++;
            }
        }
        if (total > 2)
        {
            return false;
        }
        else
        {
            return true;
        }
    }  
 
 
}
    
