package heranca4;


public class cursoPos extends cursos {

        private int maxHour;
    
    public cursoPos(int codigo, String nome, String area, int hora) {
        
        super(codigo, nome, area);
        this.maxHour = hora;       
        
    }    
    
    @Override
    public void print() {
              
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Codigo do curso de pós graduação: %s\n", this.code);
        System.out.printf("Area do curso de pós graduação: %s\n", this.area);
        System.out.printf("Máximo de horas: %d\n", this.maxHour);
        System.out.printf("Valor do curso: R$%.2f\n", price());
        
    }
    
    @Override
    public float price() {
        
        float price = 0;
        
        if(this.maxHour <= 200) {
            
            price = 20000f;
         
        return price;    
        } else { 
            
            price = this.maxHour * 80;
        
        return price;    
        }
        
    }
    
}
