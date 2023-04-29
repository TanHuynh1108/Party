/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Address;
import model.Person;

public class AddressDAO extends DBContext {

    public ArrayList<Address> getListAddress() {
        try {
            ArrayList<Address> listAddress = new ArrayList<>();
            String sql = "Select * From Address";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int ID = rs.getInt("ID");
                String addressName = rs.getString("AddressName");
                Address address = new Address(ID, addressName);
                listAddress.add(address);
            }
            return listAddress;
        } catch (SQLException ex) {
            System.out.println("Have an error: " + ex.getMessage());
        }
        return null;
    }

    public Address getAddress(int id) {
        try {
            String sql = "Select * From Address Where ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int ID = rs.getInt("ID");
                String nameAddress = rs.getString("AddressName");
                Address address = new Address(ID, nameAddress);
                return address;
            }
        } catch (SQLException ex) {
            System.out.println("Have an error: " + ex.getMessage());
        }
        return null;
    }
}
