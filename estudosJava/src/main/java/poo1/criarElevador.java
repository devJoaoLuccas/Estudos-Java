package poo1;

import java.util.Scanner;

public class criarElevador {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        elevador elevador1 = new elevador();
        
        System.out.println("Insira a quantidade de andares do prédio:");
            int totalDeAndares = scan.nextInt();
            
                elevador1.setTotalDeAndares(totalDeAndares);
            
        System.out.println("Insira a capacidade máxima do elevador:");
            int capacidadeMaxima = scan.nextInt();
                        
                elevador1.setCapacidadeMaxima(capacidadeMaxima);
            
                System.out.println("");
                elevador1.inicializar(totalDeAndares, capacidadeMaxima);
                System.out.println(""); 
        
        System.out.println("Insira quantas pessoas vão entrar no elevador:");
            int entradaDePessoa = scan.nextInt();
            
        System.out.println("Insira a capacidade atual do elevador:");
            int capacidadeAtual = scan.nextInt();
            
                elevador1.setCapacidadeAtual(capacidadeAtual);
   
                System.out.println(""); 
                elevador1.entrar(entradaDePessoa);
                System.out.println(""); 
        
        System.out.println("Insira quantas pessoas vão sair do elevador:");
            int saida = scan.nextInt();
            
                System.out.println("");
                elevador1.sai(saida);
                System.out.println(""); 
        
        System.out.println("Insira o andar atual do elevador:");    
            int andarAtual = scan.nextInt();
        
                elevador1.setAndarAtual(andarAtual);
                
        System.out.println("Insira o andar desejado para descer:");
            int andarDesejado = scan.nextInt();
                
                System.out.println("");
                elevador1.descer(andarDesejado);
                System.out.println(""); 
                
        System.out.println("Insira o andar que você deseja subir:");
            andarDesejado = scan.nextInt();
                
                System.out.println("");
                elevador1.subir(andarDesejado);
                System.out.println(""); 
            
    }
    
    
}
