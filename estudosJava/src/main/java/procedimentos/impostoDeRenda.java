package procedimentos;

import java.util.Scanner;

public class impostoDeRenda {
    public static void main(String[] args) {
        
        impostoDeRenda.menu();
          
            String nome = nomeDoUsuario();
            String cpf = cpfDoUsuario();
            String ano = anoAtual();
          
        System.out.println("Esses são os seus dados:");  
        System.out.print(nome);
        System.out.print(", " + cpf);
        System.out.println(", " + ano);
              
            float salario = salarioDoUsuario();
            float iR = calcularIR(salario);
              
        
       
        System.out.println("       "  + nome +  "     ");    
        System.out.println(" Portador do CPF " + cpf + "  ");
        System.out.println(" no ano de " + ano +  "      ");
        System.out.println(" recebe o salário de " + salario + "");
        System.out.println(" vai pagar de IR " + iR + "  ");
       
            
        
    }
    
     public static void menu(){
        
        System.out.println("-------------------------------");  
        System.out.println("|       Seja bem vindo!       |");    
        System.out.println("| Para calcular o seu IR é    |");
        System.out.println("| preciso que você nos informe|");
        System.out.println("| alguns dados, eles serão    |");
        System.out.println("| solicitados!                |");
        System.out.println("-------------------------------");
        
     }    
     
    public static String nomeDoUsuario() {
        
        Scanner ler = new Scanner(System.in);
        
            String nome;
            
        System.out.println("Insira o seu nome:");
            nome = ler.nextLine();
            
    return nome;     
        
    } 
    
    public static String cpfDoUsuario() {
        
        Scanner ler = new Scanner(System.in);
        
            String cpf;
            
        System.out.println("Insira o seu CPF:");
            cpf = ler.nextLine();
            
    return cpf;     
        
    } 
         
    public static String anoAtual() {
        
        Scanner ler = new Scanner(System.in);
        
            String ano;
            
        System.out.println("Insira o ano atual:");
            ano = ler.nextLine();
            
    return ano;     
        
    } 
    
    public static float salarioDoUsuario() {
        
        Scanner ler = new Scanner(System.in);
        
            float salario;
            
        System.out.println("Insira seu salario:");
            salario = ler.nextFloat();
            
    return salario;     
        
    }  
    
    public static float calcularIR(float x) {
         
         float ir = 0;
         
         if (x <= 1903.98) {
             System.out.println("Insento do imposto de renda.");
         } if (x > 1903.98 && x <= 2826.65) {
             ir = (float) (x * 0.075);
             System.out.println("O valor a pagar de imposto de renda é:" + ir);
         } if (x > 2826.66 && x <= 3751.05) {
             ir = (float) (x * 0.15);
             System.out.println("O valor a pagar de imposto de renda é: " + ir);
         } if (x > 3751.05 && x <= 4664.68) {
             ir = (float) (x * 0.225);
             System.out.println("O valor a pagar de imposto de renda é: " + ir);
         } if (x > 4664.68) {
             ir = (float) (x * 0.275); 
             System.out.println("O valor a pagar de imposto de renda é: " + ir);
         }
             
         return ir;
     }
        
     
}
