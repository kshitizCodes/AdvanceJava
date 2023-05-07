package Lab3.QN3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DDL {
    public static void main(String[] args) {
        Statement stmt;
        Connection conn;
        String sql;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java",
                    "root", "");
            stmt = conn.createStatement();
            sql = "CREATE TABLE students (id INT(5) PRIMARY KEY AUTO_INCREMENT, name VARCHAR(64), " +
                    "reg_no VARCHAR(64), batch INT(4))";
            stmt.executeUpdate(sql);
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

