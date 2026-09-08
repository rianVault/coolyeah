package Tugas;

import java.util.Scanner;

public class studiKasus1_Pertemuan3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int hargaLaptop, uangMuka, lamaMencicil, sisaHutang;
    double persentaseBunga = 0.02, bungaPerbulan, jumlahCicilanPerBulan;

    System.out.print("Masukkan harga laptop: ");
    hargaLaptop = sc.nextInt();
    System.out.print("Masukkan jumlah uang muka: ");
    uangMuka = sc.nextInt();
    System.out.print("Masukkan lama waktu mencicil (bulan): ");
    lamaMencicil = sc.nextInt();

    sisaHutang = hargaLaptop - uangMuka;
    bungaPerbulan = sisaHutang * persentaseBunga;
    jumlahCicilanPerBulan = (sisaHutang / lamaMencicil) + bungaPerbulan;
    System.out.println("Jumlah cicilan per bulan yang harus Anda bayar: Rp" + jumlahCicilanPerBulan);
  }
}
