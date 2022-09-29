package arrays;

import java.util.Scanner;

public class selecaoVetor {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            double[] a = new double[10]; 
            
        for (int i = 0; i < a.length; i++) {
            
            
            System.out.println("Insira um número:");
                a[i] = scan.nextDouble();
                
        }
        
        for (int i = 0; i < a.length; i++) {
            
            if (a[i] <= 10.0) {
                System.out.println("a["+ i +"] = " + a[i]);
            } 
            
        }
        
        
    }
}
