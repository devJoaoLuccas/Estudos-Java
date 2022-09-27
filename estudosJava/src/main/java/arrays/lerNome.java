package arrays;

import java.util.Scanner;

public class lerNome {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            String[] nomes = new String[10];
            
        for(int i = 0; i < nomes.length; i++) {
            System.out.println("Insira um nome:");
            nomes[i] = scan.nextLine();
        }
        
        System.out.println("Imprimindo nomes:");
        
        for (String nome : nomes) {
            System.out.println(nome);
        }
        
        System.out.println("Finalizando programa.");
        
    }
    
}
