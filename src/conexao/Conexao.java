package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    private final static String link = "jdbc:mysql://localhost:3306";
    private final static String usuario = "root";
    private final static String senha = "";

    public static Connection obterConexao() throws SQLException{
        return DriverManager.getConnection(link,usuario,senha);
    }
}
