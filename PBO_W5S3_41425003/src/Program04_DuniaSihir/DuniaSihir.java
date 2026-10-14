/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program04_DuniaSihir;

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

// Abstract class: kerangka semua mantra
abstract class Mantra {
    private String nama; // nama mantra

    public Mantra(String nama) {
        this.nama = nama;
    }

    public String getNama() { // getter agar nama dapat dibaca dari luar kelas
        return nama;
    }

    // Abstract method untuk efek mantra, wajib diimplementasikan subclass
    public abstract void efek();
}

// Mantra konkret 1
class Expelliarmus extends Mantra {
    public Expelliarmus() {
        super("Expelliarmus");
    }

    @Override
    public void efek() {
        System.out.println("Melucuti senjata lawan!");
    }
}

// Mantra konkret 2
class ExpectoPatronum extends Mantra {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Memanggil Patronus!");
    }
}

// Mantra konkret 3
class Lumos extends Mantra {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Menerangi ujung tongkat!");
    }
}

// Mantra konkret 4: dibuat TANPA mengubah kelas Penyihir (pertanyaan 2)
class Alohomora extends Mantra {
    public Alohomora() {
        super("Alohomora");
    }

    @Override
    public void efek() {
        System.out.println("Membuka kunci pintu!");
    }
}

// Kelas Penyihir: menyimpan daftar mantra yang sudah dipelajari
class Penyihir {
    private String nama;
    private List<Mantra> mantraList; // list bertipe abstract class -> polymorphism

    public Penyihir(String nama) {
        this.nama = nama;
        this.mantraList = new ArrayList<>(); // list kosong saat penyihir dibuat
    }

    // Menambahkan mantra ke daftar yang dipelajari
    public void belajarMantra(Mantra mantra) {
        mantraList.add(mantra);
        System.out.println(nama + " belajar mantra: " + mantra.getNama());
    }

    // Mengucapkan satu mantra berdasarkan namanya
    public void ucapkanMantra(String namaMantra) {
        for (Mantra mantra : mantraList) {                 // telusuri semua mantra
            if (mantra.getNama().equals(namaMantra)) {     // cari nama yang cocok
                System.out.println(nama + " mengucapkan: " + mantra.getNama());
                mantra.efek();                             // polymorphism: efek sesuai jenis mantra
                return;                                    // selesai, keluar dari method
            }
        }
        // Jika loop selesai tanpa menemukan mantra
        System.out.println(nama + " belum belajar mantra " + namaMantra);
    }

    // Tambahan (Instruksi nO. 2): mengucapkan semua mantra dalam satu perintah
    public void ucapkanSemuaMantra() {
        if (mantraList.isEmpty()) { // cek dulu apakah ada mantra
            System.out.println(nama + " belum mempelajari mantra apa pun.");
            return;
        }
        System.out.println(nama + " mengucapkan semua mantranya:");
        for (Mantra mantra : mantraList) {
            System.out.println("- " + mantra.getNama());
            mantra.efek(); // efek dipilih otomatis berdasarkan objek mantra yang sebenarnya
        }
    }
}

// Kelas utama
public class DuniaSihir {
    public static void main(String[] args) {
        Penyihir harry = new Penyihir("Harry Potter");

        // Variabel bertipe Mantra, objek bertipe subclass (polymorphism)
        Mantra expelliarmus = new Expelliarmus();
        Mantra expectoPatronum = new ExpectoPatronum();

        harry.belajarMantra(expelliarmus);
        harry.belajarMantra(expectoPatronum);

        harry.ucapkanMantra("Expelliarmus");
        harry.ucapkanMantra("Expecto Patronum");
        harry.ucapkanMantra("Lumos"); // Harry belum belajar Lumos

        // Tambahkan mantra Lumos dan coba lagi
        Mantra lumos = new Lumos();
        harry.belajarMantra(lumos);
        harry.ucapkanMantra("Lumos");

        // Mantra baru Alohomora tanpa mengubah kelas Penyihir
        harry.belajarMantra(new Alohomora());

        // Mengucapkan semua mantra sekaligus
        System.out.println();
        harry.ucapkanSemuaMantra();
    }
}

/*
 Pertanyaan:
 1. Bagaimana polymorphism dan abstract class bekerja sama dalam contoh ini?
     Jawab:
     - Abstract class Mantra menetapkan kontrak: setiap mantra punya nama dan
       WAJIB punya efek(). Bentuk efeknya tidak ditentukan di sini.
     - Setiap subclass (Expelliarmus, ExpectoPatronum, Lumos, Alohomora)
       mengisi efek() dengan caranya sendiri.
     - Penyihir menyimpan semuanya dalam List<Mantra> (tipe abstract class).
       Saat mantra.efek() dipanggil, Java memilih implementasi berdasarkan
       objek aslinya saat runtime (dynamic binding / polymorphism).
     - Jadi abstract class menyediakan tipe bersama dan kontrak, sedangkan
       polymorphism membuat satu perintah efek() menghasilkan perilaku berbeda
       untuk tiap mantra.
 
  2. Apa yang terjadi jika kita menambahkan mantra baru tanpa mengubah kelas
     Penyihir? Apakah mudah? Mengapa?
     Jawab:
     Mudah dan berjalan tanpa error. Cukup membuat subclass baru dari Mantra
     (contoh: Alohomora) dengan implementasi efek(), lalu diberikan lewat
     belajarMantra(). Kelas Penyihir tidak perlu diubah karena hanya bergantung
     pada tipe abstrak Mantra, bukan pada mantra tertentu. Ini penerapan
     prinsip Open/Closed: terbuka untuk perluasan, tertutup untuk modifikasi.
 */

