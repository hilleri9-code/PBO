/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.rental;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/


// Class MemberDiscount merupakan implementasi dari interface Discountable.
public class MemberDiscount implements Discountable {

    // Method ini digunakan untuk menghitung jumlah diskon member.
    @Override
    public double calculateDiscount(double amount) {

        // Member mendapatkan diskon sebesar 20% dari total biaya.
        return amount * 0.20;
    }
}
