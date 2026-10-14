/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_sesi3;

/**
 *
 * @author ASUS
 */

/*  Nama: Hilleri Siagian
    NIM : 41425003
    Prodi: D4 TRPL
*/

interface PaymentMethod {

    // Konstanta biaya transaksi
    double TRANSACTION_FEE = 2500.0;

    // Method untuk melakukan pembayaran
    void pay(double amount);

    // Method untuk mendapatkan detail pembayaran
    String getPaymentDetails();
}

// Class untuk pembayaran menggunakan E-Wallet
class EWalletPayment implements PaymentMethod {

    // Menyimpan nomor telepon E-Wallet
    private String phoneNumber;

    // Constructor
    public EWalletPayment(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Implementasi method pay()
    @Override
    public void pay(double amount) {

        double total = amount + TRANSACTION_FEE;

        System.out.println(
            "[E-Wallet " + phoneNumber
            + "] Pembayaran diproses: Rp" + amount
            + " (Biaya admin: Rp" + TRANSACTION_FEE
            + ") | Total: Rp" + total
        );
    }

    // Mengembalikan informasi metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: E-Wallet (" + phoneNumber + ")";
    }
}

// Class untuk pembayaran menggunakan kartu kredit
class CreditCardPayment implements PaymentMethod {

    // Menyimpan nomor kartu
    private String cardNumber;

    // Constructor
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    // Implementasi method pay()
    @Override
    public void pay(double amount) {

        System.out.println(
            "[Credit Card " + cardNumber
            + "] Pembayaran berhasil diverifikasi sebesar: Rp"
            + amount
        );
    }

    // Mengembalikan informasi metode pembayaran
    @Override
    public String getPaymentDetails() {
        return "Metode: Kartu Kredit (" + cardNumber + ")";
    }
}

// Class utama
public class PaymentSystem {

    public static void main(String[] args) {

        // Referensi menggunakan tipe interface PaymentMethod
        PaymentMethod payment1 =
                new EWalletPayment("08123456789");

        PaymentMethod payment2 =
                new CreditCardPayment("4111-XXXX-XXXX-1234");

        // Melakukan pembayaran menggunakan E-Wallet
        payment1.pay(50000);

        // Melakukan pembayaran menggunakan kartu kredit
        payment2.pay(150000);
    }
}