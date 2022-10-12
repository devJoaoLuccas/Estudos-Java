package poo;

import java.util.Scanner;

public class Aula {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
            livro livro = new livro();
            livroLivraria livraria1 = new livroLivraria();
            livroBiblioteca biblioteca1 = new livroBiblioteca();
            
            
        for(int i = 0; i < 3; i++) {
            
            System.out.println("Insira o nome do autor:");
                String autor = scan.nextLine();
                              
            System.out.println("Insira o nome da editora:");
                String editora = scan.nextLine();
                
            System.out.println("Insira o titulo:");
                String titulo = scan.nextLine();
                
            System.out.println("Insira o ISBN:");
                int ISBN = scan.nextInt();
                
            System.out.println("Insira a edição:");
                int edicao = scan.nextInt();
                
            if (i == 0) {
                
                livro.setAutor(autor);
                livro.setEditora(editora);
                livro.setTitulo(titulo);
                livro.setISBN(ISBN);
                livro.setEdicao(edicao);
                
                System.out.println("INSTANCIA DO LIVRO: ");
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("ISBN: " + livro.getISBN());
                System.out.println("Edição: " + livro.getEdicao());
                
                System.out.println("");
                scan.nextLine();
                
            }
            
            if (i == 1) {
                
                livro.setAutor(autor);
                livro.setEditora(editora);
                livro.setTitulo(titulo);
                livro.setISBN(ISBN);
                livro.setEdicao(edicao);
                
                System.out.println("INSTANCIA DO LIVRO LIVRARIA: ");
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("ISBN: " + livro.getISBN());
                System.out.println("Edição: " + livro.getEdicao());
                
                System.out.println("Insira o preço de + " + livro.getTitulo() + ":");
                    double preco = scan.nextDouble();
                
                System.out.println("Insira a quantidade de livros que tem no estoque:");
                    int quantidade = scan.nextInt();
                    
                livraria1.setPreco(preco);
                livraria1.setQuantidade(quantidade);
                
                System.out.println("Preço de " + livro.getTitulo() + ": " + livraria1.getPreco());
                System.out.println("Quantidade de livros: " + livraria1.getQuantidade());
                
                System.out.println("Insira a quantidade de livros comprados:");
                    int quantidadeComprada = scan.nextInt();
                
                livraria1.compra(quantidadeComprada);
                
                System.out.println("Insira a porcetangem desejada para reajustar o valor do livro:");
                    double porcentagem = scan.nextDouble();
                
                livraria1.reajuste(porcentagem);
                
                System.out.println("Insira quantos livros o cliente deseja adquirir:");
                    int quantidadeDeVenda = scan.nextInt();
                
                livraria1.venda(quantidadeDeVenda);
                
                System.out.println("");
                scan.nextLine();
                
            }
            
            if (i == 2) {
                
                livro.setAutor(autor);
                livro.setEditora(editora);
                livro.setTitulo(titulo);
                livro.setISBN(ISBN);
                livro.setEdicao(edicao);
                
                System.out.println("INSTANCIA DO BIBLIOTECA: ");
                System.out.println("Autor: " + livro.getAutor());
                System.out.println("Editora: " + livro.getEditora());
                System.out.println("Titulo: " + livro.getTitulo());
                System.out.println("ISBN: " + livro.getISBN());
                System.out.println("Edição: " + livro.getEdicao());   
                
                System.out.println("Insira o dia que o livro foi entregue ao aluno:");
                    int diaEmp = scan.nextInt();
                
                System.out.println("Insira o mes que o livro foi entregue ao aluno:");
                    int mesEmp = scan.nextInt();
                    
                System.out.println("Insira o ano que o livro foi entregue ao aluno:");
                    int anoEmp = scan.nextInt();
                    
                    
                biblioteca1.setDiaEmp(diaEmp);
                biblioteca1.setMesEmp(mesEmp);
                biblioteca1.setAnoEmp(anoEmp);
                    
                biblioteca1.emprestimo(diaEmp, mesEmp, anoEmp);
                
                System.out.println("Insira o dia em que o livro foi devolvido:");
                    int diaDev = scan.nextInt();
                    
                System.out.println("Insira o mes em que o livro foi devolvido:");
                    int mesDev = scan.nextInt();                   
                    
                System.out.println("Insira o ano em que o livro foi devolvido:");
                    int anoDev = scan.nextInt();                    
                    
                    
                biblioteca1.setDiaDev(diaDev);
                biblioteca1.setMesDev(mesDev);
                biblioteca1.setAnoDev(anoDev); 
                
                biblioteca1.devolver(diaDev, mesDev, anoDev);
                    
            }
            
            
            
        }
        
    }
}
