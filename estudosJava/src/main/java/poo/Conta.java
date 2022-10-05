package poo;


public class Conta {
    public static void main(String[] args) {
         
        ContaBancaria conta = new ContaBancaria("868.653.855-00", "João Luccas", 9.40);
        conta.imprimirConta();
        conta.deposito(220.50);
        conta.saque();
        conta.consultarSaldo(true);
        
    }
    
}
