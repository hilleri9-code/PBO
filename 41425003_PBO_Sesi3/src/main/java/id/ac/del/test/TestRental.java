/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package id.ac.del.test;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

import id.ac.del.rental.VehicleRental;
import id.ac.del.rental.Discountable;
import id.ac.del.rental.MemberDiscount;

// Class TestRental digunakan untuk menguji proses penyewaan kendaraan.
public class TestRental {

    // Method main merupakan titik awal program.
    public static void main(String[] args) {

        // Membuat objek kendaraan dengan harga sewa Rp250.000 per hari.
        VehicleRental v =
                new VehicleRental("BK 1234 DEL", 250000);

        // Menentukan jumlah hari penyewaan sebanyak 7 hari.
        v.setRentalDays(7);

        // Membuat objek diskon menggunakan implementasi MemberDiscount.
        Discountable discount =
                new MemberDiscount();

        // Menghitung total biaya dengan menggunakan diskon member.
        double total =
                v.getTotalCost(discount);

        // Menampilkan total biaya penyewaan setelah mendapatkan diskon.
        System.out.println(
            "Total Biaya: Rp" + total
        );
    }
}