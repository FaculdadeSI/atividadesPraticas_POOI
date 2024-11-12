package conexaoBanco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class FabricaDeConexoes {

    private static final String STR_CONEXAO = "jdbc:postgresql://localhost/postgres";
    private static final String DRIVER = "org.postgresql.Driver";
    private static final String USUARIO = "duda";
    private static final String SENHA = "19062022";
    private static final String SCHEMA = "maria_morais";

    private static Connection connection;

    public static Connection getConnection() throws Exception {
        if (connection == null || connection.isClosed()) {
            FabricaDeConexoes connect = new FabricaDeConexoes();
        }
        return connection;
    }

    private FabricaDeConexoes() {
        try {
            FabricaDeConexoes.connection = DriverManager.getConnection(STR_CONEXAO, USUARIO, SENHA);
            FabricaDeConexoes.connection.setSchema(SCHEMA);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,
                    "Conexão não estabelecida\n" + ex.getMessage(),
                    "Erro na conexão com o SGBD", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public void closeConnection() throws Exception {
        connection.close();
    }

    /**
     *
     * @param con
     * @param rs
     * @param stat
     */
    public static void closeConnection(Connection con, ResultSet rs, PreparedStatement stat) {

    }
}
