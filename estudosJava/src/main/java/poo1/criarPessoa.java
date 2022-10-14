package poo1;

import java.util.Scanner;

public class criarPessoa {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            pessoa Joao = new pessoa();
            
        System.out.println("Insira o nome da pessoa: ");    
            String nome = scan.nextLine();
        
        System.out.print("Insira a data de nascimento: ");
            int dia = scan.nextInt();
            int mes = scan.nextInt();
            int ano = scan.nextInt();
           
        System.out.println("Insira a altura: ");  
            double altura = scan.nextDouble();
            
        Joao.setNome(nome);
        Joao.setDia(dia);
        Joao.setMes(mes);
        Joao.setAno(ano);
        Joao.setAltura(altura);
        
        System.out.println("");
        Joao.imprimirPessoa();
        System.out.println("");
            
        System.out.println("Insira o ano atual:");
            int anoAtual = scan.nextInt();
            
        Joao.calcularIdade(anoAtual);
            
            
    }
}
