/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.gettersetter;

/**
 *
 * @author ASUS
 */

/*  Nama : Hilleri Siagian
    NIM  : 41425003
    Prodi: D-IV TRPL
*/
// Class GetSet
class GetSet {

    private String name;

    // Getter
    public String getName() {
        return name;
    }

    // Setter
    public void setName(String N) {
        this.name = N;
    }
}

// Class utama
public class BasicGetterSetter {

    public static void main(String[] args) {

        GetSet obj = new GetSet();

        obj.setName("Geeks for Geeks");

        System.out.println(obj.getName());
    }
}
