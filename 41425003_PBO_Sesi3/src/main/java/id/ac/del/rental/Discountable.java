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

// Interface Discountable digunakan sebagai kontrak untuk berbagai jenis diskon.
public interface Discountable {

    // Method ini digunakan untuk menghitung jumlah diskon
    // berdasarkan jumlah biaya yang diberikan.
    double calculateDiscount(double amount);
}
