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

    private int num;

    // Setter
    public void setNumber(int number) {

        if (number < 1 || number > 10) {
            throw new IllegalArgumentException();
        }

        num = number;
    }

    // Getter
    public int getNumber() {
        return num;
    }
}

// Class utama
public class ValidationGetterSetter {

    public static void main(String[] args) {

        GetSet obj = new GetSet();

        obj.setNumber(5);

        System.out.println(obj.getNumber());
    }
}
