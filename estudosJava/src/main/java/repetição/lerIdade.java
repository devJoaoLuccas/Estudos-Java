package repetição;

import java.util.Scanner;

public class lerIdade {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        
            int idade;
            int resposta = 0;
        
        for(int i = 0; i < 15; i++) {
            System.out.println("Insira uma idade:");
                idade = ler.nextInt();
                       
            if (idade > 0 && idade <= 12) {
                resposta ++;               
            }
        }    
        
        System.out.println(" A quantidade de pessoas que possui a idade entre 0 e 12 é: " + resposta);
        
} 
    
    
}
