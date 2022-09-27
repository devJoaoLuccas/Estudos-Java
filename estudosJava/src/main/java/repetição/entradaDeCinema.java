package repetição;

import java.util.Scanner;

public class entradaDeCinema {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
            String dataDoFilme, horario, nomeDoFilme, nomeDoCinema;
            int sala;
            float valor; 
            
        System.out.println("---------------------");
        System.out.println("- Entrada de Cinema -");
        System.out.println("---------------------");
        
        System.out.println("Insira o nome do filme:");
            nomeDoFilme = ler.nextLine();
        
        System.out.println("Insira o nome do cinema:");
            nomeDoCinema = ler.nextLine();
        
        System.out.println("Insira a data do filme:");
            dataDoFilme = ler.nextLine();
            
        System.out.println("Insira o horário do filme:");
            horario = ler.nextLine();
            
        System.out.println("Insira a sala da sessão:");    
            sala = ler.nextInt();
            
        System.out.println("Insira o valor do ingresso");
            valor = ler.nextFloat();
            
            
        System.out.println("===================================");    
        System.out.println(nomeDoFilme + " === " + nomeDoCinema);
        System.out.println("Na sala " + sala + " às " + horario);
        System.out.println("======== R$" + valor + " ==========");
    }
}
