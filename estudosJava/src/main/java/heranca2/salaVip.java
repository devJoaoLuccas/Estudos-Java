package heranca2;

public class salaVip extends sala{

    private String horario;
    
    public salaVip(int numeroDaSala, int capacidadeMaxima, String horario) {
        
        super(numeroDaSala, capacidadeMaxima);
        this.horario = horario;
               
    }    
    
    @Override
    public void imprimir() {
        
        System.out.println("SALA VIP:");
        System.out.println("Numero da sala: " + this.numeroDaSala);
        System.out.println("Capacidade Máxima: " + this.capacidadeMaxima);
        System.out.println("Horário unico da sala: " + this.horario);
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    
}
