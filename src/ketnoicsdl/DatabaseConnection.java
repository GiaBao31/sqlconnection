/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ketnoicsdl;

import java.sql.*;

//public class DatabaseConnection {
//
//    public static Connection getConnection() {
//        Connection conn = null;
//        try {
//            // Tải driver JDBC
//            Class.forName("com.mysql.jdbc.Driver");
//
//            // Kết nối với cơ sở dữ liệu
//            String url = "jdbc:mysql://localhost";
//            String username = "root";
//            String password = "";
//            // Chọn cơ sở dữ liệu
//            String dbName = "demo";
//            conn.createStatement().execute("USE " + dbName);
//
//            // Thực hiện truy vấn
//            Statement stmt = conn.createStatement();
//            conn = DriverManager.getConnection(url, username, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return conn;
//    }
//
//}

public class DatabaseConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/demo?useSSL=false&serverTimezone=UTC";
            String username = "root";
            String password = "";
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}