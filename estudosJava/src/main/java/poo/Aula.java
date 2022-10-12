package poo;

import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            livro livro1 = new livro();
        
        System.out.println("");
        System.out.println("Autor: "+ livro1.getAutor());
        System.out.println("Editora: " + livro1.getEditora());
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("ISBN: " + livro1.getISBN());
        System.out.println("Edição: " + livro1.getEdicao());
        System.out.println("-------------------------------");
        System.out.println("");
        
        System.out.println("Insira um autor:");
            String autor = scan.nextLine();
               
        System.out.println("Insira uma editora:");
            String editora = scan.nextLine();
            
        System.out.println("Insira o titulo:");
            String titulo = scan.nextLine();
            
        System.out.println("Insira o ISBN:");
            int ISBN = scan.nextInt();
            
        System.out.println("Insira a edição:");
            int edicao = scan.nextInt();
        
        livro1.setAutor(autor);
        livro1.setEditora(editora);
        livro1.setTitulo(titulo);
        livro1.setEdicao(edicao);
        livro1.setISBN(ISBN);
        
        System.out.println("");
        System.out.println("Autor: "+ livro1.getAutor());
        System.out.println("Editora: " + livro1.getEditora());
        System.out.println("Titulo: " + livro1.getTitulo());
        System.out.println("ISBN: " + livro1.getISBN());
        System.out.println("Edição: " + livro1.getEdicao());
        System.out.println("-------------------------------");
        System.out.println("");

        
    }
}
