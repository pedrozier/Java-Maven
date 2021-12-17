
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author zier
 */
public class Conexao {
    
    public static void main(String[] args) throws SQLException {
        Connection conexao = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conexao = DriverManager.getConnection("jdbc:mysql://localhost/banco", "Usuario", "Senha");
            ResultSet rsCliente = conexao.createStatement().executeQuery("SELECT * FROM CLIENTE");
            while(rsCliente.next()){
                System.out.println("Nome: " + rsCliente.getString("nome"));
            }
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver do Banco de Dados Não Foi Encontrado");
        } catch (SQLException ex) {
            System.out.println("Ocorreu um Erro ao Acessar o Banco: " + ex.getMessage());
        } finally {
            if(conexao != null) {
                conexao.close();
            }
        }
        
                
    }
}
