package heranca3;

public class livroDidatico extends modeloDeVenda{

        private String bookDidatic, summary; 
        
    public livroDidatico(String nome, String autor, String editora, String sumario, float preco, String tipoDoLivro) {
        
        super(nome, autor, preco, editora);
        this.bookDidatic = tipoDoLivro;
        this.summary = sumario;
        
    }
    
    @Override
    public void printBook() {
        
        System.out.printf("Título: %s\n" , this.bookName);
        System.out.printf("Autor: %s\n", this.author);
        System.out.printf("Editora: %s\n", this.publishing);
        System.out.printf("Preço: R$%.2f\n", this.salePrice());
        System.out.printf("Didática: %s\n", this.bookDidatic);
        
    }
    
    public void summary() {
        
        System.out.printf("Consultar o summario:\n");
        System.out.printf("%s\n", this.summary);
        
    }
    
    @Override
    public float salePrice() {
        
        float salePrice = 0;
        
        salePrice = (this.price * 0.6f) + this.price;
    
    return salePrice;    
    }

    public String getBookDidatic() {
        return bookDidatic;
    }

    public void setBookDidatic(String bookDidatic) {
        this.bookDidatic = bookDidatic;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
