/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package user;

/**
 *
 * @author ASUS
 */
public abstract class User {

    // encapsulation
    protected String nama;

    // constructor default
    public User() {}

    // constructor parameter
    public User(String nama) {
        this.nama = nama;
    }

    // getter & setter

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // abstract method
    public abstract void tampilInfo();
    
}
