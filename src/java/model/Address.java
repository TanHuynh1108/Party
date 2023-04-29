/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class Address {
    private int ID;
    private String AddressName;
    
    public Address() {
        
    }

    public Address(int ID, String AddressName) {
        this.ID = ID;
        this.AddressName = AddressName;
    }

    public Address(String AddressName) {
        this.AddressName = AddressName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddressName() {
        return AddressName;
    }

    public void setAddressName(String AddressName) {
        this.AddressName = AddressName;
    }
    
    
    
}
