/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo.w3s3.objectinitialization;

/**
 *
 * @author ASUS
 */

/*  Nama : Hilleri Siagian
    NIM  : 41425003
    Prodi: D-IV TRPL
*/

// Class Dog
class Dog {

    String name;
    String breed;
    int age;
    String color;

    // Constructor
    Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    String getName() {
        return name;
    }

    String getBreed() {
        return breed;
    }

    int getAge() {
        return age;
    }

    String getColor() {
        return color;
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {

        // Membuat object Dog
        Dog tuffy = new Dog(
                "tuffy",
                "papillon",
                5,
                "white"
        );

        System.out.println("Name is: " + tuffy.getName());

        System.out.println(
                "Breed, age, and color are: "
                + tuffy.getBreed() + ","
                + tuffy.getAge() + ","
                + tuffy.getColor()
        );
    }
}
