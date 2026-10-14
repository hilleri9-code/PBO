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

    String name;
    int id;

    // Parameterized Constructor
    Geeks(String name, int id) {
        this.name = name;
        this.id = id;
    }
}

// Class utama
public class ParameterizedConstructor {

    public static void main(String[] args) {

        Geeks geek1 =
                new Geeks("Geeks", 68);

        System.out.println(
                "GeekName: " + geek1.name
                + " and GeekId: " + geek1.id
        );
    }
}
