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
public class SmartHome {

    public static void main(String[] args) {

        // Membuat objek lampu pintar
        SmartLamp lamp = new SmartLamp(80);

        // Membuat objek AC pintar
        SmartAC ac = new SmartAC(22);

        // Menyalakan lampu
        lamp.turnOn();

        // Menghubungkan lampu ke WiFi
        lamp.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.50"
        );

        // Menyalakan AC
        ac.turnOn();

        // Menghubungkan AC ke WiFi
        ac.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.51"
        );

        // Mematikan AC
        ac.turnOff();

        // Menguji koneksi ketika AC sudah mati
        ac.connectToWifi(
            "Rumah_Indah_5G",
            "192.168.1.51"
        );

        // Mematikan lampu
        lamp.turnOff();
    }
}