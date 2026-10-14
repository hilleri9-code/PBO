/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LatihanMandiri;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

public class StudentGrade {

    // Data mahasiswa dibuat private agar tidak dapat diubah langsung
    private String nim;
    private String nama;

    // Nilai kuis dan UTS juga dibuat private
    private double nilaiKuis;
    private double nilaiUTS;

    // Grade huruf hanya dapat dibaca dari luar class
    private String gradeHuruf;

    // Constructor
    public StudentGrade(String nim, String nama) {
        this.nim = nim;
        this.nama = nama;

        this.nilaiKuis = 0.0;
        this.nilaiUTS = 0.0;

        updateGradeHuruf();
    }

    // Getter NIM
    public String getNim() {
        return nim;
    }

    // Getter nama
    public String getNama() {
        return nama;
    }

    // Getter nilai kuis
    public double getNilaiKuis() {
        return nilaiKuis;
    }

    // Getter nilai UTS
    public double getNilaiUTS() {
        return nilaiUTS;
    }

    // Getter grade huruf
    public String getGradeHuruf() {
        return gradeHuruf;
    }

    // Setter nilai kuis dengan validasi
    public void setNilaiKuis(double nilaiKuis) {

        if (nilaiKuis >= 0.0 && nilaiKuis <= 100.0) {
            this.nilaiKuis = nilaiKuis;
            updateGradeHuruf();

            System.out.println(
                "[Update] Nilai kuis berhasil diubah menjadi: "
                + nilaiKuis
            );
        } else {
            System.out.println(
                "[Error] Nilai kuis tidak valid: "
                + nilaiKuis
                + " (harus antara 0 - 100)"
            );
        }
    }

    // Setter nilai UTS dengan validasi
    public void setNilaiUTS(double nilaiUTS) {

        if (nilaiUTS >= 0.0 && nilaiUTS <= 100.0) {
            this.nilaiUTS = nilaiUTS;
            updateGradeHuruf();

            System.out.println(
                "[Update] Nilai UTS berhasil diubah menjadi: "
                + nilaiUTS
            );
        } else {
            System.out.println(
                "[Error] Nilai UTS tidak valid: "
                + nilaiUTS
                + " (harus antara 0 - 100)"
            );
        }
    }

    // Menghitung nilai akhir
    public double hitungNilaiAkhir() {
        return (nilaiKuis * 0.40) + (nilaiUTS * 0.60);
    }

    // Method private untuk memperbarui grade secara otomatis
    private void updateGradeHuruf() {

        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 80) {
            gradeHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            gradeHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            gradeHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            gradeHuruf = "D";
        } else {
            gradeHuruf = "E";
        }
    }

    // Menampilkan laporan hasil studi
    public void cetakLaporan() {

        System.out.println("=== KARTU HASIL STUDI ===");
        System.out.println("NIM        : " + nim);
        System.out.println("Nama       : " + nama);
        System.out.println("Nilai Kuis : " + nilaiKuis);
        System.out.println("Nilai UTS  : " + nilaiUTS);
        System.out.println("Nilai Akhir: " + hitungNilaiAkhir());
        System.out.println("Grade Huruf: " + gradeHuruf);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {

        // Membuat objek mahasiswa
        StudentGrade student =
                new StudentGrade("11425001", "Marsha");

        System.out.println(
            "[Registrasi] Berhasil mendaftarkan mahasiswa: "
            + student.getNim() + " - "
            + student.getNama()
        );

        // Menguji nilai yang tidak valid
        student.setNilaiKuis(110.0);

        // Memberikan nilai kuis yang valid
        student.setNilaiKuis(85.0);

        // Memberikan nilai UTS
        student.setNilaiUTS(90.0);

        // Menampilkan laporan
        student.cetakLaporan();
    }
}