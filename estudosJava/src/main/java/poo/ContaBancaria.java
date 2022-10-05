package poo;


public class ContaBancaria {
    
    String CPF;
    String nomeDoCorrentista;
    double saldo;
    
    public ContaBancaria(String CPF, String nomeDoCorrentista, double saldo) {
        
        this.CPF = CPF;
        this.nomeDoCorrentista = nomeDoCorrentista;
        this.saldo = saldo;
                        
    }
    
    public void imprimirConta() {
        
        System.out.println("CPF = " + this.CPF);
        System.out.println("Nome = " + this.nomeDoCorrentista);
        System.out.println("Saldo = " + this.saldo);
        
    }
    
    public void saque(){
        
        if (this.saldo > 0) {
            System.out.println("É possível efetuar o saque.");
        }
        
    }
    
    public void deposito(double valor) {
        
        this.saldo += valor;
        System.out.println("O valor deposito foi: " + valor);
        System.out.println("O valor total da conta é: " + this.saldo);
        
    }
    
    public void consultarSaldo(boolean consultar) {
        
        if (consultar == true) {
            System.out.println("O seu saldo é de " + this.saldo);
        } 
        
    }
    
    
}
