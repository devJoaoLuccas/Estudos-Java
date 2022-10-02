package repetição;


public class sequenciaIJ4 {
    public static void main(String[] args) {
        
            int contador = 0;
            float sequencia = 1;
            
        for(float i = 0; i <= 2;) {
            
            System.out.println("I = " + i + " J = " + sequencia);
            
                sequencia++;
                contador++;
                
            if (contador == 3) {
                
                i += 0.2;
                sequencia += 0.2;
                sequencia--;
                contador = 0;
                
            }
            
            
        }
        
    }
}
