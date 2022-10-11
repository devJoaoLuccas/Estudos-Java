package poo;


public class AlunoUniversidade {
    
    private int numeroDaMatricula;
    private String nomeDoAluno;
    private int anoDeIngresso;
    private String curso;
    private boolean matriculado;
    private int disciplinasMatriculadas;
    private int permanencia;
    private float mensalidade;
    
    public AlunoUniversidade(String nome, int numeroDaMatricula, int anoDeIngresso, String curso) {
        
        this.nomeDoAluno = nome;
        this.numeroDaMatricula = numeroDaMatricula;
        this.anoDeIngresso = anoDeIngresso;
        this.curso = curso;
        this.matriculado = false;
     
    }
    
    public String getNomeDoAluno() {
        
        return this.nomeDoAluno;   
     
    }
    
    public void setNomeDoAluno(String nome) {
        
        this.nomeDoAluno = nome;
        
    }
    
    public String getCurso() {
        
        return this.curso;
        
    }
    
    public void setCurso(String curso) {
        
        this.curso = curso;
        
    }
    
    public int getNumeroMatricula() {
        
        return this.numeroDaMatricula;
        
    }
    
    public void setNumeroMatricula(int numero) {
        
        this.numeroDaMatricula = numero;
        
    }
    
    public void imprimirAluno() {
        
        System.out.println("Nome do aluno = " + this.nomeDoAluno);
        System.out.println("Curso = " + this.curso);
        System.out.println("Numero da matricula = " + this.numeroDaMatricula);
        System.out.println("Ano de Ingresso = " + this.anoDeIngresso);
        System.out.println("Matriculado = " + this.matriculado);
        System.out.println("Disciplinas matriculadas = " + this.disciplinasMatriculadas);
        System.out.println("Permanencia = " + this.permanencia + " anos");
        System.out.println("Valor da mensalidade = " + this.mensalidade);
        
    
    }
    
    public void matricular(int disciplinas) {
        
        this.disciplinasMatriculadas = disciplinas;
        this.matriculado = true;
        
        
    }
     
    public void calcularPermanencia(int ano, int anoAtual) {
        
        this.permanencia = anoAtual - ano;
     
       
    }
    
    public void calcularMensalidade(float disciplinas) {
        
        this.mensalidade =  (float) (disciplinas * 150.0);
        
    }
    
    
}
