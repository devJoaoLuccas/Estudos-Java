package procedimentos;

import java.util.Scanner;

public class reajusteSalarial {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int salario, ajusteFinal; 
        
        System.out.println("Insira o seu salário:");
            salario = scan.nextInt();
            
            int reajuste = reajustar(salario);
            ajusteFinal = reajuste + salario;
        
        System.out.println("O valor do salário foi " + salario + " e o reajuste foi " + reajuste);
        System.out.println("O ajuste final foi " + ajusteFinal);
        
    }
    
    public static int reajustar(int x) {
        
            int reajustar = 3;
        
        if (x <= 1000) {
            reajustar = (int) (x *0.30);
        } if (x > 1000 && x <= 2000) {
            reajustar = (int) (x * 0.20);
        } if (x > 2000 && x <= 3000) {
            reajustar = (int ) (x * 0.15);
        } if (x > 3000) {
            reajustar = (int) (x * 0.08);
        }
        
        return reajustar;
        
    } 
       
    
        
    
}
