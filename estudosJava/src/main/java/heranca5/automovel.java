package heranca5;

public class automovel {

        protected String board;
        protected int year, registerCar;  
    
    public automovel(String placa, int ano) {
        
        this.board = placa;
        this.year = ano;
        
    }
    
    public void print() {
        
        System.out.printf("Placa: %s\n", this.board);
        System.out.printf("AnO: %d\n", this.year);
        
    }
    
    public void registerDateHour(String date, String hour) {
        
        System.out.printf("Data: %s\n", date);
        System.out.printf("Hora: %s\n", hour);
        
        this.registerCar++;
    }
    
    public float price() {
        
        float price = 0;
        
    return price;    
    }
    
    
}
