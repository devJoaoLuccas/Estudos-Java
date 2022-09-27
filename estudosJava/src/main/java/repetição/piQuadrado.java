package repetição;

import java.util.Scanner;

public class piQuadrado {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            float resultado = 0;
            float x = 1;
            byte n;
           
            
        System.out.println("Insira a quantidade de vezes que o progama vai rodar:");
            n = ler.nextByte();
        
        do {
          resultado += (1 / (x * x));
          x =+ 2;
          n--;    
        } while (n > 0);
        
        System.out.println(" O valor foi " + resultado);
        
        
    }
}
