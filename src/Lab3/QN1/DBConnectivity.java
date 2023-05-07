package Lab3.QN1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnectivity {
    public static void main(String[] args) {
        Statement stmt;
        Connection conn;
        ResultSet rs;
        String sql;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/advance_java",
                    "root", "");
            stmt = conn.createStatement();
            sql = "INSERT INTO students(name,reg_no,batch) VALUES('John Lenon', '2016-05-68', '2016');";
            stmt.execute(sql);
            sql = "SELECT * FROM students;";
            rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.printf("%s %s %d\n", rs.getString("name"), rs.getString("reg_no"),
                        rs.getInt("batch"));
            }
            sql = "UPDATE students SET name='Lenon John' WHERE batch='2016'";
            stmt.execute(sql);
            sql = "DELETE FROM students WHERE batch='2019'";
            stmt.execute(sql);
            rs.close();
            stmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
