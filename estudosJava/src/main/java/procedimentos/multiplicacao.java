package procedimentos;

import java.util.Scanner;

public class multiplicacao {
    public static void main(String[] args){
        
        multiplicacao.menu();
        
            int num1 = inserirNumero1();
            int num2 = inserirNumero2();
            int resposta = 0;
            
        for(int i = 0; i < num2; i++) {
            
            resposta += num1;  
         
        }
         
        System.out.println("O resultado da multiplicação foi " + resposta);
   
    }
    
    public static void menu(){
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                      Seja bem vindo!                              |");
        System.out.println("|Esse é um programa feito para executar uma multiplicação.          |");
        System.out.println("|Só é nescessário escolher 2 números.                               |");
        System.out.println("---------------------------------------------------------------------");
          
    }
       
    public static int inserirNumero1() {
        
        Scanner scan = new Scanner(System.in);
        
            int num1;
            int num2;
        
        System.out.println("Insira o primeiro número:");
            num1 = scan.nextInt();
            
        return num1;    
        
    }
           
    public static int inserirNumero2() {
        
        Scanner scan = new Scanner(System.in);
        
            
            int num2;
        
        System.out.println("Insira o segundo número:");    
            num2 = scan.nextInt();
        
        return num2;  
            
}
    
}
    
