package Ex01_CriarPessoa;

/**
 * @author Luís Guilherme
 */

public class JavaPOO {
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        p1.nome = "Bryan";
        p1.idade = 30;
        p1.altura = 1.74;
        
        p1.apresentar();
        
    }
}