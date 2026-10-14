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
public class SmartAC implements Switchable, Connectable {

    // Status perangkat
    private boolean isOn;

    // Suhu AC
    private int temperature;

    // Constructor
    public SmartAC(int temperature) {
        this.temperature = temperature;
        this.isOn = false;
    }

    // Menyalakan AC
    @Override
    public void turnOn() {
        isOn = true;

        System.out.println(
            "[AC Pintar] Dinyalakan pada suhu "
            + temperature + "°C"
        );
    }

    // Mematikan AC
    @Override
    public void turnOff() {
        isOn = false;

        System.out.println("[AC Pintar] Dimatikan.");
    }

    // Menghubungkan AC ke WiFi
    @Override
    public void connectToWifi(String ssid, String ipAddress) {

        // Perangkat tidak boleh terhubung jika masih mati
        if (!isOn) {
            System.out.println(
                "[WiFi Device] Gagal terhubung: perangkat masih mati."
            );
            return;
        }

        System.out.println(
            "[WiFi Device] Terhubung ke jaringan: "
            + ssid + " (IP: " + ipAddress + ")"
        );
    }
}

