/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.objectmethod;

/**
 *
 * @author ASUS
 */

/*  Nama : Hilleri Siagian
    NIM  : 41425003
    Prodi: D-IV TRPL
*/

// Class Geeks
class Geeks {

    static String name;
    static float price;

    // Method untuk mengisi data
    static void set(String n, float p) {
        name = n;
        price = p;
    }

    // Method untuk menampilkan data
    static void get() {
        System.out.println("Software name is: " + name);
        System.out.println("Software price is: " + price);
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {

        Geeks.set("Visual studio", 0.0f);
        Geeks.get();
    }
}