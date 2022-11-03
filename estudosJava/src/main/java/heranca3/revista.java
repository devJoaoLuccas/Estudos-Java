package heranca3;

public class revista extends modeloDeVenda{

    public revista(String nome, String autor, float preco, String editora) {
        
        super(nome, autor, preco, editora);
        
    }
    
    @Override
    public void printBook() {
        
        System.out.printf("Título da Revista: %s\n" , this.bookName);
        System.out.printf("Autor: %s\n", this.author);
        System.out.printf("Editora: %s\n", this.publishing);
        System.out.printf("Preço: R$%.2f\n", this.salePrice());
      
    }
    
    @Override
    public float salePrice() {
       
        float salePrice = 0;
        float percentage = 0;
        float realSalePrice = 0;
        
        percentage = (this.price * 0.6f);
        salePrice =  this.price + percentage;
        realSalePrice = salePrice + (salePrice * 0.2f);
        
    return realSalePrice;    
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

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
    
}
