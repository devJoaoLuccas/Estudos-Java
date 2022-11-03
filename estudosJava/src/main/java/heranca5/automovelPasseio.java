package heranca5;

public class automovelPasseio extends automovel {

        private int maxPassangers;
    
    public automovelPasseio(String placa, int ano, int maxPassageiros) {
        
        super(placa, ano);
        this.maxPassangers = maxPassageiros;
        
    }    
        
   
    @Override
    public float price() {
        
        float price = 0;
        
        price = this.registerCar * (5.0f * this.maxPassangers);
    
    return price;    
    }
    
    @Override 
    public void print() {
        
        System.out.printf("Automovel de Passeio\n");
        System.out.printf("Placa: %s\n", this.board);
        System.out.printf("Ano: %d\n", this.year);
        System.out.printf("Máximo de assentos: %d\n", this.maxPassangers); 
        System.out.printf("Preço a pagar: %.2f", price());
        
    }

    public int getMaxPassangers() {
        return maxPassangers;
    }

    public void setMaxPassangers(int maxPassangers) {
        this.maxPassangers = maxPassangers;
    }
   
    
}
