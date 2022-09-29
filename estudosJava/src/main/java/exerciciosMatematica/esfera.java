package exerciciosMatematica;

import java.util.Scanner;

public class esfera {
    public static void main(String[] args) {
        
            float raio = insiraRaio();
        
        System.out.println();    
        
            float volume = calculoVolume(raio);
        
    }
    
    public static float insiraRaio() {
        
        Scanner scan = new Scanner(System.in);
        
            float r;
            
        System.out.println("Insira o valor do raio:");
            r = scan.nextFloat();
            
    return r;    
        
    }
    
    public static float calculoVolume(float x) {
        
            float v;
            
            v = (float) ((4/3.0) * 3.14159 * (x * x * x));
        
        System.out.println("Volume da esfera = " + v);
        
    return v;
        
    }
}
