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

// Class VehicleRental digunakan untuk mengelola proses penyewaan kendaraan.
public class VehicleRental {

    // Data kendaraan dibuat private agar tidak dapat diubah langsung dari luar class.
    private String plateNumber;
    private double rentalRatePerDay;
    private int rentalDays;

    // Constructor digunakan untuk membuat objek VehicleRental.
    public VehicleRental(String plateNumber, double rate) {

        // Menyimpan nomor kendaraan.
        this.plateNumber = plateNumber;

        // Memastikan harga sewa tidak bernilai negatif.
        if (rate >= 0) {
            this.rentalRatePerDay = rate;
        } else {
            this.rentalRatePerDay = 0;
        }

        // Nilai awal jumlah hari sewa adalah 0.
        this.rentalDays = 0;
    }

    // Method ini digunakan untuk menentukan jumlah hari penyewaan.
    public void setRentalDays(int days) {

        // Validasi agar jumlah hari tidak boleh negatif.
        if (days >= 0) {
            this.rentalDays = days;
        } else {
            System.out.println(
                "Jumlah hari sewa tidak boleh negatif."
            );
        }
    }

    // Method ini menghitung total biaya dengan menggunakan objek Discountable.
    public double getTotalCost(Discountable discount) {

        // Menghitung total biaya sebelum mendapatkan diskon.
        double amount =
                rentalRatePerDay * rentalDays;

        // Menghitung jumlah diskon melalui interface Discountable.
        double discountAmount =
                discount.calculateDiscount(amount);

        // Mengurangi total biaya dengan jumlah diskon.
        return amount - discountAmount;
    }
}