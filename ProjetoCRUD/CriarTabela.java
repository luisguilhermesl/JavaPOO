package ProjetoCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Luís Guilherme
 */
class CriarTabela {
    public void criar(){
    ConexaoBD conexaoBD = new ConexaoBD();
    Connection conexao = conexaoBD.conectar();
    
        if(conexao != null){
            String sql = "CREATE TABLE IF NOT EXISTS usuarios("
                    + "id INT AUTO_INCREMENT PRIMARY KEY,"
                    + "nome VARCHAR(50),"
                    + "email VARCHAR(50)"
                    + ");";
            
            try(PreparedStatement ps = conexao.prepareStatement(sql)){
                ps.execute();
                System.out.println("Tabela 'usuários' criada com sucesso!");
            }catch(SQLException e){
                System.out.println("Erro ao criar a tabela 'usuarios'");
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