package procedimentos;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int termos;
            
        System.out.print("Insira a quantidade de termos:");
            termos = scan.nextInt();
        
        fibonacci.calcularFibonacci(termos);
        
    }
    
    public static void menu(){
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                      Seja bem vindo!                              |");
        System.out.println("|Esse é um programa feito para executar uma seríe de Fibonacci.     |");
        System.out.println("|Só é nescessário inserir a quantidade de termos.                   |");
        System.out.println("---------------------------------------------------------------------");
          
    }    
    
    public static int calcularFibonacci(int n) {
        
            int atu = 1, ant = 1, r = 0;
        
        System.out.println(ant);    
        System.out.println(atu);    
        
        for(int i = 2; i < n; i++) {
            
                r = atu + ant;
               
        System.out.println(r); 
    
                ant = atu;
                atu = r;
        
        }       
               
        return r;    
    }
    
    
    
}
