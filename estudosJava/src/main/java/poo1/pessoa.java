package poo1;

public class pessoa {

    private String nome;
    private int dia, mes, ano;
    private double altura;

    public pessoa() {
        
        this.nome = "nome";
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
        this.altura = 0;        
        
    }
    
    public void imprimirPessoa() {
        
        System.out.println("Nome: " + this.nome);
        System.out.println("Data de Nascimento: " + this.dia + "/" + this.mes + "/" + this.ano);
        System.out.println("Altura: " + this.altura);
               
    }
    
    public void calcularIdade(int anoAtual) {
        
            int idade;
        
        if (anoAtual < ano) {
            
            System.out.println("Erro, idade inválida");
            
        } else {
            
                idade = anoAtual - ano;      
            
            System.out.println("Idade de " + this.nome + " é " + idade);
            
        }
        
        
    }

    public String getNome() {
        return nome;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
    
}
