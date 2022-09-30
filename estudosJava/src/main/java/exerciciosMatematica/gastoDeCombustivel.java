package exerciciosMatematica;

import java.util.Scanner;

public class gastoDeCombustivel {
    public static void main(String[] args) {
        
            double tempo = inserirTempoDeViagem();
            double velocidade = inserirVelocidadeMedia();
            double distancia = velocidade * tempo;
            double gasolinaGasta;
            
            gasolinaGasta = distancia / 12;
            
        System.out.println(gasolinaGasta);
                  
    }
        
    public static double inserirTempoDeViagem() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o tempo gasto na viagem (em horas):");      
            double tempo = scan.nextDouble();
            
    return tempo;        
    }
    
    public static double inserirVelocidadeMedia() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a velocidade média (em km/h:");
            double velocidade = scan.nextDouble();
            
    return velocidade;        
    }
    
}
