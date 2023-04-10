package Bai4;
import java.sql.*;

public class Bai4 {
    public static void main(String[] args) {
        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=T3H;user=sa;password=123;";
        String query = "SELECT * FROM mytable;"; // Thay đổi mytable thành tên bảng của bạn
        
        try (Connection connection = DriverManager.getConnection(connectionUrl);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {

            // Đọc dữ liệu từ ResultSet
            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String avatar = resultSet.getString("avatar");
                String email = resultSet.getString("email");
                String fullName = resultSet.getString("full_name");
                int status = resultSet.getInt("status");
                String source = resultSet.getString("source");
                String pw = resultSet.getString("password");

                // In ra console
                System.out.println("username: " + username + ", avatar: " + avatar + ", email: " + email ", fullName: " + fullName +", status: " + status +", source: " + source + ", password: " + pw);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
