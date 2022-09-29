package exerciciosMatematica;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
             
            float A = inserirA();
            float B = inserirB();
            float C = inserirC();
            int controleMenu; 
            boolean continuar = true;
                      
        while(continuar) {    
          area.menu();
            controleMenu = scan.nextInt();
            
            switch(controleMenu) {
            
                case 1: 
                    float areaTriangulo = areaTriangulo(A, C);
                    System.out.println("Area do Triangulo = " + areaTriangulo);
                    break;
                    
                case 2:
                    float areaCirculo = areaCirculo(C);
                    System.out.println("Area do Circulo = " + areaCirculo);
                    break;
                    
                case 3:
                    float areaTrapezio = areaTrapezio(A, B, C);
                    System.out.println("Area do Trapézio = " + areaTrapezio);
                    break;
                
                case 4:
                    float areaQuadrado = areaQuadrado(B);
                    System.out.println("Area do Quadrado = " + areaQuadrado);
                    break;
                
                case 5:    
                    float areaRetangulo = areaRetangulo (A, B);
                    System.out.println("Area do Retangulo = " + areaRetangulo);
                    break;
                    
                case 6:
                    System.out.println("Finalizando a calculadora.");
                    continuar = false;
                    break;
                    
                default:
                    System.out.println("Opção não é válida");
                    break;
            
             }
        }
    }
    
    public static float inserirA() {
        
        Scanner scan = new Scanner(System.in);
        
            float a;
        
        System.out.println("Insira o valor de A:");
            a = scan.nextFloat();
                
    return a;
        
    }
    
    public static float inserirB() {
       
        Scanner scan = new Scanner(System.in);
        
            float b;
        
        System.out.println("Insira o valor de B:");
            b = scan.nextFloat();
            
    return b;
        
    }
    
    public static float inserirC() {
       
        Scanner scan = new Scanner(System.in);
        
            float c;
        
        System.out.println("Insira o valor de C:");
            c = scan.nextFloat();
                       
    return c;
        
    }
    
    public static void menu() {
        
        System.out.println("----------------------"); 
        System.out.println("| MENU DE OPERAÇÕES   |");  
        System.out.println("| 1. Area Triangulo   |");    
        System.out.println("| 2. Area Circulo     |");
        System.out.println("| 3. Area Trapézio    |");
        System.out.println("| 4. Area Quadrado    |");
        System.out.println("| 5. Area Retangulo   |");
        System.out.println("| 6. Sair             |");
        System.out.println("----------------------");
}
    
    public static float areaTriangulo(float x, float y) {
        
            float resultado;
        
            resultado = (x * y) / 2;
        
    return resultado;
        
    }
    
    public static float areaCirculo(float x) {
        
            float resultado;
        
            resultado = (float) (3.14159 * (x * x));
            
    return resultado;
        
    }
    
    public static float areaTrapezio(float x, float y, float z) {
        
            float resultado;
            
            resultado = ((x + y) * z) / 2;
               
        return resultado;
        
    }
    
    public static float areaQuadrado(float x) {
        
            float resultado;
            
            resultado = x * x;
            
        return resultado;
        
    }
    
    public static float areaRetangulo(float x, float y) {
        
            float resultado;
            
            resultado = x * y;
        
        return resultado;    
            
    }
        
    
}
