package ProjetoCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Luís Guilherme
 */
class DeletarUsuario {
    public void deletar(String nome){
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();
        
        if(conexao != null){
            String sql = "DELETE FROM usuarios WHERE nome = ?;";
            try(PreparedStatement ps = conexao.prepareStatement(sql)){
                ps.setString(1, nome);
                ps.executeUpdate();
                System.out.println("Usuário deletado com sucesso!");
            }catch(SQLException e){
                System.out.println("Erro ao deletar usuário");
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
