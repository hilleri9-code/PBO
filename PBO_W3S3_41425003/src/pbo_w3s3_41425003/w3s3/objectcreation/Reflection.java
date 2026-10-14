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
// Class Student
class Student {

    public Student() {
    }
}

// Class utama
public class Reflection {

    public static void main(String[] args) {

        try {
            Class<?> c = Class.forName(
                    "pbo.w3s3.objectcreation.Student"
            );

            Student s2 = (Student)
                    c.getDeclaredConstructor().newInstance();

            System.out.println(
                    "Object created: " + s2
            );

        } catch (ClassNotFoundException e) {
            System.err.println("Class not found!");

        } catch (NoSuchMethodException e) {
            System.err.println(
                    "No default constructor!"
            );

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}