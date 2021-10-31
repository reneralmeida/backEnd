import java.sql.*;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS animal; " + "CREATE TABLE animal (id INT AUTO_INCREMENT PRIMARY KEY, nome VARCHAR(32), tipo VARCHAR(16))";

    private static final String sqlInsert = "INSERT INTO animal " + "VALUES (1, 'Meg', 'Cachorro'), (2, 'Mingau', 'Gato'), (3, 'Dumbo', 'Elefante'), " + "(4, 'Pup', 'Cachorro'), (5, 'Pé de pano', 'Cavalo')";

    private static final String sqlDelete = "DELETE FROM animal WHERE id = 2";

    public static void main(String[] args) throws Exception{

        Class.forName("org.h2.Driver");
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", ""
            );
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);
            statement.execute(sqlInsert);

            ShowAnimal(connection);

            statement.execute(sqlDelete);

            ShowAnimal(connection);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (connection == null)
                return;

            connection.close();
        }
    }

    private static void ShowAnimal(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM animal";
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sqlQuery);

        while (rs.next()) {
            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
        }
    }
}
