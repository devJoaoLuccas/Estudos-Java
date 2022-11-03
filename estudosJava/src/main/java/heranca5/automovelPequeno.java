package heranca5;

public class automovelPequeno extends automovel {

        private String model;
    
    public automovelPequeno(String placa, int ano, String modelo) {
        
        super(placa, ano);
        this.model = modelo;
        
    }
    
    @Override 
    public void print() {
        
        System.out.printf("Automovel Pequeno\n");
        System.out.printf("Placa: %s\n", this.board);
        System.out.printf("Ano: %d\n", this.year);
        System.out.printf("Modelo: %s\n", this.model); 
        System.out.printf("Preço a pagar: %.2f", price());
        
    }
       
    @Override
    public float price() {
        
       float price = 0;
       
       price = 6f;
      
    return price;   
    }
    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    
    
}
