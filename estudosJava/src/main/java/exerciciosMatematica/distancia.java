package exerciciosMatematica;

import java.util.Scanner;

public class distancia {
    public static void main(String[] args) {
        
            int distancia = inserirDistancia();
            
            int calculo;
            
            calculo = (distancia * 2);
            
        System.out.println(calculo + " minutos");    
        
    }
    public static int inserirDistancia() {
        
        Scanner scan = new Scanner(System.in);
        
            int distancia;
        
        System.out.println("Insira a distância:");
            distancia = scan.nextInt();
            
    return distancia;
    }
    
}
