package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TansactionDB {
    public static final String DB_URL = "jdbc:postgresql://localhost/bookstore";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "kjmlkjml";

    public static void main(String[] args) {
        Connection connect = null;

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connect.setAutoCommit(false);

            PreparedStatement pr = connect.prepareStatement("INSERT INTO book (title, page_number, author_id) VALUES (?,?,?)");
            pr.setString(1, "Mutlu Çocuklar");
            pr.setInt(2, 20);
            pr.setInt(3, 23);
            pr.executeUpdate();

            if (true) {
                throw new SQLException();
            }

            pr.setString(1, "Üzgün Çocuklar");
            pr.setInt(2, 30);
            pr.setInt(3, 33);

            connect.commit();
            pr.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
