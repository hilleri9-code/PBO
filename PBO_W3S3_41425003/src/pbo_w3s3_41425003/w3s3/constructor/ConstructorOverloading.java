/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.constructor;

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

    // Constructor satu argument String
    Geeks(String name) {
        System.out.println(
                "Constructor with one argument = String = "
                + name
        );
    }

    // Constructor dua argument
    Geeks(String name, int age) {
        System.out.println(
                "Constructor with two arguments: "
                + "String and Integer = "
                + name + " " + age
        );
    }

    // Constructor satu argument long
    Geeks(long id) {
        System.out.println(
                "Constructor with one argument: "
                + "Long = " + id
        );
    }
}

// Class utama
public class ConstructorOverloading {

    public static void main(String[] args) {

        Geeks geek2 = new Geeks("Geeks");
        Geeks geek3 = new Geeks("Amiya", 28);
        Geeks geek4 = new Geeks(325614567);
    }
}