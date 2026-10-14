/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.objectcreation;

/**
 *
 * @author ASUS
 */

/*  Nama : Hilleri Siagian
    NIM  : 41425003
    Prodi: D-IV TRPL
*/
// Class Geeks
class Geeks implements Cloneable {

    String name = "GeeksForGeeks";

    @Override
    protected Object clone()
            throws CloneNotSupportedException {

        return super.clone();
    }
}

// Class utama
public class CloneExample {

    public static void main(String[] args) {

        Geeks o1 = new Geeks();

        try {
            Geeks o2 = (Geeks) o1.clone();

            System.out.println(o2.name);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
