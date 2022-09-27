package repetição;

import java.util.Scanner;

public class seriesMatematicas {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            float x, y; 
            float resultado = 1;
            
        System.out.println("Insira o valor de X:");
            x = ler.nextFloat();
            
        System.out.println("Insira o valor de Y:");
            y = ler.nextFloat();
            
        for (float i = 0; i < y; i++) {    
        resultado *= x;
    }
        System.out.println(" O resultado de " + x + " elevado a " + y + " é " + resultado);
              
    } 
}
