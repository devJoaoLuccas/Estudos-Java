package poo;

public class farmacia {
    public static void main(String[] args) {
        
        remedio remedio = new remedio("Dorflex","Dor de cabeça", 202);
        remedio.precoDeVenda();
        remedio.verificar("Enjoo");

        remedio.imprimirRemedio();
        
        remedio.setNome("Xanax");
        remedio.setPreco((float) 40.5);
        remedio.setPrecoDeVenda((float) 60.50);
        remedio.setPrincipio("Ansiedade");
               
        System.out.println("---------------------------------------");
        System.out.println("Nome do rémedio :" + remedio.getNome());
        System.out.println("Preço :" + remedio.getPreco());
        System.out.println("Preço de venda :" + remedio.getPrecoDeVenda());
        System.out.println("Principio :" + remedio.getPrincipio());
        System.out.println("Pode ser substituido? " + remedio.verificar("dor de cabeça"));
        
    }
    
}
