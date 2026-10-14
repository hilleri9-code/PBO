/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program05_Tantangan;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

// Kelas pendukung sederhana: penyihir yang bisa menjadi Secret Keeper
class Penyihir {
    private String nama;

    public Penyihir(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }
}

// 1. Abstract class dengan method abstrak aktifkan() dan nonaktifkan()
abstract class MantraPerlindungan {
    private String nama;           // nama mantra
    private boolean aktif = false; // status mantra, awalnya nonaktif

    public MantraPerlindungan(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public boolean isAktif() {
        return aktif;
    }

    // Subclass memakai setter ini untuk mengubah status (tetap terkontrol)
    protected void setAktif(boolean aktif) {
        this.aktif = aktif;
    }

    // Abstract method: cara aktivasi dan penonaktifan berbeda tiap mantra
    public abstract void aktifkan();
    public abstract void nonaktifkan();
}

// 2a. Protego: perisai pelindung
class Protego extends MantraPerlindungan {
    public Protego() {
        super("Protego");
    }

    @Override
    public void aktifkan() {
        setAktif(true);
        System.out.println("Perisai Protego terbentuk!");
    }

    @Override
    public void nonaktifkan() {
        setAktif(false);
        System.out.println("Perisai Protego menghilang.");
    }
}

// 2b. Fidelius: membutuhkan penyihir sebagai Secret Keeper
class Fidelius extends MantraPerlindungan {
    private Penyihir secretKeeper; // penjaga rahasia, wajib ada

    // Secret Keeper diwajibkan lewat constructor
    public Fidelius(Penyihir secretKeeper) {
        super("Fidelius");
        this.secretKeeper = secretKeeper;
    }

    @Override
    public void aktifkan() {
        // Validasi: tanpa Secret Keeper mantra tidak dapat diaktifkan
        if (secretKeeper == null) {
            System.out.println("Fidelius gagal: tidak ada Secret Keeper!");
            return;
        }
        setAktif(true);
        System.out.println("Mantra Fidelius aktif! Rahasia kini disimpan oleh Secret Keeper: "
                + secretKeeper.getNama());
    }

    @Override
    public void nonaktifkan() {
        setAktif(false);
        System.out.println("Mantra Fidelius dicabut. Rahasia tidak lagi terlindungi.");
    }
}

// 2c. Mantra Anti-Apparition: mencegah apparition di area tertentu
class MantraAntiApparition extends MantraPerlindungan {
    private String area; // area yang dilindungi

    public MantraAntiApparition(String area) {
        super("Anti-Apparition");
        this.area = area;
    }

    @Override
    public void aktifkan() {
        setAktif(true);
        System.out.println("Mantra Anti-Apparition aktif: apparition dicegah di area " + area + "!");
    }

    @Override
    public void nonaktifkan() {
        setAktif(false);
        System.out.println("Mantra Anti-Apparition di area " + area + " dinonaktifkan.");
    }
}

// 3. SistemPertahanan: menampung banyak mantra perlindungan
class SistemPertahanan {
    private List<MantraPerlindungan> daftarMantra = new ArrayList<>(); // list bertipe abstrak

    // Menambah mantra ke sistem pertahanan
    public void tambahMantra(MantraPerlindungan mantra) {
        daftarMantra.add(mantra);
        System.out.println("Mantra " + mantra.getNama() + " ditambahkan ke sistem pertahanan.");
    }

    // Mengaktifkan semua mantra (polymorphism: aktifkan() sesuai jenis mantra)
    public void aktifkanSemuaMantra() {
        System.out.println("\n=== Mengaktifkan semua mantra ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.aktifkan();
        }
    }

    // Menonaktifkan semua mantra
    public void nonaktifkanSemuaMantra() {
        System.out.println("\n=== Menonaktifkan semua mantra ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            mantra.nonaktifkan();
        }
    }

    // Tambahan: menampilkan status setiap mantra
    public void tampilkanStatus() {
        System.out.println("\n=== Status sistem pertahanan ===");
        for (MantraPerlindungan mantra : daftarMantra) {
            System.out.println(mantra.getNama() + " : " + (mantra.isAktif() ? "AKTIF" : "NONAKTIF"));
        }
    }
}

// 4. Demonstrasi
public class SistemPertahananHogwarts {
    public static void main(String[] args) {
        SistemPertahanan hogwarts = new SistemPertahanan(); // sistem pertahanan Hogwarts

        // Membuat beberapa objek mantra
        MantraPerlindungan protego = new Protego();
        MantraPerlindungan fidelius = new Fidelius(new Penyihir("Albus Dumbledore"));
        MantraPerlindungan antiApparition = new MantraAntiApparition("Hogwarts");

        // Menambahkan ke sistem
        hogwarts.tambahMantra(protego);
        hogwarts.tambahMantra(fidelius);
        hogwarts.tambahMantra(antiApparition);

        hogwarts.tampilkanStatus();        // semua masih nonaktif
        hogwarts.aktifkanSemuaMantra();    // aktifkan semua
        hogwarts.tampilkanStatus();        // semua aktif
        hogwarts.nonaktifkanSemuaMantra(); // nonaktifkan semua
        hogwarts.tampilkanStatus();        // semua nonaktif lagi
    }
}



/*
Penjelasan
  - MantraPerlindungan (abstract) menetapkan kontrak aktifkan() dan nonaktifkan().
  - Protego, Fidelius, dan MantraAntiApparition mengimplementasikannya dengan
    cara masing-masing (Fidelius butuh Secret Keeper, Anti-Apparition butuh area).
  - SistemPertahanan hanya mengenal tipe MantraPerlindungan, sehingga mantra
    perlindungan baru dapat ditambahkan tanpa mengubah kelas SistemPertahanan
    (polymorphism + Open/Closed Principle).
 */

