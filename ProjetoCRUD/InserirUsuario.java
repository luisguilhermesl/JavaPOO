package ProjetoCRUD;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author Luís Guilherme
 */
class InserirUsuario {
    public void inserir(String nome, String email){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
            String sql = "INSERT INTO usuarios (nome,email) VALUES (?,?);";
            // Executar a consulta/conexão do SQL de forma segura
            try(PreparedStatement ps = conexao.prepareStatement(sql)){
                ps.setString(1, nome);
                ps.setString(2, email);
                ps.executeUpdate();
                System.out.println("Usuário inserido com sucesso!");
            
                // Código que pode gera um erro de SQL
            }catch(SQLException e){
                //O 'e' é um objeto da classe SQLException, ou seja, 
                //estamos capturando uma exceção do tipo SQLException
                //e armazenando ela na variável 'e'
                System.out.println("Erro ao inserir usuário");
                e.printStackTrace();
            }finally{
                try{
                    conexao.close();
                }catch(SQLException e){
                  e.printStackTrace();
                }
            }
        }
    }
}