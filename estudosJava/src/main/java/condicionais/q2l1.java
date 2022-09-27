package condicionais;

import java.util.Scanner;

public class q2l1 {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
                
            float valorDaLampada;
            String modeloDaLampada;
            int unidadeDeLampadas;
            
        System.out.println("Informe o valor da lâmpada:");
            valorDaLampada = ler.nextFloat();
        
        System.out.println("Informe o modelo da lâmpada:");
            modeloDaLampada = ler.next();
        System.out.println("Informe quantas unidades a loja possui:");
            unidadeDeLampadas = ler.nextInt();
            
        System.out.println("Informações desse modelo de lâmpada " + modeloDaLampada + ":");             
        System.out.println("Valor da lâmpada: " + valorDaLampada);
        System.out.println("A loja tem " + unidadeDeLampadas + " desse unidade de lâmpada.");
            
    }
}
