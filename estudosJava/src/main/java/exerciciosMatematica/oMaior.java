package exerciciosMatematica;

import java.util.Scanner;

public class oMaior {
    public static void main(String[] args) {
        
            int numero1 = inserirNumero1();
            int numero2 = inserirNumero2();
            int numero3 = inserirNumero3();
            
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.println("O maior número é: " + numero1);
        } if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior número é: " + numero2);
        } if(numero3 > numero1 && numero3 > numero2) {
            System.out.println("O maior número é: " + numero3);
        }
        
    }
    
    public static int inserirNumero1() {
        
        Scanner scan = new Scanner(System.in);
        
            int n1;
        
        System.out.println("Insira o número 1:");
            n1 = scan.nextInt();
            
    return n1;
     
    }
            
    
    public static int inserirNumero2() {
        
        Scanner scan = new Scanner(System.in);
        
            int n2;
        
        System.out.println("Insira o número 2:");
            n2 = scan.nextInt();
            
    return n2;
        
    }
    
    public static int inserirNumero3() {
        
       Scanner scan = new Scanner(System.in);
        
            int n3;
        
        System.out.println("Insira o número 3:");
            n3 = scan.nextInt();
            
    return n3; 
        
    }
}
