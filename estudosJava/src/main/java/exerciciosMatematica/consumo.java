package exerciciosMatematica;

import java.util.Scanner;

public class consumo {
    public static void main(String[] args) {
        
            int distancia = inserirKM();
            double combustivelPLitro = inserirGasolinaPorLitro();
            double kml;
            
            kml = distancia / combustivelPLitro;
        
        System.out.println(kml + "   km/l");
        
    }
    
    public static int inserirKM() {
        
        Scanner scan = new Scanner(System.in);
        
            int km;
            
        System.out.println("Insira a distancia total pecorrida (em KM):"); 
            km = scan.nextInt();
            
    return km;
    
    }
    
    public static double inserirGasolinaPorLitro() {
        
        Scanner scan = new Scanner(System.in);
        
            double gasolinaPorLitro;
            
        System.out.println("Insira o total de combústivel gasto (em L):");
            gasolinaPorLitro = scan.nextDouble();
            
    return gasolinaPorLitro;        
        
    }
    
}
