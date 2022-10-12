package poo;


public class livro {

    private String titulo, editora, autor;
    private int ISBN, edicao;
    
    public livro() {
        
        this.titulo = "Titulo";
        this.editora = "Editora";
        this.autor = "Autor";
        this.ISBN = 0;
        this.edicao = 0;
        
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditora() {
        return editora;
    }

    public String getAutor() {
        return autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }


    
    
    
    
    
}
