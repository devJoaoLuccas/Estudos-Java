package poo;

import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
         System.out.println("Insira o nome do Aluno:");
            String nome = scan.nextLine();
            
         System.out.println("Insira o curso:");
            String curso = scan.nextLine();    
            
        System.out.println("Insira o número de matricula:");
            int numero = scan.nextInt();
                     
        System.out.println("Insira o ano de ingresso:");
            int anoIngresso = scan.nextInt();
            
        System.out.println("Informe quantas disciplinas você está matriculado:");
            int disciplinas = scan.nextInt();
                
        
        
        AlunoUniversidade aluno = new AlunoUniversidade(nome, numero, 2022, curso);
        aluno.matricular(disciplinas);
        aluno.calcularPermanencia(anoIngresso, 2022);
        aluno.calcularMensalidade((float) disciplinas);
        aluno.imprimirAluno();
   
        
    }
    
}
