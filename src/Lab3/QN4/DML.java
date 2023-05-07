package Lab3.QN4;

import java.sql.*;

public class DML {
    public static void main(String[] args) {
        Connection conn;
        PreparedStatement stmt;
        ResultSet rs;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java", "root", "");
            String sql = "INSERT INTO students (name, reg_no, batch) VALUES (?, ?, ?)";
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, "John Doe");
            stmt.setString(2, "12345");
            stmt.setInt(3, 2023);
            int rowsAffected = stmt.executeUpdate();
            System.out.println("Rows affected by INSERT: " + rowsAffected);
            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                int id = rs.getInt(1);
                System.out.println("Generated ID: " + id);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

