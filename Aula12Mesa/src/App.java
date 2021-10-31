import java.sql.*;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS funcionarios; " + "CREATE TABLE funcionarios (" +
            "id INT PRIMARY KEY," +
            "nome VARCHAR(16) NOT NULL," +
            "sobrenome VARCHAR(32) NOT NULL," +
            "idade INT NOT NULL," +
            "email VARCHAR(32) NOT NULL," +
            "cargo VARCHAR(32) NOT NULL," +
            "salario double NOT NULL)";

    private static final String sqlInsert = "INSERT INTO funcionarios " +
            "(id, nome, sobrenome, idade, email, cargo, salario) VALUES " +
            "(1, 'Jardel', 'Silva', 24, 'jardel@hotmail.com', 'Pedreiro', 1500.00), " +
            "(2, 'Rener', 'Almeida', 31, 'whatever@hotmail.com', 'TI', 10000.00), " +
            "(3, 'Caio', 'Castro', 22, 'caio@hotmail.com', 'Padeiro', 3000.00), " +
            "(4, 'Pedro', 'Chaves', 23, 'pedro@hotmail.com', 'Palhaço', 2000.00), " +
            "(5, 'José', 'Ernesto', 22, 'jern@hotmail.com', 'Porteiro', 4000.00)";

    private static final String sqlInsert1 = "INSERT INTO funcionarios " +
            "(id, nome, sobrenome, idade, email, cargo, salario) VALUES " +
            "(1, 'Juvenal', 'Silva', 24, 'juvena@hotmail.com', 'Pedreiro', 1500.00), " +
            "(2, 'Aristides', 'Freire', 31, 'whatever@hotmail.com', 'TI', 10000.00)";


    private static final String sqlUpdate = "UPDATE funcionarios SET salario = 4000.00 WHERE id = 2";

    private static final String sqlDelete = "DELETE FROM funcionarios WHERE id = 3";

    private static final String sqlDelete1 = "DELETE FROM funcionarios WHERE nome = 'José'";

    private static final Logger logger = Logger.getLogger(App.class);

    public static void main(String[] args) throws Exception {

        // Aqui a configuração do Logging
        BasicConfigurator.configure();
        Connection connection = null;

            try {
                connection = getConnection();
                Statement statement = connection.createStatement();
                statement.execute(sqlCreateTable);
                statement.execute(sqlInsert);
                statement.execute(sqlUpdate);
                statement.execute(sqlDelete);
                logger.info("Excluímos o usuário com o id 1.");
                statement.execute(sqlDelete1);
                logger.info("Excluímos o usuário com o nome de José.");
                statement.execute(sqlInsert1);
            } catch (Exception e) {
                logger.error("Capturando exceção: " + e);
            } finally {
                if (connection == null)
                    return;
                connection.close();
            }
    }
    
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "sa", ""
        );
    }
}