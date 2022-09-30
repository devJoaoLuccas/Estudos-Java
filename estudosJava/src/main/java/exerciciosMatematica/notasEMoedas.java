package exerciciosMatematica;

import java.util.Scanner;

public class notasEMoedas {
    public static void main(String[] args) {
        
            double dinheiro = inserirValor();
            double resposta100, resposta50, resposta20, resposta10, resposta5, resposta2, resposta1;
            double resposta010, resposta050, resposta025, resposta005, resposta001;
        
       
            resposta100 = (int) (dinheiro / 100);
                dinheiro %= 100;
            
            resposta50 = (int) (dinheiro / 50);
                dinheiro %= 50;
            
            resposta20 = (int) (dinheiro / 20);
                dinheiro %= 20;
            
            resposta10 = (int) (dinheiro / 10);
                dinheiro %= 10;
            
            resposta5 = (int) (dinheiro / 5);
                dinheiro %= 5;
            
            resposta2 = (int) (dinheiro / 2);
                dinheiro %= 2;
            
            resposta1 = (int) (dinheiro / 1);
                dinheiro %= 1;
            
            resposta050 = (int) (dinheiro / 0.50);
                dinheiro %= 0.50;
            
            resposta025 = (int) (dinheiro / 0.25);
              dinheiro %= 0.25;
              
            resposta010 = (int) (dinheiro / 0.10);
                dinheiro %= 0.10;
                
            resposta005 = (int) (dinheiro / 0.05);
                dinheiro %= 0.05;
                
            resposta001 = (int) (dinheiro / 0.01);
                dinheiro %= 0.01;
            
                
        System.out.println(" --- NOTAS: ---");    
        System.out.println(resposta100 + " nota(s) de 100,00");
        System.out.println(resposta50 + " nota(s) de 50,00");
        System.out.println(resposta20 + " nota(s) de 20,00");
        System.out.println(resposta10 + " nota(s) de 10,00");  
        System.out.println(resposta5 + " nota(s) de 5,00");
        System.out.println(resposta2 + " nota(s) de 2,00");
        System.out.println(" --- MOEDAS: ---");
        System.out.println(resposta1 + " moeda(s) de 1,00");
        System.out.println(resposta050 + " moeda(s) de 0,50");
        System.out.println(resposta025 + " moeda(s) de 0,25");
        System.out.println(resposta010 + " moeda(s) de 0,10");
        System.out.println(resposta005 + " moeda(s) de 0,05");
        System.out.println(resposta001 + " moeda(s) de 0,01");
                 
    }
     
    public static double inserirValor() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor em Real:");
            double dinheiro = scan.nextDouble();
                    
    return dinheiro;    
    }
       
    
}
