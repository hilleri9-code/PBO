/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.inheritance;

/**
 *
 * @author ASUS
 */

/*  Nama : Hilleri Siagian
    NIM  : 41425003
    Prodi: D-IV TRPL
*/
// Parent class
class Vehicle {

    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}

// Child class
class Car extends Vehicle {

    Car() {
        System.out.println("This Vehicle is Car");
    }
}

// Class utama
public class SingleInheritance {

    public static void main(String[] args) {

        Car obj = new Car();
    }
}