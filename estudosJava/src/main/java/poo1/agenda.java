package poo1;

public class agenda {

    private String nome;
    private int idade;
    private static int posicaoNaAgenda;
    private double altura;

    
    public agenda() {
        
        this.nome = "nome";
        this.idade = 0;
        this.altura = 0;
                     
    }
    
    public void buscaPessoa() {
        
        this.posicaoNaAgenda++;
        
        System.out.println(this.nome + " está na " + this.posicaoNaAgenda + "º da agenda");
        
        
    }
    
    public void armazenaPessoa(String nome, int idade, double altura) {
        
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        
        
    }
    
    public void removePessoa(String nome) {
        
        if(this.nome.equals(nome)) {
            
          this.nome = "";
          this.idade = 0;
          this.altura = 0;
          
            System.out.println("A pessoa " + nome + " foi removida da lista" +
                    " o nome está em branco");
            
        }
             
    }
    
    public void imprimeAgenda() {
        
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
        System.out.println("Posição na agenda " + this.posicaoNaAgenda);
        
    }
    
    public void imprimePessoa(int index) {
        
        if(index == this.posicaoNaAgenda) {
            
            System.out.println("Nome: " + this.nome);
            System.out.println("Idade: " + this.idade);
            System.out.println("Altura: " + this.altura);
            System.out.println("Posição na agenda " + this.posicaoNaAgenda);
            
        } else { 
            
            System.out.println("Posição inválida");
            
        }
        
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public static int getPosicaoNaAgenda() {
        return posicaoNaAgenda;
    }

    public float getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void setPosicaoNaAgenda(int posicaoNaAgenda) {
        agenda.posicaoNaAgenda = posicaoNaAgenda;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    
    

    
    
    
    
    
}
