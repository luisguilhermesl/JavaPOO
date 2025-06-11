package ProjetoCRUD;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Luís Guilherme
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        InserirUsuario inserir = new InserirUsuario();
        AtualizarUsuario atualizar = new AtualizarUsuario();
        DeletarUsuario deletar = new DeletarUsuario();
        ConsultarUsuarios consultar = new ConsultarUsuarios();
        CriarTabela tabela = new CriarTabela();

        tabela.criar();

        int op = -1;
        while (op != 0) {
            System.out.println("\n ## MENU CRUD USUÁRIOS ##");
            System.out.println("1. Inserir usuários");
            System.out.println("2. Atualizar usuário");
            System.out.println("3. Deletar usuário");
            System.out.println("4. Consultar usuários");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Nome: ");
                    String nomeInserir = sc.nextLine();
                    System.out.println("Email: ");
                    String emailInserir = sc.nextLine();
                    inserir.inserir(nomeInserir, emailInserir);
                    break;
                case 2:
                    System.out.println("Nome do usúario para atualizar o email: ");
                    String nomeAtualizar = sc.nextLine();
                    System.out.println("Novo email: ");
                    String novoEmail = sc.nextLine();
                    atualizar.atualizar(nomeAtualizar, novoEmail);
                    break;
                case 3:
                    System.out.println("Nome do usuário para deletar: ");
                    String nomeDeletar = sc.nextLine();
                    deletar.deletar(nomeDeletar);
                    break;
                case 4:
                    consultar.consultar();
                    break;
                case 0:
                    System.out.println("Encerrando o programa ...");
                    break;
                default:
                    System.out.println("Opção inválida");
                }
            }
        sc.close();
    }
}
