package ProjetoCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Luís Guilherme
 */
class AtualizarUsuario {
    public void atualizar (String nome, String novoEmail){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
            String sql = "UPDATE usuarios SET email = ? WHERE nome = ?;";
            try(PreparedStatement ps = conexao.prepareStatement(sql)){
                ps.setString(1, novoEmail);
                ps.setString(2,nome);
                ps.executeUpdate();
                System.out.println("Usuário atualizado com sucesso!");
            }catch(SQLException e){
                System.out.println("Erro ao atualizar usuário");
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