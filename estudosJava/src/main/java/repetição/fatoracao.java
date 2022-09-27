package repetição;

import java.util.Scanner;

public class fatoracao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
            int x;
            int resultado = 1;
        
        System.out.print("Insira o valor de X:");
            x = ler.nextInt();
                   
        for (int i = x; i > 0; i--) {    
             resultado *= i;             
    }
        System.out.println(" O resultado da fatoração é " + resultado);
        System.out.println("Fim do progama.");
}
}
