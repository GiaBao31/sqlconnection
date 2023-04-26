/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ketnoicsdl;

import java.sql.*;

public class main {
   public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM sinhvien";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int mssv = rs.getInt("mssv");
                String hoTen = rs.getString("tensv");
                String lop = rs.getString("lop");
               
                System.out.println(mssv + " | " + hoTen +" | " + lop);
            }
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
