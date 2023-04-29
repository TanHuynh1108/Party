/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class Person {
    private int ID;
    private String Name;
    private int Age;
    private String Phone;
    private Address Address;
    private int stt;
    public Person() {
        
    }

    public Person(int ID, String Name, int Age, String Phone, Address Address) {
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Phone = Phone;
        this.Address = Address;
    }

    public Person(int ID, String Name, int Age, String Phone, Address Address, int stt) {
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
        this.Phone = Phone;
        this.Address = Address;
        this.stt = stt;
    }
    
    public Person(String Name, int Age, String Phone, Address Address) {
        this.Name = Name;
        this.Age = Age;
        this.Phone = Phone;
        this.Address = Address;
    }    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Address getAddress() {
        return Address;
    }

    public void setAddress(Address Address) {
        this.Address = Address;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }
    
    @Override
    public String toString() {
        return "Person{" + "ID=" + ID + ", Name=" + Name + ", Age=" + Age + ", Phone=" + Phone + ", Address=" + Address.getAddressName() + '}';
    }

    
    
}
