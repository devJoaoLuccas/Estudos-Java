package repetição;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
            
            int n1;
            int fat = 1;
           
        System.out.print("Insira um número:");
            n1 = ler.nextInt();
           
        for(int i = n1; i > 0; i--) {
            fat *= i;                  
        }
          System.out.println("A fatoração é: " + fat); 
    }    

}
