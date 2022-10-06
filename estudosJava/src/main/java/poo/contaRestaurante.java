package poo;


public class contaRestaurante {

    float pesoConsumido;
    int quantidadeDeBebida;
    float pesoDaSobremesa;
    
    public contaRestaurante(float pesoConsumido, int quantidadeDeBebida, float pesoDaSobremesa) {
        
        this.pesoConsumido = pesoConsumido;
        this.quantidadeDeBebida = quantidadeDeBebida;
        this.pesoDaSobremesa = pesoDaSobremesa;
                        
    }
    
    public void imprimirComanda() {
        
        this.pesoConsumido *= 50.00;
        this.quantidadeDeBebida *= 2;
        this.pesoDaSobremesa = 50;
        double valorTotal = this.pesoConsumido + this.quantidadeDeBebida + this.pesoDaSobremesa;
        
        
        System.out.println("=============================");
        System.out.println("Peso consumido = R$ " + this.pesoConsumido);
        System.out.println("Quantidade de bebida = R$ " + this.quantidadeDeBebida);
        System.out.println("Peso da sobremesa = R$ " + this.pesoDaSobremesa);
        System.out.println("=============================");
        System.out.println("");
        System.out.println("Valor total = " + valorTotal);
        
          
    }
    
}
