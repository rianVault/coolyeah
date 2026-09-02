package Tugas;

import java.util.Scanner;

public class studiKasus1_Pertemuan2Modified {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int gajiPokok, jumlahAnak, totalTunjanganAnak, gajiKotor, tunjanganPerAnak;
    double persentasePotonganPensiun = 0.1, hitungPotonganPensiun, gajiBersih;

    System.out.print("Masukkan gaji pokok Anda: ");
    gajiPokok = input.nextInt();
    System.out.print("Masukkan tunjangan per anak per satu bulan: ");
    tunjanganPerAnak = input.nextInt();
    System.out.print("Masukkan jumlah anak Anda: ");
    jumlahAnak = input.nextInt();

    totalTunjanganAnak = jumlahAnak * tunjanganPerAnak;
    hitungPotonganPensiun = gajiPokok * persentasePotonganPensiun;
    gajiKotor = gajiPokok + totalTunjanganAnak;
    gajiBersih = gajiKotor - hitungPotonganPensiun;

    System.out.println("Gaji bersih Anda: " + gajiBersih);
  }
}