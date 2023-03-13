package JDBC;

import java.sql.*;
import java.util.Properties;

public class DBConnectPostgreSql {

    public static final String DB_URL = "jdbc:postgresql://localhost/bookstore";
    public static final String DB_USER = "postgres";
    public static final String DB_PASSWORD = "kjmlkjml";
    public static void main(String[] args) {
        Connection connect = null;
        Statement st = null;
        Properties props = new Properties();

        props.setProperty("user", DB_USER);
        props.setProperty("password", DB_PASSWORD);

        String sql = "SELECT * FROM book";
        String insertSql = "INSERT INTO book (title, page_number, author_id) VALUES ('Mutlu Çocuklar', 60, 20)";
        String prSql = "INSERT INTO book (title, page_number, author_id) VALUES (?, ?, ?)";
        String stSqlUpdate = "UPDATE book SET title='Mutlu mu Çocuklar?' WHERE id=11";
        String prSqlUpdate = "UPDATE book SET title=? WHERE id=?";
        String stSqlDelete = "DELETE FROM book WHERE id=11";
        String prSqlDelete = "DELETE FROM book WHERE id=?";

        try {
            connect = DriverManager.getConnection(DB_URL, props);
            st = connect.createStatement();

            // Veri çekme
            /*
            ResultSet data = st.executeQuery(sql);
            while (data.next()) {
                System.out.print("ID: " + data.getInt("id"));
                System.out.print("  Title: " + data.getString("title"));
                System.out.println("  Page Number: : " + data.getInt("page_number"));
            }
             */

            //Veri ekleme

            // st.executeUpdate(insertSql); // Statment üzerinden veri ekleme işlemi

            /*
            PreparedStatement prSt = connect.prepareStatement(prSql); //PreparedStatement üzerinden veri ekleme
            prSt.setString(1, "Üzgün Çocuklar");
            prSt.setInt(2, 15);
            prSt.setInt(3, 20);
            prSt.executeUpdate();

            prSt.close();
             */

            //Veri Güncelleme
            // Statment ile veri güncelleme
            /*
            st = connect.createStatement();
            st.executeUpdate(stSqlUpdate);
             */

            // PreparedStatement ile veri güncelleme
            /*
            PreparedStatement pr = connect.prepareStatement(prSqlUpdate);
            pr.setString(1, "Mutlu Mutlu Çocuklar");
            pr.setInt(2, 11);
            pr.executeUpdate();
             */

            //Veri silme

            // Statment ile veri silme
            /*
            st = connect.createStatement();
            st.executeUpdate(stSqlDelete);
             */

            // PreparedStatement ile veri güncelleme
            /*
            PreparedStatement pr = connect.prepareStatement(prSqlDelete);
            pr.setInt(1, 12);
            pr.executeUpdate();
             */



        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }


    }
}
