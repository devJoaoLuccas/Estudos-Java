package classeAbstrata;

public abstract class seguro {

        protected String name;
        protected float price;
    
    public seguro(String nome, float preco) {
        
        this.name = nome;
        this.price = preco;
        
    }    
    
    public abstract void print();
    public abstract float priceValue();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
        
}
