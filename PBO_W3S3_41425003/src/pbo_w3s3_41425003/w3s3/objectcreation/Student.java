/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.objectcreation;

/**
 *
 * @author ASUS
 */

/*  Nama : Hilleri Siagian
    NIM  : 41425003
    Prodi: D-IV TRPL
*/
import java.io.Serializable;

// Class Student
public class Student implements Serializable {

    private String name;

    // Constructor dengan parameter String
    public Student(String name) {
    this.name = name;
}

    @Override
    public String toString() {
        return "Student: " + name;
    }
}