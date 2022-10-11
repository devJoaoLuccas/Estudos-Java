package poo;

public class remedio {

    private String nome;
    private String principio;
    private float preco;
    private float precoDeVenda;
    
    public remedio(String nome, String principio, float preco) {
        
        this.nome = nome;
        this.principio = principio;
        this.preco = preco;
             
    }
    
    public remedio(String nome, float preco) {
        
        this.nome = nome;
        this.principio = nome;
        this.preco = preco;
        
    }
    
    public void precoDeVenda(float lucro) {
        
        
        this.precoDeVenda = this.preco * (lucro / 100);
        
    }
    
    public void precoDeVenda() {
        
        this.precoDeVenda = (float) (this.preco * 0.3);
        
    }
    
    
    public void imprimirRemedio () {
        
        System.out.println("Nome = " + this.nome);
        System.out.println("Principio = " + this.principio);
        System.out.println("Preço = " + this.preco);
        System.out.println("Preço de Venda = " + this.precoDeVenda);
        
    }
    
    
    
    
}
