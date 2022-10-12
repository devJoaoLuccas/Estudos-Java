package poo;

public class remedio {

    private String nome;
    private String principio;
    private float preco;
    private float precoDeVenda;
    private boolean verificar;
    
    public remedio(String nome, String principio, float preco) {
        
        this.nome = nome;
        this.principio = principio;
        this.preco = preco;
        this.verificar = false;
             
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
        System.out.println("Pode ser substituiod? " + this.verificar);
        
    }
    
    public boolean verificar(String principio) {
        
        boolean validar = true;
        
        if(principio.equals(this.principio)) {
            
            this.verificar = true;
          
            return true;
            
        }  else {
            
            
            return false;
            
        }
                          
    }

    public String getNome() {
        
        return nome;
        
    }

    public String getPrincipio() {
        
        return principio;
        
    }

    public float getPreco() {
        
        return preco;
        
    }

    public float getPrecoDeVenda() {
        
        return precoDeVenda;
        
    }

    public void setNome(String nome) {
        
        this.nome = nome;
        
    }

    public void setPrincipio(String principio) {
        
        this.principio = principio;
        
    }

    public void setPreco(float preco) {
        
        this.preco = preco;
        
    }

    public void setPrecoDeVenda(float precoDeVenda) {
        
        this.precoDeVenda = precoDeVenda;
        
    }
    
    
    
    
    
}
