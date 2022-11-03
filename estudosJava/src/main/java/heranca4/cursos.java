package heranca4;

public class cursos {

        protected int code; 
        protected String name, area;
        
    public cursos(int codigo, String nome, String area) {
        
        this.code = codigo; 
        this.name = nome;
        this.area = area;       
        
    }
    
    public void print() {
        
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Codigo do curso: %s\n", this.code);
        System.out.printf("Area do curso: %s\n", this.area);
              
    }
    
    public float price() {
        
        float price = 0;
        
    return price;    
    }
    
}
