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
// Interface pertama
interface LandVehicle {

    default void landInfo() {
        System.out.println(
                "This is a LandVehicle"
        );
    }
}

// Interface kedua
interface WaterVehicle {

    default void waterInfo() {
        System.out.println(
                "This is a WaterVehicle"
        );
    }
}

// Class yang menggunakan dua interface
class AmphibiousVehicle
        implements LandVehicle, WaterVehicle {

    AmphibiousVehicle() {
        System.out.println(
                "This is an AmphibiousVehicle"
        );
    }
}

// Class utama
public class MultipleInheritance {

    public static void main(String[] args) {

        AmphibiousVehicle obj =
                new AmphibiousVehicle();

        obj.waterInfo();
        obj.landInfo();
    }
}