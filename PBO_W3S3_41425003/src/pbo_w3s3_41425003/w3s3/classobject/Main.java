/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.classobject;

/**
 *
 * @author ASUS
 */
/*  Nama : Hilleri Siagian
    NIM  : 41425003
    Prodi: D-IV TRPL
*/

// Class Student
class Student {
    int id;
    String n;

    // Constructor
    public Student(int id, String n) {
        this.id = id;
        this.n = n;
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {

        // Membuat object Student
        Student s1 = new Student(10, "Alice");

        // Menampilkan data object
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}