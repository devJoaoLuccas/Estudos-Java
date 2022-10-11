package arrays;

import java.util.Scanner;

public class linhaNaMatriz {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            double[][] numero = new double[12][12];
            double resposta = 0;
            
        for (int i = 0; i < 12; i ++) {
            
            System.out.println("Insira os números:");
                numero[2][i] = scan.nextInt();
                
       
        } 
        
        for(int j = 0; j < 12; j ++) {
             
            resposta = numero[2][j] + numero[2][j];
            
            System.out.println(numero[2][j]);
            
            } 
        
        System.out.println(resposta);
            
        
    }
} 
