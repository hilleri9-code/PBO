/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Program01_Overloading;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/
public class Mantra {

    // Overload 1: method ucapkan() dengan satu parameter (nama mantra saja)
    public void ucapkan(String namaMantra) {
        System.out.println("Mengucapkan mantra: " + namaMantra);
    }

    // Overload 2: method ucapkan() dengan dua parameter (nama mantra + kekuatan)
    public void ucapkan(String namaMantra, int kekuatan) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan);
        // Jika kekuatan di atas 10, lawan terlempar; selain itu senjata terlepas
        if (kekuatan > 10) {
            System.out.println("Efek: Lawan terlempar!");
        } else {
            System.out.println("Efek: Senjata terlepas.");
        }
    }

    // Overload 3: method ucapkan() dengan tiga parameter (nama, kekuatan, target)
    public void ucapkan(String namaMantra, int kekuatan, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " dengan kekuatan " + kekuatan + " pada " + target);
        if (kekuatan > 10) {
            System.out.println("Efek: " + target + " terlempar!");
        } else {
            System.out.println("Efek: Senjata " + target + " terlepas.");
        }
    }

    // Overload 4 (INSTRUKSI NO. 2): menerima namaMantra dan target, TANPA parameter kekuatan
    public void ucapkan(String namaMantra, String target) {
        System.out.println("Mengucapkan mantra: " + namaMantra + " pada " + target);
        // Karena kekuatan tidak diberikan, efek yang dicetak adalah efek standar
        System.out.println("Efek: " + target + " terkena mantra " + namaMantra + " dengan kekuatan standar.");
    }

    // Overload 5 (PERTANYAAN 2): urutan parameter dibalik -> (int, String)
    // Signature-nya berbeda dari ucapkan(String, int), sehingga sah sebagai overload.
    public void ucapkan(int kekuatan, String namaMantra) {
        System.out.println("[Urutan parameter dibalik] kekuatan = " + kekuatan + ", mantra = " + namaMantra);
        // Mendelegasikan ke overload 2 agar logika tidak ditulis ulang
        ucapkan(namaMantra, kekuatan);
    }

    // Method main untuk menjalankan semua overload
    public static void main(String[] args) {
        Mantra mantra = new Mantra();            // membuat objek Mantra
        mantra.ucapkan("Expelliarmus");          // -> overload 1
        mantra.ucapkan("Expelliarmus", 5);       // -> overload 2
        mantra.ucapkan("Expelliarmus", 15, "Voldemort"); // -> overload 3
        mantra.ucapkan("Expelliarmus", "Voldemort");     // -> overload 4 (baru)
        mantra.ucapkan(15, "Expelliarmus");      // -> overload 5 (urutan dibalik)
    }
}



/*
Pertanyaan:
 1. Apa yang terjadi jika kita menghapus salah satu method overloading?
     misalnya dengan dua parameter.
     Jawab:
     Terjadi COMPILE ERROR pada pemanggilan mantra.ucapkan("Expelliarmus", 5)
    (pesan: "no suitable method found for ucapkan(String,int)"), karena Java
     memilih method berdasarkan signature (jumlah, tipe, dan urutan parameter)
     saat kompilasi. Tidak ada lagi method yang cocok untuk argumen (String, int).
     Catatan: overload (int, String) tidak membantu karena urutannya berbeda.
     Jadi pemanggilan tersebut harus dihapus atau method yang dihapus
     dikembalikan.
 
  2. Bisakah kita membuat method overloading dengan urutan parameter berbeda?
     coba buat method ucapkan(int kekuatan, String namaMantra)
     Jawab:
     BISA. ucapkan(int kekuatan, String namaMantra) sah sebagai overload dari
     ucapkan(String namaMantra, int kekuatan), karena daftar tipe parameternya
     berbeda urutan, sehingga signature-nya berbeda. Yang TIDAK bisa adalah
     overload yang hanya berbeda pada return type atau nama parameter, karena
     signature-nya tetap sama dan menyebabkan error "already defined".
 */
