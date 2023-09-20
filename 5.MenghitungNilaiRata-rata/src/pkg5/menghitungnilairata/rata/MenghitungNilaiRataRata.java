/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.menghitungnilairata.rata;
import java.util.Scanner;

public class MenghitungNilaiRataRata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            int total = 0;
            int jumlahAngka = 0;

            System.out.println("Masukkan serangkaian angka (0 untuk selesai):");

            while (true) {
                try {
                    System.out.print("Masukkan angka: ");
                    int angka = input.nextInt();

                    if (angka == 0) {
                        break; // Keluar dari loop input
                    }

                    total += angka;
                    jumlahAngka++;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Input tidak valid. Masukkan angka bulat.");
                    input.nextLine(); // Membersihkan buffer input
                }
            }

            if (jumlahAngka > 0) {
                double rataRata = (double) total / jumlahAngka;
                System.out.println("Nilai rata-rata: " + rataRata);
            } else {
                System.out.println("Tidak ada angka yang dimasukkan.");
            }

            // Meminta pengguna apakah ingin melanjutkan atau keluar
            System.out.print("Apakah Anda ingin menghitung rata-rata lagi? (y/n): ");
            String jawaban = input.next();

            if (!jawaban.equalsIgnoreCase("y")) {
                System.out.println("Terima kasih! Program berakhir.");
                break; // Keluar dari loop utama
            }
        }

        input.close();
    }
}
