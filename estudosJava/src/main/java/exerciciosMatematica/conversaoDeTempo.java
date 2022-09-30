package exerciciosMatematica;

import java.util.Scanner;

public class conversaoDeTempo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o tempo em segundos:");
            int tempo = scan.nextInt();
        
            int hora, minutos, segundos;
            
            hora = tempo / 3600;
                tempo %= 3600;
            
            minutos = tempo / 60;
                tempo %= 60;
            
            segundos = tempo;
            
        System.out.println(hora + ":" + minutos + ":" + segundos);
        
    }
    
}
