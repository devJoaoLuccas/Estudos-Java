package poo;

public class livroLivraria {
    
        private double preco;
        private int quantidade;

    public livroLivraria() {
        
        this.preco = 0;
        this.quantidade = 0;
        
    }
    
    public void compra(int quantidade) {
        
    double valor;
        
    this.quantidade = quantidade;
        
    valor = quantidade * this.preco;
        
    System.out.println("Vai ser comprado " + quantidade + " livros, por " + 
                        valor + " e cada livro vai sair por " + this.preco);
        
        
    }
    
    public void venda(int quantidade) {
        
        if (this.quantidade > quantidade) {
            
            System.out.println("É possível vender o livro. O valor dele é "
                              + this.preco + " e temos no estoque " + this.quantidade + " livros.");
            
            int estoque = this.quantidade - quantidade;
            
            System.out.println("O estoque atual de livros é " + estoque);
            
        } else {
            
            System.out.println("Não é possível vender o livro.");
            
        }
        
        
    }   
    
    public void reajuste(double porcentagem) {
        
        double valorDaPorcentagem =  ((porcentagem / 100) * this.preco);
        this.preco = this.preco + valorDaPorcentagem;
        
        System.out.println("O preço agora é " + this.preco);
        System.out.println("O reajuste foi de " + valorDaPorcentagem);
        
    }    
    

    public double getPreco() {
        
        return preco;
        
    }

    public int getQuantidade() {
        
        return quantidade;
        
    }

    public void setPreco(double preco) {
        
        this.preco = preco;
        
    }

    public void setQuantidade(int quantidade) {
        
        this.quantidade = quantidade;
        
    }
    
       
    
}
