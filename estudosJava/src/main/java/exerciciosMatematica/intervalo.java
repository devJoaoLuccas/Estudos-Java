package exerciciosMatematica;

import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        
            double numero = inserirNumero();
            
        if (numero >= 0 && numero <= 25) {
            
            System.out.println(numero + " faz parte do intervalo [0,25]");
            
        } if (numero >= 25.01 && numero <= 50) {
            
            System.out.println(numero + " faz parte do intervalo [25,50]");
            
        } if (numero >= 50.01 && numero <=75) {
            
            System.out.println(numero + " faz parte do intervalo [50, 75]");
            
        } if (numero >= 75.01 && numero <= 100) {
            
            System.out.println(numero + " faz parte do intervalo [75,100]");
            
        } if (numero > 100 || numero < 0) {
            
            System.out.println(numero + " fora de intervalo");
            
        }
            
    }
    
    public static double inserirNumero() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira um número:");
            double numero = scan.nextDouble();
            
    return numero;  
        
    }
    
}
