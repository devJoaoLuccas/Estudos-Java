
package procedimentos;

import java.util.Scanner;

public class calculadoraSimples2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            boolean continuar = true;
            float n1, n2;
        
    while (continuar) {
        calculadoraSimples2.menu();  
        
        System.out.println("Escolha a opção:");
            int operacao = scan.nextInt();
        
        switch (operacao) {
            case 1: 
                
                System.out.println("Insira o primeiro número:"); 
                n1 = scan.nextFloat();
                
                System.out.println("Insira o segundo número:");
                n2 = scan.nextFloat();            
            
                calculadoraSimples2.adicao(n1, n2);
                break;
                
            case 2:
                
                System.out.println("Insira o primeiro número:"); 
                n1 = scan.nextFloat();
                
                System.out.println("Insira o segundo número:");
                n2 = scan.nextFloat(); ;  
                
                calculadoraSimples2.subtracao(n1, n2);
                break;
                
            case 3:   
                
                System.out.println("Insira o primeiro número:"); 
                n1 = scan.nextFloat();
                
                System.out.println("Insira o segundo número:");
                n2 = scan.nextFloat();   
                
                calculadoraSimples2.multiplicacao(n1, n2);
                break;
                
            case 4:     
                
                System.out.println("Insira o primeiro número:"); 
                n1 = scan.nextFloat();
                
                System.out.println("Insira o segundo número:");
                n2 = scan.nextFloat();  
                
                calculadoraSimples2.divisao(n1, n2);
                break;
                
                
            case 5: 
                
               System.out.println("Finalizando a calculadora.");
               continuar = false;            
               break;  
               
            default: 
                
                System.out.println("Operação inválida.");
                break;
        }
    }    
                
            
            
      
      
}    
    
    public static void menu() {
        
        System.out.println("----------------------");  
        System.out.println("| 1. Adição           |");    
        System.out.println("| 2. Subtração        |");
        System.out.println("| 3. Multiplicação    |");
        System.out.println("| 4. Divisão          |");
        System.out.println("| 5. Sair             |");
        System.out.println("----------------------");
}
    
    public static float adicao(float x, float n) {
    
            float resultado; 
    
            resultado = x + n; 
    
        System.out.println("O resultado da soma foi: " + resultado);    
    
    return resultado;
}    
      public static float subtracao(float x, float n) {
    
            float resultado; 
    
            resultado = x - n; 
    
        System.out.println("O resultado da subtracao foi: " + resultado);    
    
    return resultado;
}       
    
      public static float multiplicacao(float x, float n) {
    
            float resultado; 
    
            resultado = x * n; 
    
        System.out.println("O resultado da multiplicação foi: " + resultado);    
    
    return resultado;
}       
    
    public static float divisao(float x, float n) {
    
            float resultado; 
    
            if (n == 0) {
                System.out.println("Não é possível dividir por zero.");
            }  else {
                resultado = x / n;
                System.out.println("O resultado da divisao foi: " + resultado);  
                return resultado;
            }
        return 0;
        
}      
   
}    
   
      
    
        


    