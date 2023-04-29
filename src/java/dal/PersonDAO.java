/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Address;
import model.Person;

public class PersonDAO extends DBContext{
    
    public List<Person> getAll() {
        List<Person> listPersons = new ArrayList<Person>();
        String sql = "Select * From Person";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int ID = rs.getInt("ID");
                String Name = rs.getString("Name");
                int Age = rs.getInt("Age");
                String Phone = rs.getString("Phone");
                int AddressID = rs.getInt("AddressID");
                AddressDAO ad = new AddressDAO();
                Person person = new Person(ID, Name, Age, Phone,  ad.getAddress(AddressID));
                person.setStt(listPersons.size()+1);
                listPersons.add(person);
            }
        } catch (SQLException ex) {
            System.out.println("Have an error " + ex.getMessage());
        }
        return listPersons;
    }
    
    public void addPerson(Person person) {
        try {
            String sql = "Insert Into Person(Name, Age, Phone, AddressID) Values (?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, person.getName());
            ps.setInt(2, person.getAge());
            ps.setString(3, person.getPhone());
            ps.setInt(4, person.getAddress().getID());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Have an error: " + ex.getMessage());
        }
    }
    
    public void deletePerson(Person person) {
        try {
            String sql = "Delete From Person Where ID = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, person.getID());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Have an error: " + ex.getMessage());
        }
    }
    
    public Person getPerson(int id) {
        String sql = "Select * From Person Where ID = ?";
        try {
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int ID = rs.getInt("ID");
                String Name = rs.getString("Name");
                int Age = rs.getInt("Age");
                String Phone = rs.getString("Phone");
                int addressID = rs.getInt("AddressID");
                AddressDAO ad = new AddressDAO();
                Person person = new Person(ID, Name, Age, Phone, ad.getAddress(addressID));
                return person;
            }
        } catch (SQLException ex) {
            System.out.println("The error is: " + ex.getMessage());
        }
       return null;
    }
    
    public void updatePerson(Person person) {
        try {
            String sql = "UPDATE [dbo].[Person]\n" +
                        "   SET [Name] = ?\n" +
                        "      ,[Age] = ?\n" +
                        "      ,[Phone] = ?\n" +
                        "      ,[AddressID] = ?\n" +
                        " WHERE [ID] = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, person.getName());
            ps.setInt(2, person.getAge());
            ps.setString(3, person.getPhone());
            ps.setInt(4, person.getAddress().getID());
            ps.setInt(5, person.getID());
            ps.execute();
        } catch (SQLException ex) {
            System.out.println("Have an error: " + ex.getMessage());
        }
    }
     public ArrayList<Person> joinAddressAndPerson() {
        try {
            ArrayList<Person> listPersonJoin = new ArrayList<>();
            String sql = "Select p.ID, p.Name, p.Age, p.Phone, p.AddressID, a.AddressName From Person p "
                    + "LEFT JOIN Address a ON p.AddressID = a.ID";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()) {
                int ID = rs.getInt("ID");
                String name = rs.getString("Name");
                int age = rs.getInt("Age");
                String phone = rs.getString("Phone");
                int addressID = rs.getInt("AddressID");
                AddressDAO ad = new AddressDAO();
                Address address = ad.getAddress(addressID);
                Person p = new Person(ID, name, age, phone, address);
                listPersonJoin.add(p);
            }
            return listPersonJoin;
        } catch (SQLException ex) {
            System.out.println("Have an error: " + ex.getMessage());
        }
        return null;
    }
}
