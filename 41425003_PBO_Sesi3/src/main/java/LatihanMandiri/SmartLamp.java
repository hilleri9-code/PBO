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
public class SmartLamp implements Switchable, Connectable {

    // Status perangkat
    private boolean isOn;

    // Persentase kecerahan lampu
    private int brightness;

    // Constructor
    public SmartLamp(int brightness) {
        this.brightness = brightness;
        this.isOn = false;
    }

    // Menyalakan lampu
    @Override
    public void turnOn() {
        isOn = true;

        System.out.println(
            "[Lampu Pintar] Dinyalakan dengan kecerahan "
            + brightness + "%"
        );
    }

    // Mematikan lampu
    @Override
    public void turnOff() {
        isOn = false;

        System.out.println("[Lampu Pintar] Dimatikan.");
    }

    // Menghubungkan lampu ke WiFi
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
