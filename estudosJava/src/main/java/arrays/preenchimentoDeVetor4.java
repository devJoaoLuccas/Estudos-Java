package arrays;

import java.util.Scanner;

public class preenchimentoDeVetor4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            int numero;
            int[] par = new int[5];
            int[] impar = new int[5];
            int contadorPar = 0;
            int contadorImpar = 0;
            
        for (int i = 0; i < 15; i++) {
            
            System.out.println("Insira um número:");
                numero = scan.nextInt();
                        
            if (numero % 2 == 0) {
                
                par[contadorPar] = numero;
                
            contadorPar++;         
            
            } else {
               
               impar[contadorImpar] = numero;
               
              contadorImpar++;  
              
              }
            
            if(contadorPar == 5) {
                
            contadorPar = 0;
            
                for(int j = 0; j < par.length; j++) {
                    
                System.out.println("par[" + j + "] =" + par[j]);
                
                }        
            }
            
            if(contadorImpar == 5) {
                
            contadorImpar = 0;
                
                for (int k = 0; k < impar.length; k++){
                    
                System.out.println("impar[" + k + "] = " + impar[k]);
                
                }
            
        
            }
            
                
                
        }
        
        for (int i = 0; i < contadorImpar; i ++) {
            
            System.out.println("par[" + i + "] =" + par[i]);
            
        }
        
        for (int i = 0; i < contadorPar; i ++) {
            
            System.out.println("impar[" + i + "] = " + impar[i]);
            
        }
            
            
        
    }
}
