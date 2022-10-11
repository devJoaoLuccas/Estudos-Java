package arrays;

import java.util.Scanner;

public class menorPosicao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o tamanho do vetor:");
            int tamanho = scan.nextInt();
            
            int[] numero = new int[tamanho];
            int menor = 0, posMenor = 0;
            
            
        for(int i = 0; i < numero.length; i++) {
            
            System.out.println("Insira um número:");
                numero[i] = scan.nextInt();
                   
                if (i == 0) {
                    
                    menor = numero[i];
                    posMenor = i;
                    
                } else if (numero[i] < menor) {
                    
                    menor = numero[i];
                    posMenor = i;
                    
                }
        }     
        
        System.out.println("Menor valor = " + menor);
        System.out.println("Posição = " + posMenor);
        
        
        
        
    }
}
