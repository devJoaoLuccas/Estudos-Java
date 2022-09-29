package exerciciosMatematica;

import java.util.Scanner;

public class distanciaEntreDoisPontos {
    public static void main(String[] args) {
        
            double x1 = inserirX1();
            double y1 = inserirY1();
            double x2 = inserirX2();
            double y2 = inserirY2();
            double distancia;
            
            distancia = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
                  
        System.out.println("O valor da distância é = " + distancia);
        
        
    }
    
    public static double inserirX1() {
        
        Scanner scan = new Scanner(System.in);
        
            double x1;
            
        System.out.println("Insira o x1:");
            x1 = scan.nextDouble();
            
    return x1; 
            
    }
    
    public static double inserirX2() {
        
        Scanner scan = new Scanner(System.in);
        
            double x2;
            
        System.out.println("Insira o x2:");
            x2 = scan.nextDouble();
            
    return x2; 
            
    }
    
    public static double inserirY1() {
        
        Scanner scan = new Scanner(System.in);
        
            double y1;
            
        System.out.println("Insira o y1:");
            y1 = scan.nextDouble();
            
    return y1; 
            
    }
    
    public static double inserirY2() {
        
        Scanner scan = new Scanner(System.in);
        
            double y2;
            
        System.out.println("Insira o y2:");
            y2 = scan.nextDouble();
            
    return y2; 
            
    }
}
