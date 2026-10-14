/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program03_AbstractClass;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

abstract class MantraAbstrak {
    private String nama; // nama mantra, private (enkapsulasi)

    // Constructor: dipanggil subclass lewat super(...)
    public MantraAbstrak(String nama) {
        this.nama = nama;
    }

    // Abstract method: tanpa isi, harus diimplementasikan oleh subclass
    public abstract void efek();

    // Method konkret: sudah punya implementasi, diwariskan ke semua subclass
    public void ucapkan() {
        System.out.println("Mengucapkan mantra: " + nama);
    }
}

// Mantra konkret 1: Expelliarmus
class Expelliarmus extends MantraAbstrak {
    public Expelliarmus() {
        super("Expelliarmus"); // mengirim nama ke constructor superclass
    }

    @Override
    public void efek() {
        System.out.println("Efek: Melucuti senjata lawan.");
    }
}

// Mantra konkret 2: Expecto Patronum
class ExpectoPatronum extends MantraAbstrak {
    public ExpectoPatronum() {
        super("Expecto Patronum");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Memanggil Patronus untuk melawan Dementor.");
    }
}

// Mantra konkret 3 (Instruksi nO. 2): Lumos, mantra baru
class Lumos extends MantraAbstrak {
    public Lumos() {
        super("Lumos");
    }

    @Override
    public void efek() {
        System.out.println("Efek: Menerangi ujung tongkat sihir.");
    }
}

// Kelas utama untuk menjalankan demo
public class DemoMantraAbstrak {
    public static void main(String[] args) {
        // Referensi bertipe abstract class, objek bertipe subclass konkret
        MantraAbstrak mantra1 = new Expelliarmus();
        MantraAbstrak mantra2 = new ExpectoPatronum();
        MantraAbstrak mantra3 = new Lumos(); // mantra baru

        mantra1.ucapkan(); // method konkret dari MantraAbstrak
        mantra1.efek();    // implementasi milik Expelliarmus

        mantra2.ucapkan();
        mantra2.efek();    // implementasi milik ExpectoPatronum

        mantra3.ucapkan();
        mantra3.efek();    // implementasi milik Lumos
    }
}




/*
 Pertanyaan:
 1. Apa yang terjadi jika kita mencoba membuat objek dari MantraAbstrak langsung?
    coba dan jelaskan errornya.
     Jawab:
     Terjadi COMPILE ERROR:
         "MantraAbstrak is abstract; cannot be instantiated"
     Abstract class tidak boleh di-instansiasi dengan new karena bisa memiliki
     abstract method (efek()) yang belum punya isi. Jika objeknya boleh dibuat,
     pemanggilan efek() tidak akan punya kode untuk dijalankan. Abstract class
     hanya dapat dipakai lewat subclass konkret yang mengimplementasikan
     semua abstract method-nya.
 
  2. Mengapa kita perlu membuat abstract class? Apa keuntungannya?
     Jawab:
     - Menjadi kerangka/kontrak: semua mantra WAJIB punya efek(), dan compiler
       memaksanya (lupa implementasi = error).
     - Berbagi kode umum (atribut nama dan method ucapkan()) tanpa duplikasi.
     - Mencegah pembuatan objek yang tidak masuk akal, misalnya "mantra umum"
       yang tidak punya efek jelas.
     - Mendukung polymorphism: variabel bertipe MantraAbstrak dapat menampung
       mantra apa pun.
     - Mudah diperluas: mantra baru (seperti Lumos) cukup extends dan
       implementasi efek() tanpa mengubah kode lama.
 */

