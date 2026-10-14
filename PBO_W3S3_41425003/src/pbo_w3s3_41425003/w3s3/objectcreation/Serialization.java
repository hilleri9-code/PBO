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
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

// Class utama
public class Serialization {

    public static void main(String[] args) {

        // Serialization
        try (ObjectOutputStream out =
                new ObjectOutputStream(
                        new FileOutputStream("student.ser"))) {

            out.writeObject(new Student("Alice"));

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialization
        try (ObjectInputStream in =
                new ObjectInputStream(
                        new FileInputStream("student.ser"))) {

            Student s = (Student) in.readObject();

            System.out.println(s);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}