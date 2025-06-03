package Ex07_Livro;

import java.util.Scanner;

/**
 *
 * @author Luís Guilherme
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Livro livro = new Livro();
        
        System.out.print("Digite o título do livro: ");
        livro.titulo = sc.nextLine();
        
        System.out.print("Digite o autor do livro: ");
        livro.autor = sc.nextLine();
        
        System.out.print("Digite o ano de publicação: ");
        livro.anoPublicacao = sc.nextInt();
        
        livro.disponivel = true;
        
        System.out.println("## Informações do livro cadastrado ##");
        System.out.println("Título: "+livro.titulo);
        System.out.println("Autor: "+livro.autor);
        System.out.println("Ano de Publicação: "+livro.anoPublicacao);
        
        System.out.println("\nEmprestar o livro...");
        livro.emprestar();
        
        System.out.println("\nDevolvendo o livro...");
        livro.devolver();
        
//        System.out.println("\nDeseja emprestar o livro? (s/n)");
//        sc.nextLine(); // Consumir nova linha
//        String opcao = sc.nextLine();
//        
//        if(opcao.equalsIgnoreCase("s")){
//            livro.emprestar();
//        }
//        
//        System.out.println("\nDeseja devolver o livro? (s/n)");
//        opcao = sc.nextLine();
//        
//        if(opcao.equalsIgnoreCase("s")){
//            livro.devolver();
//        }
        
        sc.close();
    }
}