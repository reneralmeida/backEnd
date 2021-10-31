package MesaAula11;

import java.sql.*;

public class App {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS figuras; " +
            "CREATE TABLE figuras " +
            "(id INT AUTO_INCREMENT PRIMARY KEY, figura VARCHAR(32), cor VARCHAR(32));";

    private static final String sqlInsert = "INSERT INTO figuras ( figura , cor) " +
            "VALUES('circulo', 'vermelho'), ('circulo', 'verde'), ('quadrado', 'azul'), " +
            "('quadrado', 'verde'), ('quadrado', 'amarelo');";

    public static void main(String[] args) throws Exception {

        Class.forName("org.h2.Driver");
        String url = "jdbc:h2:tcp://localhost/~/test";

        try(Connection conn = DriverManager.getConnection(url, "sa", "")) {
            Statement stmt = conn.createStatement();
            stmt.execute(sqlCreateTable);
            stmt.execute(sqlInsert);
            printing(conn);
        }
    }

    private static void printing(Connection conn) throws SQLException{
        String sqlQuery = "SELECT * FROM figuras WHERE cor='verde' AND figura='quadrado';";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(sqlQuery);

        while(rs.next()) {
            System.out.println(rs.getInt(1) +
                    " " + rs.getString(2) +
                    " " + rs.getString(3));
        }
    }
}