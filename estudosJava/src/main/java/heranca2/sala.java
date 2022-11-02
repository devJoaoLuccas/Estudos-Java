package heranca2;


public class sala {

    protected int numeroDaSala, capacidadeMaxima;


    public sala(int numeroDaSala, int capacidadeMaxima) {
        
        this.numeroDaSala = numeroDaSala;
        this.capacidadeMaxima = capacidadeMaxima;
        
    }
    
    public void imprimir() {
        
        System.out.println("Numero da Sala: " + this.numeroDaSala);
        System.out.println("Capacidade: " + this.capacidadeMaxima);
        
    }

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }
    
   
}
