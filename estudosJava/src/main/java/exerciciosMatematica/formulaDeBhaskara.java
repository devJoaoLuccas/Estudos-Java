package exerciciosMatematica;

import java.util.Scanner;

public class formulaDeBhaskara {
    public static void main(String[] args) {
        
            double a = inserirA();
            double b = inserirB();
            double c = inserirC();
            double delta;
            double bhaskaraPositivo;
            double bhaskaraNegativo;
              
            
            delta = (Math.pow(b, 2) - 4 * a * c);
        
        if (delta >= 0 && a != 0) {
        
            b = -b;
        
            bhaskaraPositivo = (b + Math.sqrt(delta)) / (2*a);
        System.out.println("R1 = " + bhaskaraPositivo);
            
            bhaskaraNegativo = (b - Math.sqrt(delta)) / (2 * a);
        System.out.println("R2 = " + bhaskaraNegativo);
        
        } else {
            System.out.println("Impossível calcular");
        }   
    }
    
    public static double inserirA() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de A:");
            double a = scan.nextDouble();
            
    return a;
    
    }
    
    public static double inserirB() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de B:");
            double b = scan.nextDouble();
            
    return b;
        
    }
    
    public static double inserirC() {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o valor de C:");
            double c = scan.nextDouble();
            
    return c;
        
    }
}
