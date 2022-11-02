package heranca2;

public class sala3d extends sala {

    private String equipamentoDeProjecao;
    
    public sala3d(int numeroDaSala, int capacidadeMaxima, String equipamento) {
        
        super(numeroDaSala, capacidadeMaxima);
        this.equipamentoDeProjecao = equipamento;
        
    }
    
    @Override
    public void imprimir() {
        
        System.out.println("SALA 3D:");
        System.out.println("Numero da sala: " + this.numeroDaSala);
        System.out.println("Capacidade Máxima: " + this.capacidadeMaxima);
        System.out.println("Equipamento de projeção: " + this.equipamentoDeProjecao);
        
    }

    public String getEquipamentoDeProjecao() {
        return equipamentoDeProjecao;
    }

    public void setEquipamentoDeProjecao(String equipamentoDeProjecao) {
        this.equipamentoDeProjecao = equipamentoDeProjecao;
    }
    
    
    
}
