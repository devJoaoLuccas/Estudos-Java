package poo;


public class Restaurante {
    public static void main(String[] args) {
        
        contaRestaurante conta = new contaRestaurante(2, 3, 1);
        conta.imprimirComanda();
        
        contaRestaurante conta2 = new contaRestaurante(1, 1, 1);
        conta2.imprimirComanda();
        
    }
}
