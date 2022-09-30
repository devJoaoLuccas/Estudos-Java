package exerciciosMatematica;

import java.util.Scanner;

public class idadeEmDias {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
        System.out.println("Insira a sua idade em dias:");
            int idade = scan.nextInt(); 
            
            int ano, mes, dia; 
            
        ano = idade / 365;
            idade %= 365;
            
        mes = idade / 30;
            idade %= 30;
            
        dia = idade;
        
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dias(s)");
        
    }
}
