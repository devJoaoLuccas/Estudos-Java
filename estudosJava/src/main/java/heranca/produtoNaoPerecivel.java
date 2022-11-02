package heranca;

public class produtoNaoPerecivel extends produto{
   
    
    public produtoNaoPerecivel(int codigo, String nome, float preco) {
        
        super(codigo, nome, preco);
                       
    }
    
    @Override
    public float precoVenda() {
        
    return this.preco; 
    }

    
    
}
