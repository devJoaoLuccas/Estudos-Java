package heranca;


public class aplicacao {
    public static void main(String[] args) {
        
        produtoPerecivel produto1 = new produtoPerecivel(1272212, "Banana", 0.10f,
                                                          10, "Colocar na geladeira");
        
            produto1.imprimir();
            System.out.println("");
            produto1.imprimirProduto();
        
        produtoNaoPerecivel produto2 = new produtoNaoPerecivel(1272213, "Arroz", 8.50f);
        
            System.out.println("");
            System.out.println("Nome: " + produto2.nome + " || Preço: " + produto2.precoVenda());
            System.out.println("");
            produto2.imprimir();
            System.out.println("");
        
        produto produto3 = new produtoNaoPerecivel(01, "Feijão", 10.50f);
        produto produto4 = new produtoNaoPerecivel(02, "Café", 3.50f);
        
        produto[] produtos2 = {produto3, produto4};
        
        for (produto produto : produtos2) {
            
            produto.imprimir();
            System.out.println("");
            
        }
        
    }
}
