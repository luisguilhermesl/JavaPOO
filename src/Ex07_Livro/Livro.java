package Ex07_Livro;

/**
 *
 * @author Luís Guilherme
 */

public class Livro {
    String titulo;
    String autor;
    int anoPublicacao;
    boolean disponivel;
    
    void emprestar(){
        disponivel = false;
        System.out.println("Livro "+titulo+" emprestado com sucesso");

//        if(disponivel){
//            disponivel = false;
//            System.out.println("Livro "+titulo+" emprestado com sucesso");
//        }else{
//            System.out.println("Livro "+titulo+" não está disponivel para empréstimo.");
//        }
    }
    
    void devolver(){
        disponivel = true;
        System.out.println("Livro "+titulo+" devolvido com sucesso");
        
//        if(!disponivel){
//            disponivel = true;
//            System.out.println("Livro "+titulo+" devolvido com sucesso.");
//        }else{
//            System.out.println("Livro "+titulo+" já está disponível");
//        }
    }
}