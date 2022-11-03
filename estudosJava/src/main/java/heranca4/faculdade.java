package heranca4;

public class faculdade {
    public static void main(String[] args) {

        cursos ads = new cursoGradu(172212, "Analise e Desenvolvimento de Sistemas", 
                                    "T.I", 12, 4);
        
        cursos bigData = new cursoPos(150329, "Big Data", "T.I", 150);
        
        ads.print();
        System.out.println("");
        bigData.print();
        
    }
    
}
