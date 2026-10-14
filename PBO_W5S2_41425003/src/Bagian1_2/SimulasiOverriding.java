/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bagian1_2;

/**
 *
 * @author ASUS
 */
/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

// Class KurirReguler merupakan parent class
// yang memiliki perilaku pengiriman melalui jalur darat.
class KurirReguler {

    // Menyimpan nama kurir.
    protected String nama;

    // Constructor digunakan untuk mengisi nama kurir.
    public KurirReguler(String nama) {
        this.nama = nama;
    }

    // Method kirimBarang digunakan untuk mengirim barang melalui jalur darat.
    public void kirimBarang(String alamat) {
        System.out.println(
                nama + " mengantar paket ke " + alamat
                + " lewat jalur darat menembus kemacetan."
        );
    }
}

// KurirDrone merupakan child class dari KurirReguler.
class KurirDrone extends KurirReguler {

    // Menyimpan ID drone.
    private String idDrone;

    // Constructor KurirDrone memanggil constructor parent menggunakan super().
    public KurirDrone(String nama, String idDrone) {
        super(nama);
        this.idDrone = idDrone;
    }

    // @Override menunjukkan bahwa method ini menggantikan
    // method kirimBarang() milik parent class.
    @Override
    public void kirimBarang(String alamat) {
        System.out.println(
                "Unit Drone [" + idDrone + "] operator " + nama
                + " terbang mengantar paket langsung ke koordinat: "
                + alamat
        );
    }
}

// Class utama untuk menjalankan simulasi overriding.
public class SimulasiOverriding {

    // Method main merupakan titik awal program.
    public static void main(String[] args) {

        // Menampilkan judul program.
        System.out.println("=== INI METHOD OVERRIDING ===");

        // Membuat objek KurirReguler.
        KurirReguler k1 = new KurirReguler("Budi");

        // Membuat objek KurirDrone tetapi referensinya bertipe KurirReguler.
        // Ini merupakan contoh penggunaan runtime polymorphism.
        KurirReguler k2 = new KurirDrone("Arka", "DRN-01");

        // Memanggil method dari kurir reguler.
        k1.kirimBarang("Jl. Sudirman No. 10");

        // Walaupun tipe referensi k2 adalah KurirReguler,
        // Java menjalankan method milik KurirDrone.
        k2.kirimBarang("Gedung Graha Lt. 5");
    }
}

/*
Lembar Analisis Overriding

1. Apa output yang tercetak dari
   k2.kirimBarang("Gedung Graha Lt. 5")?
Jawaban: Output berubah menjadi pesan dari class KurirReguler,
yaitu paket dikirim lewat jalur darat. Hal ini terjadi karena
nama method pada KurirDrone sengaja diubah menjadi
kirimbarang() dengan huruf 'b' kecil, sehingga method tersebut
tidak lagi dianggap sebagai overriding dari method kirimBarang()
milik class KurirReguler.

2. Setelah @Override dikembalikan, apa pesan error yang muncul?
Jawaban: Compiler akan memberikan error yang menunjukkan bahwa method
kirimbarang(String) tidak melakukan override terhadap method
dari superclass.

3. Apa fungsi utama @Override bagi seorang programmer?
Jawaban: Fungsi utama @Override adalah memberi tahu compiler bahwa
method tersebut dimaksudkan untuk melakukan overriding terhadap
method yang ada pada class induk. Dengan adanya @Override,
compiler dapat membantu mendeteksi kesalahan seperti salah
penulisan nama method atau parameter. Jadi, @Override membantu
programmer memastikan bahwa method yang dibuat benar-benar
menggantikan method dari class induk.
*/