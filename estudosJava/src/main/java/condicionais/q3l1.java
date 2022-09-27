package condicionais;

import java.util.Scanner;

public class q3l1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);    
        
            int lampada;
       
        System.out.println("Indique o estado da lampada, apagada = 0, ligada = 1, meia-luz = 2.");
            lampada = ler.nextInt();
        
        if (lampada == 0) {
            System.out.println("Apagada");
        } else if (lampada == 1) {
            System.out.println("Ligada");
        } else if (lampada == 2) {
            System.out.println("Meia-luz");
        } else {
            System.out.println("Erro");
        }
       
    }
}
