/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class Member {
    private int ID;
    private String username;
    private String password;
    private String name;
    
    public Member() {
        
    }

    public Member(int ID, String username, String password, String name) {
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" + "ID=" + ID + ", username=" + username + ", password=" + password + ", name=" + name + '}';
    }
    
}
