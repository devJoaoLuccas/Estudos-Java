package procedimentos;

import java.util.Scanner;

public class pesoIdeal {
        
    public static void main(String[] args) {
    
        
        pesoIdeal.menu();
        
                float vPesoIdeal;            
                int sexo = inserirSexo();
                float altura = inserirAltura();
                         
        switch(sexo) {
            case 1: 
               
                vPesoIdeal = (72 * altura) - 58;
            
            System.out.println("O seu peso ideal é " + vPesoIdeal);
            break;
                
            case 2:
                
                vPesoIdeal = (62 * altura) - 44;
            
            System.out.println("O seu peso ideal é " + vPesoIdeal);
            break;
             
            default:
            
            System.out.println("Erro");    
                
        }
            
            System.out.println("Fim do progama.");
    
   }    
     
    public static void menu() {
        
        System.out.println("---------------------------------------------------------------------");
        System.out.println("|                      Seja bem vindo!                              |");
        System.out.println("|Esse é um programa feito para calcular o peso ideal de uma pessoa. |");
        System.out.println("|Se você for homem, escolha a opção 1.                              |");
        System.out.println("|Se for mulher, escolha a opção 2.                                  |");
        System.out.println("---------------------------------------------------------------------");
    }
      
    public static float inserirAltura() {
        
        Scanner scan = new Scanner(System.in);
        
            float inserirAltura;
        
        System.out.println("Insira sua altura");
            inserirAltura = scan.nextFloat();
        
        return inserirAltura;
    }
   
    public static int inserirSexo() {
        
        Scanner scan = new Scanner(System.in);   
       
            int inserirSexo;
        
        System.out.println("Insira o seu sexo :");    
            inserirSexo = scan.nextInt();
            
        return inserirSexo;    
    }
    
    
}  
            
            
    
    
    
