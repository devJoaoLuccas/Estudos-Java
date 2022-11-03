package heranca4;

public class cursoGradu extends cursos {

        private int minimunSubjects, opSubjects;
    
    public cursoGradu(int codigo, String nome, String area, int minimo, int optativas) {
        
        super(codigo, nome, area);
        this.minimunSubjects = minimo;
        this.opSubjects = optativas;
             
    }
    
    @Override 
    public void print() {
        
            int max = 0;
        
        max = this.minimunSubjects + this.opSubjects;        
        
        System.out.printf("Nome: %s\n", this.name);
        System.out.printf("Codigo do curso: %s\n", this.code);
        System.out.printf("Area do curso: %s\n", this.area);
        System.out.printf("Materias a cursar: %s\n", this.minimunSubjects);
        System.out.printf("Materias optativas: %s\n", this.opSubjects);    
        System.out.printf("Máximo de materias: %d\n", max);
             
    }

    public int getMinimunSubjects() {
        return minimunSubjects;
    }

    public void setMinimunSubjects(int minimunSubjects) {
        this.minimunSubjects = minimunSubjects;
    }

    public int getOpSubjects() {
        return opSubjects;
    }

    public void setOpSubjects(int opSubjects) {
        this.opSubjects = opSubjects;
    }
    
    
        
}
