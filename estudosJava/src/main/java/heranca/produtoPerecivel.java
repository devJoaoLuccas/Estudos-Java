package heranca;

public class produtoPerecivel extends produto {
    
    private int validade;
    private String formaArmazenamento;
    
    public produtoPerecivel(int codigo, String nome, float preco, int validade, String formaArmazenamento) {
        
        super(codigo, nome, preco);
        this.validade = validade;
        this.formaArmazenamento = formaArmazenamento;
        
    }
    
    @Override
    public float precoVenda() {
              
    return this.preco * this.validade;    
    }
    
    public void imprimirProduto() {
        
        System.out.println("PRODUTO PERECIVEL:");
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Valor: " + precoVenda()); 
        System.out.println("Validade: " + this.validade);
        System.out.println("Como armazenar: " + this.formaArmazenamento);
           
    }

    public int getValidade() {
        return validade;
    }

    public void setValidade(int validade) {
        this.validade = validade;
    }

    public String getFormaArmazenamento() {
        return formaArmazenamento;
    }

    public void setFormaArmazenamento(String formaArmazenamento) {
        this.formaArmazenamento = formaArmazenamento;
    }
    
    
}
