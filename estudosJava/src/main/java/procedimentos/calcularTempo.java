package procedimentos;

import java.util.Scanner;

public class calcularTempo {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
            int distancia = inserirDistancia();
        
        calcularTempo.menu();
        
            int meioDeTransporte;
          
        System.out.println("Faça sua escolha: ");
            meioDeTransporte = ler.nextInt();
            
        calcularTempo.calculoTempo(distancia, meioDeTransporte);
                     
    }
    
    public static void menu(){
        
        System.out.println("-------------------------------");  
        System.out.println("| Menu de meio de transportes:|");    
        System.out.println("| 1. Ônibus                   |");
        System.out.println("| 2. Avião                    |");
        System.out.println("| 3. Navio                    |");
        System.out.println("| 4. Sair                     |");
        System.out.println("-------------------------------");
        
        
    }
    
    public static int inserirDistancia() {
        
        Scanner ler = new Scanner(System.in); 
        
            int distancia;
            
        System.out.println("Insira a distância, em KM, a ser pecorrida: ");
            distancia = ler.nextInt();
            
        return distancia;        
    }
    
    public static int calculoTempo(int x, int y) {
        
                int resultado = 0;
                int resto = 0; 
                
            switch(y) {
                
                case 1:
                    y = 70;
                    resultado = x / y;
                    resto = x % y; 
                    System.out.println(resultado + "hrs" + resto + "min");
                    break;
                    
                case 2:
                    y = 500;
                    resultado = x / y;
                    resto = x % y;
                    System.out.println(resultado + "hrs" + resto + "min");
                    break;
                    
                case 3:
                    y = 40;
                    resultado = x / y;
                    resto = x % y;
                    System.out.println(resultado + "hrs" + resto + "min" );
                    break;
                    
                case 4:
                    System.out.println("Finalizando o progama");
                    break; 
                    
                default:
                    System.out.println("Erro.");
                    break;
            }
        
        return resultado;    
    }
                
            
}
            
        
    
        
    
