package Ex01_CriarPessoa;

/**
 *
 * @author Luís Guilherme
 */
public class Pessoa {
    String nome;
    int idade;
    double altura;
    
    void apresentar(){
        System.out.println("Olá, meu nome é "+nome+", tenho "+idade+" anos e "
                + ""+altura+" metros de altura.");
    }
}
