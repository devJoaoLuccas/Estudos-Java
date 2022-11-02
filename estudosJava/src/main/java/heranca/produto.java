package heranca;

public class produto {

    protected int codigo;
    protected String nome;
    protected float preco;
    
    public produto(int codigo, String nome, float preco) {
        
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        
    }
   
    public float precoVenda() {

        
        return preco;   
    }
    
    public void imprimir() {
        
        System.out.println("Nome: " + this.nome);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Preco: " + this.preco);
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
