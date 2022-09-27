package procedimentos;

import java.util.Scanner; 

public class permutaçao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
            int n, k;
            
        permutaçao.bemVindo();    
        
        System.out.println("Insira o valor de N:");
            n = scan.nextInt();
        
        System.out.println("Insira o valor de K:");
            k = scan.nextInt();
            
        // valor de permutação, P = n!   
         
            int p = permutaçao.fatoração(n); 
        
        System.out.println("O valor da permutação de N é: " + p);
        
        // valor do arranjo, A = (n - k)!

            float a = permutaçao.fatoração(n - k);
            float arranjo = p/a;

        System.out.println("O valor do arranjo foi: " + arranjo);
        
        // valor de combinação. C = n!/(k!*(n - k)!) 

            int c = permutaçao.fatoração(k);
            float combinacao = p/(c*a);
                    
        System.out.println("O valor da combinação foi: " + combinacao);
        
        
}    
       
    public static int fatoração (int x) {
            int resultado = 1;
        
        for (int i = x; i > 0; i--) {
            resultado *= i;
    }
       
        return resultado;

}

    public static void bemVindo() {
        System.out.println("Bem vindo ao progama, aqui vamos calcular o arranjo, a permutação e a combinação!");
}
    

}    
    



