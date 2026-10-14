/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_1;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

// Class MesinTarif digunakan untuk menghitung tarif pengiriman.
class MesinTarif {

    // Menyimpan nama kota asal pengiriman.
    private String kotaAsal;

    // Constructor digunakan untuk membuat objek MesinTarif.
    public MesinTarif(String kotaAsal) {
        this.kotaAsal = kotaAsal;
    }

    // Method pertama menghitung ongkir berdasarkan berat barang saja.
    public double hitungOngkir(double beratKg) {
        return beratKg * 10000;
    }

    // Method kedua menghitung ongkir berdasarkan berat dan nilai barang.
    // Method ini juga menambahkan biaya asuransi sebesar 1% dari nilai barang.
    public double hitungOngkir(double beratKg, double nilaiBarang) {

        // Menghitung biaya asuransi dari nilai barang.
        double biayaAsuransi = nilaiBarang * 0.01;

        // Mengembalikan ongkir ditambah biaya asuransi.
        return (beratKg * 10000) + biayaAsuransi;
    }

    // Method ketiga menghitung ongkir berdasarkan berat
    // dan menentukan apakah pengiriman menggunakan layanan express.
    public double hitungOngkir(double beratKg, boolean isExpress) {

        // Menghitung ongkir dasar.
        double total = beratKg * 10000;

        // Jika menggunakan layanan express,
        // maka dikenakan biaya tambahan Rp20.000.
        if (isExpress) {
            total += 20000;
        }

        // Mengembalikan total ongkir.
        return total;
    }
}

// Class utama untuk menjalankan percobaan method overloading.
public class SimulasiOverloading {

    // Method main merupakan titik awal program.
    public static void main(String[] args) {

        // Membuat objek MesinTarif dengan kota asal Medan.
        MesinTarif tarif = new MesinTarif("Medan");

        // Menampilkan judul percobaan.
        System.out.println("=== INI METHOD OVERLOADING ===");

        // Memanggil method dengan satu parameter.
        System.out.println("Ongkir Biasa (2.0 Kg)     : Rp " + tarif.hitungOngkir(2.0));

        // Memanggil method dengan dua parameter
        // yaitu berat barang dan nilai barang.
        System.out.println("Ongkir + Asuransi (Barang 5Jt): Rp " + tarif.hitungOngkir(2.0, 5000000.0));

        // Memanggil method dengan parameter berat dan boolean express.
        System.out.println("Ongkir Express (2.0 Kg)   : Rp " + tarif.hitungOngkir(2.0, true));
    }
}

/*
1. Mengapa compiler dapat menentukan method hitungOngkir?
Jawaban: Compiler dapat menentukan method hitungOngkir karena setiap method
memiliki parameter yang berbeda. Compiler memeriksa nama method,
jumlah parameter, tipe data parameter, dan urutan parameter untuk
menentukan method mana yang sesuai dengan pemanggilan.

2. Mengapa compiler menolak kode tersebut padahal tipe kembaliannya berbeda (int vs double)?
Jawaban: Compiler menolak method tersebut karena perbedaan return type saja 
tidak cukup untuk melakukan overloading. Kedua method memiliki nama dan 
parameter yang sama sehingga dianggap sebagai method yang sama. Return type 
bukan bagian dari pembeda signature method.
*/
