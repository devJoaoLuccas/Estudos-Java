package poo2;

import java.util.Scanner;

public class aplicacao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de funcionários:");
            int qnt = scan.nextInt();
        
        setorPessoal SP = new setorPessoal(qnt);
        funcionario objFun;
        
        for(int i = 0; i < qnt; i++) {
            
            System.out.println("Insira o número de mátricula do funcionário:");
                int nMatricula = scan.nextInt();
                
            System.out.println("Insira o número do departamento do funcionário:");
                int nDepartamento = scan.nextInt();
                scan.nextLine();
                
            System.out.println("Insira o nome do funcionário:");  
                String nome = scan.nextLine();
                
            System.out.println("Insira a função do funcionário:"); 
                String funcao = scan.nextLine();
                
            System.out.println("Insira o salário do funcionário:");
                float salario = scan.nextFloat();
                
            objFun = new funcionario(nMatricula, nDepartamento, nome, funcao, salario);    
            SP.addFuncionario(objFun);
            
        }
        
        System.out.println("");
        
        SP.mostrarDepartamento(1);
        System.out.println("");
        SP.imprimirFolha();
        System.out.println("");
        SP.imprimirMaiorFolha();
        System.out.println("");
        System.out.println("O salario total da empresa é: " + SP.salarioTotal());
        System.out.println("");
        System.out.println("O maior salário da empresa pertence a " 
                           + SP.funcionario[SP.maiorIndice()].getNome() 
                           + " com o salário de " + SP.funcionario[SP.maiorIndice()].getSalario());
        System.out.println("");
        
        
        
    }

    
}
