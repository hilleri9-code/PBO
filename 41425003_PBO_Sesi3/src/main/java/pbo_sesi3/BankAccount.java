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

public class BankAccount {

    // Menyimpan nomor rekening secara private
    private String accountNumber;

    // Menyimpan saldo rekening secara private
    private double balance;

    // Constructor untuk membuat rekening baru
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;

        // Memastikan saldo awal tidak negatif
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Saldo awal tidak boleh negatif! Diatur ke 0.");
            this.balance = 0;
        }
    }

    // Getter untuk mendapatkan nomor rekening
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter untuk mendapatkan saldo
    public double getBalance() {
        return balance;
    }

    // Method untuk melakukan setor tunai
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Setor berhasil: Rp" + amount);
        } else {
            System.out.println("Jumlah setoran harus lebih besar dari 0!");
        }
    }

    // Method untuk melakukan penarikan tunai
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Jumlah penarikan tidak valid!");
        } else if (amount > this.balance) {
            System.out.println("Penarikan gagal: Saldo tidak mencukupi!");
        } else {
            this.balance -= amount;
            System.out.println("Tarik tunai berhasil: Rp" + amount);
        }
    }

    // Method utama untuk menjalankan program
    public static void main(String[] args) {

        // Membuat objek rekening dengan saldo awal Rp500.000
        BankAccount acc = new BankAccount("ACC-001", 500000);

        // Mencoba melakukan setoran negatif
        acc.deposit(-100000);

        // Mencoba menarik uang lebih besar dari saldo
        acc.withdraw(700000);

        // Melakukan penarikan yang valid
        acc.withdraw(200000);

        // Menampilkan saldo akhir rekening
        System.out.println(
            "Saldo akhir akun " + acc.getAccountNumber()
            + ": Rp" + acc.getBalance()
        );
    }
}
