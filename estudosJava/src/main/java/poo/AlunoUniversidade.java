package poo;


public class AlunoUniversidade {
    
    int numeroDaMatricula;
    String nomeDoAluno;
    int anoDeIngresso;
    String curso;
    boolean matriculado;
    int disciplinasMatriculadas;
    int permanencia;
    float mensalidade;
    
    public AlunoUniversidade(String nome, int numeroDaMatricula, int anoDeIngresso, String curso) {
        
        this.nomeDoAluno = nome;
        this.numeroDaMatricula = numeroDaMatricula;
        this.anoDeIngresso = anoDeIngresso;
        this.curso = curso;
        this.matriculado = false;
     
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
