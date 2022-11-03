package heranca5;

public class automovelCarga extends automovel {

        private int maxWeight;
    
    public automovelCarga(String placa, int ano, int pesoMax) {
        
        super(placa, ano);
        this.maxWeight = pesoMax;
              
    } 
    
    @Override
    public void print() {
        
        System.out.printf("Automovel de Carga\n");
        System.out.printf("Placa: %s\n", this.board);
        System.out.printf("Ano: %d\n", this.year);
        System.out.printf("Peso Máximo: %d\n", this.maxWeight);  
        System.out.printf("Preço a pagar: %.2f\n", price());
        
    }
     
    @Override
    public float price() {
        
       float price = 0;
       
       price = this.registerCar * (this.maxWeight * 2);
      
    return price;   
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    
    
    
}
