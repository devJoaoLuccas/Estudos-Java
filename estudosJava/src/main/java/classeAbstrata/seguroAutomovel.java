package classeAbstrata;

public class seguroAutomovel extends seguro {

        private int carNumber;
        private int yearOfManufacture;
        
    public seguroAutomovel(String nome, float preco, int numero, int ano) {
        
        super(nome, preco);
        this.carNumber = numero;
        this.yearOfManufacture = ano;
        
    }    
    
    @Override
    public void print() {
        
        System.out.printf("Seguro de Automovel:\n");
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Valor da apólice: %.2f\n", priceValue());
        System.out.printf("Numero da placa: %d\n", this.carNumber);
        System.out.printf("Ano da construção: %d\n", this.yearOfManufacture);
        
        
    }
    
    @Override
    public float priceValue() {
        
        float priceValue = 0;
        int year = 2022;
        int pastTime;
        
        pastTime = year - yearOfManufacture;
        
        priceValue = (this.price * 0.90f) - (0.02f * pastTime);
        
    return priceValue;    
    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }
    
    
    
}
