package interface01;

import java.util.Scanner;

public class movimentacao {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        livro PercyJackson = new livro("Percy Jackson", "Ricky Riordan", 2014, 500);
        
        PercyJackson.print();
        PercyJackson.emprestimo();
        PercyJackson.devolucao();        
        
    }

}
