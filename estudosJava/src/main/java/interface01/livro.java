package interface01;

import java.util.Scanner;

public class livro implements itemDeBiblioteca {

    Scanner scan = new Scanner(System.in);
    
        private String titulo, autor;
        private int anoDaEdicao, paginas;
        private boolean emprestimo;
        private int diaEmp, mesEmp, anoEmp;
        private int diaDev, mesDev, anoDev;
    
    public livro(String titulo, String autor, int anoDaEdicao, int paginas) {
        
        this.titulo = titulo;
        this.autor = autor;
        this.anoDaEdicao = anoDaEdicao;
        this.paginas = paginas;
        this.emprestimo = false;
        
    }
    
    public void print() {
        
        System.out.printf("Titulo: %s\n", this.titulo);
        System.out.printf("Autor: %s\n", this.autor);
        System.out.printf("Ano da edição: %d\n", this.anoDaEdicao);
        System.out.printf("Páginas: %d\n", this.paginas);     
        
    }
    
        
    @Override
    public void devolucao(){
        System.out.printf("Informe o dia da devolução:\n");
            this.diaDev = scan.nextInt();
            
        System.out.printf("Informe o mes da devolução:\n");  
            this.mesDev = scan.nextInt();
            
        System.out.printf("Informe o ano da devolução:\n");  
            this.anoDev = scan.nextInt();
       
        int diasEmprestados, diasDevolvidos;
        int totalDeDias;
            
        diasEmprestados = (this.diaEmp * 1) + (this.mesEmp * 30) + (this.anoEmp * 365);
        diasDevolvidos = (this.diaDev * 1) + (this.mesDev * 30) + (this.anoDev * 365);
        totalDeDias = diasDevolvidos - diasEmprestados;

        if (totalDeDias > 7) {
                       
            System.out.printf("Atraso de %d dias.\n Livro devolvido.\n", totalDeDias);
                                                   
        } else {
            
            System.out.printf("Livro devolvido.\n");
            
        }        
        
       
    }
    
    @Override
    public boolean emprestimo(){
        
        System.out.printf("Informe o dia do empréstimo:\n");
            this.diaEmp = scan.nextInt();
            
        System.out.printf("Informe o mes do empréstimo:\n");  
            this.mesEmp = scan.nextInt();
            
        System.out.printf("Informe o ano do empréstimo:\n");  
            this.anoEmp = scan.nextInt();
            
        this.emprestimo = true;
     
    return this.emprestimo;    
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoDaEdicao() {
        return anoDaEdicao;
    }

    public void setAnoDaEdicao(int anoDaEdicao) {
        this.anoDaEdicao = anoDaEdicao;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
    
    
    
}
