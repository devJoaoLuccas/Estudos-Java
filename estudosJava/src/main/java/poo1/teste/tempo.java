package poo1.teste;

public class tempo {

    private int hora; 
    private int minuto;
    private int segundo;
    
    public tempo(int hora, int minuto, int segundo) {
        
        if (hora < 0 || hora >= 24) 
            
            throw new IllegalArgumentException("A hora deve ser entre 0 - 23");
         
        
        
        if (minuto < 0 || minuto >= 60) 
            
            throw new IllegalArgumentException("O minuto deve ser entre 0 - 59");
         
       
        
        if (segundo < 0 || segundo >= 60) 
            
            throw new IllegalArgumentException("O segundo deve ser entre 0 - 59");
         
        
        
        this.hora = hora; 
        this.minuto = minuto; 
        this.segundo = segundo;       
        
    }
    
    public tempo() {
        
        this(0, 0, 0);
            
    }
    
    public tempo(int hora) {
        
        this(hora, 0 , 0);
        
    }
    
    public tempo(int hora, int minuto) {
        
        this(hora, minuto, 0);
        
    }

    public void setHora(int hora) {
        
        if (hora < 0 || hora >= 24) 
            
            throw new IllegalArgumentException("A hora deve ser entre 0 - 23");
        
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        
        if (minuto < 0 || hora >= 60) 
            
            throw new IllegalArgumentException("A hora deve ser entre 0 - 59");
        
        this.minuto = minuto;
    }

    public void setSegundo(int segundo) {
        
        if (segundo < 0 || segundo >= 24) 
            
            throw new IllegalArgumentException("A hora deve ser entre 0 - 59");
        
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    
}
