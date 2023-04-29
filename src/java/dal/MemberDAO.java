/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Member;

public class MemberDAO extends DBContext {
    public Member getUser(String username, String password) {
        try {
            String sql = "Select * From Member Where username = ? AND password = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int ID = rs.getInt("ID");
                String UserName = rs.getString("username");
                String Password = rs.getString("password");
                String Name = rs.getString("name");
                Member user = new Member(ID, UserName, Password, Name);
                return user;
            }
        } catch (SQLException ex) {
            System.out.println("Have an error: " + ex.getMessage());
        }
        return null;
    }
}
