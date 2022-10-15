package poo1;

import java.util.Scanner;

public class criarAgenda {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            agenda agenda1 = new agenda();

        System.out.println("Insira o nome da pessoa:");
            String nome = scan.nextLine();
            
        System.out.println("Insira a idade de " + nome +": ");    
            int idade = scan.nextInt();
            
        System.out.println("Insira a altura de " + nome + ":");    
            double altura = scan.nextDouble();
            
            agenda1.armazenaPessoa(nome, idade, idade);
            agenda1.buscaPessoa();
            System.out.println("");
            agenda1.imprimeAgenda();
            System.out.println("");
            
            
            System.out.println("");
            scan.nextLine();
                      
        agenda agenda2 = new agenda();

        System.out.println("Insira o nome da pessoa:");
            nome = scan.nextLine();
            
        System.out.println("Insira a idade de " + nome +": ");    
            idade = scan.nextInt();
            
        System.out.println("Insira a altura de " + nome + ":");    
            altura = scan.nextDouble();
            
            agenda2.armazenaPessoa(nome, idade, altura);
            agenda2.buscaPessoa();
            System.out.println("");
            agenda2.imprimeAgenda();
            System.out.println("");
   
            agenda1.imprimePessoa(1);
            
            
            
            
        
        
    }

    
}
