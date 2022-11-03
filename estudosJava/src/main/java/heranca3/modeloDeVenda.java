package heranca3;

public class modeloDeVenda {
    
        protected String bookName, author, publishing;
        protected float price;
        
    public modeloDeVenda(String nome, String autor, float preco, String editora) {
        
        this.bookName = nome;
        this.author = autor;
        this.price = preco;
        this.publishing = editora;
        
    }   
    
    public void summary() {
        
    }
    
    public void printBook() {       
    }
    
    public float salePrice() {
        
    return this.price;    
    }


}
