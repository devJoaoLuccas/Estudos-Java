package heranca3;

public class livraria {
    public static void main(String[] args) {
        
        modeloDeVenda java = new livroDidatico("Java - Como Programar", "Deitel", "Pearson" ,
                                              " Aprenda mais sobre o mundo da programação com Deitel", 60, "T.I");                                                        
        
        java.printBook();
        System.out.println("");
        java.summary();
        System.out.println("");
        
        modeloDeVenda vogue = new revista("Vogue - Cindy Crawford", "Luigi & Langi", 30.50f, "Vogue Company");
        modeloDeVenda vogue2 = new revista("Vogue - Bruna Marquezine", "Xolo", 50.50f, "Vogue Company");
        modeloDeVenda veja = new revista("Veja", "Bruna Marquezine", 20.99f, "Globo");
       
        vogue.printBook();
        System.out.println("");
        vogue2.printBook();
        System.out.println("");
        veja.printBook();
        System.out.println("");
        
        
        modeloDeVenda[] revistas = {vogue, veja, vogue2};
        
        for(int i = 0; i < 3; i++) {
                        
            
            if(revistas[i].publishing.equals(revistas[i].publishing)) {
                
                System.out.println(revistas[i].bookName + " tem a mesma editora de " + revistas[i].bookName);
                 
                
            } else { 
                
                System.out.println("Não é da mesma editora.");
                
            } 
        }
       
    

    }    
}
