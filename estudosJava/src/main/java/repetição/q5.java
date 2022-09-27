package repetição;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
   
            float nota, media; 
            float soma = 0;
                        
        for(int i = 0; i < 10; i ++) {
            System.out.println("Insira a nota do aluno:");
                nota = ler.nextFloat();
                soma += nota;            
        }
            media = soma / 10;
            if (media < 6) {
            System.out.println("A média da turma é: " + media + ". A turma foi reprovada."); 
            }  else {
            System.out.println("A média da turma é: " + media + ". A turma foi aprovada!");     
            }
            
            
    }
}
