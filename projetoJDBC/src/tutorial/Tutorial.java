package tutorial;

import java.sql.*; // Importe o SQL.

public class Tutorial {

    public static void main(String[] args) {
        // Variavel string recebe o driver acessando o diretorio do banco de dados
        String bancoDadosURL = "jdbc:ucanaccess://C://Users//0072379//DataBase2.accdb";
        //String bancoDadosURL = "jdbc:ucanaccess://c://Users//Tiago//Documents//BancoDados//DataBase2.accdb"; 
        // Conexão do banco
        try (Connection connection = DriverManager.getConnection(bancoDadosURL)) {
            // Comando Select. O * serve para selecionar tudo, traduzindo seria algo como: "Selecione tudo da tabela Livros"
            String visualizar = "SELECT * FROM Livros";
            // Executando a consulta
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(visualizar);
            // Exibindo todos os dados do banco de dados
            while (result.next()) {
                // O texto entre "" é o nome da tabela no banco de dados
                // int id recebe os valores da coluna "Id" do banco
                // String livros recebe os valores da coluna "Livros" do banco
                int id = result.getInt("ID");
                String livros = result.getString("Livro");
                // Imprimindo os dados recebidos
                System.out.println(id + ": " + livros);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        System.out.println("Fim!");
    }
}
