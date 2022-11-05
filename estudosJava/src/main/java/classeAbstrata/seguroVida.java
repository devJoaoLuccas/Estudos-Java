package classeAbstrata;

public class seguroVida extends seguro {

        private int age;
        
    public seguroVida(String nome, float preco, int idade) {
        
        super(nome, preco);
        this.age = idade;
        
    }
    
    @Override
    public void print() {
        
        System.out.printf("Seguro de vida:\n");
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Valor da apólice: %.2f\n", priceValue());
        System.out.printf("Idade de %s: %d\n", this.name, this.age);
              
    }
    
    @Override
    public float priceValue() {
        
        float priceValue = 0;
        
        if (this.age < 50) {
            
            priceValue = (0.10f * this.price) + this.price;
        
        return priceValue;    
        } else {
           
        return priceValue;    
        }
              
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
