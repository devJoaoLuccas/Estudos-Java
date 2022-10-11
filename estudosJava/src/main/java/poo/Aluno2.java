package poo;

public class Aluno2 {
    public static void main(String[] args) {
        
        AlunoUniversidade aluno = new AlunoUniversidade("João", 171, 2022, "Ads");
        
        aluno.imprimirAluno();
        
        aluno.setNomeDoAluno("Marcos");
        aluno.setCurso("Engenharia da Computação");
        aluno.setNumeroMatricula(180);
        
        System.out.println("Nome = " + aluno.getNomeDoAluno());
        System.out.println("Curso = " + aluno.getCurso());
        System.out.println("Numero da Matricula = " + aluno.getNumeroMatricula());
        
    }
}
