/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian2;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/
// Abstract class KendaraanEkspedisi menjadi blueprint dasar
// untuk semua kendaraan yang digunakan dalam proses ekspedisi.
abstract class KendaraanEkspedisi {

    // Menyimpan nomor polisi kendaraan.
    protected String noPolisi;

    // Menyimpan kapasitas angkut kendaraan dalam kilogram.
    protected int kapasitasKg;

    // Constructor digunakan untuk mengisi nomor polisi
    // dan kapasitas kendaraan.
    public KendaraanEkspedisi(String noPolisi, int kapasitasKg) {
        this.noPolisi = noPolisi;
        this.kapasitasKg = kapasitasKg;
    }

    // Concrete method untuk menampilkan informasi kendaraan.
    public void infoKendaraan() {
        System.out.println("Plat Nomor: " + noPolisi + " | Daya Angkut: " + kapasitasKg + " Kg");
    }

    // Abstract method yang wajib diimplementasikan
    // oleh setiap subclass konkret.
    public abstract void angkutBarang(String namaBarang);
}

// TrukBox merupakan subclass konkret dari KendaraanEkspedisi.
class TrukBox extends KendaraanEkspedisi {

    // Constructor TrukBox meneruskan data ke constructor parent.
    public TrukBox(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi method angkutBarang khusus untuk TrukBox.
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Truk [" + noPolisi + "] memuat '" + namaBarang + 
                "' ke dalam kontainer tertutup pendingin.");
    }
}

// MobilVan merupakan subclass konkret dari KendaraanEkspedisi.
class MobilVan extends KendaraanEkspedisi {

    // Constructor MobilVan meneruskan data ke constructor parent.
    public MobilVan(String noPolisi, int kapasitasKg) {
        super(noPolisi, kapasitasKg);
    }

    // Implementasi method angkutBarang khusus untuk MobilVan.
    @Override
    public void angkutBarang(String namaBarang) {
        System.out.println("Mobil Van [" + noPolisi + "] memuat '" + namaBarang + 
                "' di bagasi belakang untuk distribusi kota.");
    }
}

// Class utama untuk menjalankan simulasi abstract class.
public class SimulasiAbstraksi {

    // Method main merupakan titik awal program.
    public static void main(String[] args) {

        // Menampilkan judul program.
        System.out.println("=== INI ABSTRACT CLASS ===");

        // PERCOBAAN 1: Menguji larangan instansiasi langsung abstract class
        // KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
        
        // PERCOBAAN 2: Membuat objek dari subclass konkret TrukBox.
        TrukBox fuso = new TrukBox("B 9081 TXT", 5000);

        // Menampilkan informasi kendaraan.
        fuso.infoKendaraan();

        // Menjalankan method angkutBarang() milik TrukBox.
        fuso.angkutBarang("20 Unit Kulkas");

        // Menampilkan pemisah output.
        System.out.println("--------------------------------");

        // Membuat objek dari subclass konkret MobilVan.
        MobilVan grandmax = new MobilVan("B 1122 KAA", 800);

        // Menampilkan informasi kendaraan.
        grandmax.infoKendaraan();

        // Menjalankan method angkutBarang() milik MobilVan.
        grandmax.angkutBarang("50 Kotak Sepatu");
    }
}

/*
Eksperimen 1: Pada class SimulasiAbstraksi, buka komentar (uncomment) pada baris
PERCOBAAN 1: KendaraanEkspedisi k = new KendaraanEkspedisi("BK 1234 DEL", 100);
Pertanyaan: Salin pesan error yang dihasilkan oleh Java. Mengacu pada "Kotak Insight Konsep"
yang sudah Anda baca, mengapa Java menggagalkan baris kode ini?
Jawab: Java menolak pembuatan objek tersebut karena KendaraanEkspedisi 
merupakan abstract class. Abstract class hanya digunakan sebagai 
blueprint atau kelas dasar dan tidak dapat dibuat menjadi objek secara langsung 
menggunakan new. Objek harus dibuat dari subclass konkret seperti TrukBox atau MobilVan.

Eksperimen 2: Buatlah sebuah class baru dengan nama MotorKurir yang melakukan extends ke
KendaraanEkspedisi, tetapi jangan menuliskan isi method angkutBarang() di dalamnya.
Pertanyaan: Arahkan kursor (hover) ke garis merah error pada tulisan class MotorKurir. 
Jawab: Dua solusi yang ditawarkan IDE adalah mengimplementasikan abstract 
method angkutBarang() pada MotorKurir, atau menjadikan MotorKurir 
sebagai abstract class.
*/