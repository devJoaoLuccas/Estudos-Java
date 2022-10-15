package poo1.teste;

import java.util.Scanner;

public class executarTempo {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        tempo tempo = new tempo();
        
        System.out.println("Insira as horas:");
            int horas = scan.nextInt();
            
        System.out.println("Insira os minutos:");
            int minutos = scan.nextInt();
            
        System.out.println("Insira os segundos:");
            int segundos = scan.nextInt();
       
        tempo.setHora(horas);
        tempo.setMinuto(minutos);
        tempo.setSegundo(segundos);
        
        System.out.println(tempo.getHora() + ":" + tempo.getMinuto() + ":" + tempo.getSegundo());
            
        
    }
}
