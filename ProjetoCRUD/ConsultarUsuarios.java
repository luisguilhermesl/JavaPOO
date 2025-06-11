package ProjetoCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author Luís Guilherme
 */
class ConsultarUsuarios {
    public void consultar() throws SQLException {
        ConexaoBD conexaoBD = new ConexaoBD();
        Connection conexao = conexaoBD.conectar();

        if (conexao != null) {
            String sql = "SELECT * FROM usuarios;";
            try(PreparedStatement ps = conexao.prepareStatement(sql);
                ResultSet resultado = ps.executeQuery()){
                
                System.out.println("Lista de Usuários:");
                while(resultado.next()){
                    int id = resultado.getInt("id");
                    String nome = resultado.getString("nome");
                    String email = resultado.getString("email");
                    System.out.println("ID: "+id+"\nNome: "+nome+"\nEmail: "+email);
                }
            }catch(SQLException e){
                System.out.println("Erro ao consultar usuários");
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