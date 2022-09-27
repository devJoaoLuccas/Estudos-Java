package repetição;

import java.io.IOException;
import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
        
            double n1, n2, resultado;
            char operacao;
        
        System.out.println("------------------");
        System.out.println("-- Calculadora --");
        System.out.println("------------------");
        
        System.out.println("Insira o número desejado:");
            n1 = ler.nextDouble();    
        
        System.out.println("Insira o número desejado:");
            n2 = ler.nextDouble();
            
        System.out.println("Escolha a próxima operação(+, -, /, *):");
            operacao = (char)System.in.read();
            
        switch(operacao) {
            case '+': 
                resultado = n1 + n2; 
                System.out.println("O resultado da soma foi " + resultado);
                break;
            case '-':
                resultado = n1 - n2;
                System.out.println("O resultado da subtração foi " + resultado);
                break;
            case '/':
                if (n2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    resultado = n1 / n2;
                    System.out.println("O resultado da divisão " + resultado);
                }
                break;
            case '*':
                resultado = n1 * n2;
                System.out.println("O resultado da subtração foi " + resultado);
                break;
            default: 
                System.out.println("Erro, caractere não é valído");
                break;
        }
        
        System.out.println("Fim do progama.");
                        
    }
}
