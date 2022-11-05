package classeAbstrata;

public class seguroResidencial extends seguro{

        private String address;
        private int yearOfConstruction;
        
    public seguroResidencial(String nome, float preco, String endereco, int ano) {
        
        super(nome, preco);
        this.address = endereco;
        this.yearOfConstruction = ano;
        
    }    
    
    @Override
    public void print() {
        
        System.out.printf("Seguro Residencial:\n");
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Valor da apólice: %.2f\n", priceValue());
        System.out.printf("Endereço: %s\n", this.address);
        System.out.printf("Ano de construção: %d\n", this.yearOfConstruction);
        
        
    }
    
    @Override
    public float priceValue() {
        
        float priceValue = 0;
        int year = 2022;
        int pastTime;
        
        pastTime = year - this.yearOfConstruction;
        
        priceValue = this.price - (pastTime * 0.002f);
        
    return priceValue;    
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getYearOfConstruction() {
        return yearOfConstruction;
    }

    public void setYearOfConstruction(int yearOfConstruction) {
        this.yearOfConstruction = yearOfConstruction;
    }
    
    
}
