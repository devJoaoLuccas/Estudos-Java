package arrays;

import java.util.Scanner;

public class matirzImparPar {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int[][] numero = new int[3][4];
        
        for (int i = 0; i < numero.length; i++) 
            for (int j = 0; j < numero.length; j++) {
                
                System.out.println("Insira um número na linha " + i + " e na coluna " + j);
                    numero[i][j] = scan.nextInt();    
                    
            }
        

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero.length; j++) {
                
                System.out.println("- " + numero[i][j]);
                             
            }
        }
        
        
        for(int i = 0; i < numero.length; i++) {
            for(int j = 0; j < numero.length; j++) {
                
                if (numero[i][j] % 2 == 0) {
                    numero[i][j] = 0;
                }  else {
                    numero[i][j] = 1;
                }
                
            System.out.println("- " + numero[i][j]);
                    
            }
        }
        
    }
} 
