package arrays;

import java.util.Scanner;

public class somaVetor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int tamanho;
            
        System.out.println("Insira o tamanho do vetor:");
            tamanho = scan.nextInt();
        
            int[] numero = new int[tamanho];
            
        for(int i = 0; i < numero.length; i++) {
            System.out.println("Insira um número:");
                numero[i] = scan.nextInt();
        }    
        
            int resultado = 0;
            
        for(int i = 0; i < numero.length; i++) {
            resultado += numero[i];
        }
        
        System.out.println(resultado);
    }
    
}
