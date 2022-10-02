package repetição;

import java.util.Scanner;

public class sequenciaLogica2 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int x, y, contador = 0;
            
        System.out.println("Insira o valor de X e Y:");
            x = scan.nextInt();
            y = scan.nextInt();
            
            if (x > 1 && x < 20 && x < y && y < 1000) { 
            } else {
                System.out.println("Número inválido");
                y = 0;
            }
            
            if (x > y) {
                
                int z = x;
                x = y;
                y = z;
                
            }
            
        for (int i = 1; i <= y; i++) {
            
            System.out.print(i + " ");
                    
                contador++;
            
            if (contador == (x -1)) {
                contador = 0;
                i++;
                System.out.println(i + " ");
                
            }            
        
           
            
        }
        
    }
}
