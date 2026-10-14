/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program02_Overriding;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

// Superclass: perilaku default seorang penyihir
class Penyihir {
    // Implementasi umum yang akan di-override oleh subclass
    public void ucapkanMantra() {
        System.out.println("Mengucapkan mantra dengan cara biasa.");
    }
}

// Subclass 1: Harry Potter
class HarryPotter extends Penyihir {
    @Override // memastikan method ini benar-benar meng-override method superclass
    public void ucapkanMantra() {
        System.out.println("Harry Potter mengucapkan mantra dengan tongkatnya yang unik.");
    }
}

// Subclass 2: Hermione
class Hermione extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Hermione mengucapkan mantra dengan tepat dan percaya diri.");
    }
}

// Subclass 3 (Instruksi nO. 2): Ron Weasley, override sesuai karakter Ron
class RonWeasley extends Penyihir {
    @Override
    public void ucapkanMantra() {
        System.out.println("Ron Weasley mengucapkan mantra dengan gugup, tetapi penuh semangat dan keberanian.");
    }
}

// Kelas utama untuk menjalankan demo
public class DemoPenyihir {
    public static void main(String[] args) {
        // Referensi bertipe Penyihir, objek aslinya subclass (polymorphism)
        Penyihir penyihir1 = new HarryPotter();
        Penyihir penyihir2 = new Hermione();
        Penyihir penyihir3 = new RonWeasley();

        // Method yang dipanggil ditentukan oleh tipe objek aslinya (dynamic binding)
        penyihir1.ucapkanMantra(); // Output: Harry Potter mengucapkan mantra dengan tongkatnya yang unik.
        penyihir2.ucapkanMantra(); // Output: Hermione mengucapkan mantra dengan tepat dan percaya diri.
        penyihir3.ucapkanMantra(); // Output: Ron Weasley mengucapkan mantra ...

        // Bukti manfaat polymorphism: satu loop dapat memproses semua jenis penyihir
        System.out.println("--- Semua penyihir lewat satu array ---");
        Penyihir[] semua = { penyihir1, penyihir2, penyihir3, new Penyihir() };
        for (Penyihir p : semua) {
            p.ucapkanMantra(); // tiap objek menjalankan versinya sendiri
        }
    }
}



/*
Pertanyaan:
 1. Apa yang terjadi jika tidak menggunakan annotation @Override? Apakah kode masih berjalan?
     Jawab:
     Kode masih berjalan normal. @Override bersifat opsional; method dengan nama
     dan parameter yang sama tetap meng-override method superclass. Fungsi
     annotation ini adalah pengaman saat kompilasi: jika kita salah ketik nama
     method (misal ucapkanmantra()) atau salah parameter, compiler langsung
     memberi error "method does not override or implement a method from a supertype".
     Tanpa @Override, kesalahan itu tidak terdeteksi: Java menganggapnya method baru,
     dan saat dipanggil lewat referensi Penyihir yang tercetak malah versi
     superclass ("cara biasa"), sehingga bug sulit dilacak.
 
  2. Apa keuntungan menggunakan polymorphism dalam contoh ini?
     Jawab:
     - Kode pemanggil cukup bergantung pada tipe Penyihir, tanpa if/else atau
       switch untuk tiap jenis penyihir.
     - Mudah diperluas: menambah RonWeasley tidak mengubah kode pemanggil.
     - Satu array/list Penyihir dapat menampung semua subclass dan diproses dengan
       satu loop.
     - Kode lebih ringkas, mudah dirawat, dan fleksibel.
 */

