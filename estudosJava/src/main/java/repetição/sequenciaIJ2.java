package repetição;


public class sequenciaIJ2 {
    public static void main(String[] args) {
    
            int contador = 0;
            int sequencia = 7;    
    
        for (int i = 1; i <= 9;) {
            
            System.out.println("I = " + i + " J = " + sequencia);
            
            sequencia --;
            contador ++;
            
            if (contador == 3){
            
            i += 2;
            contador = 0;
            sequencia = 7;
            }
            
        }
        
    
    }    
}
