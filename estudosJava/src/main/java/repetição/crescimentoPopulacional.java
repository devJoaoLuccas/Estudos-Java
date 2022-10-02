package repetição;

import java.util.Scanner;

public class crescimentoPopulacional {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Insira o número de casos de teste:");
            int casosDeTeste = scan.nextInt();
        
            
            int resultadoP1 = 0, resultadoP2 = 0;
            int porcentagemP1 = 0, porcentagemP2 = 0;
            int ano;
            
            
        for(int i = 1; i <= casosDeTeste; i++) {
            
                
                System.out.println("Indique a população da menor cidade:");
                    int p1 = scan.nextInt();
            
                System.out.println("Insira a população da maior cidade:");
                    int p2 = scan.nextInt();
            
                System.out.println("Indique o crescimento populacional da menor cidade:");
                    double crescimentoP1 = scan.nextDouble();
            
                System.out.println("Indique o crescimento populacional da maior cidade:");
                    double crescimentoP2 = scan.nextDouble();
            
          
                
                ano = 0;
                
                while (p1 <= p2) {
                
                 p1 += (p1 * crescimentoP1) / 100;
                 p2 += (p2 * crescimentoP2) / 100;
                 ano++;
                 
                    if (ano > 100) {
                        break;
                    }      
                }
                
                if (ano > 100) {
                    System.out.println("Mais de 1 século");
                } 
                if (ano <= 100) {
                    System.out.println(ano + " anos");
                }
                    
            }
            
        }    
        
        
        
    }
}
