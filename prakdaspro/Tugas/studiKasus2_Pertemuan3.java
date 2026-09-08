package Tugas;

import java.util.Scanner;

public class studiKasus2_Pertemuan3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int banyakLembar, hargaPerLembar = 500, hargaPenjilidan = 5000, totalHargaCetak, totalHargaBayar;

    System.out.print("Masukkan banyak lembar: ");
    banyakLembar = sc.nextInt();

    totalHargaCetak = banyakLembar * hargaPerLembar;
    totalHargaBayar = totalHargaCetak + hargaPenjilidan;
    System.out.println("Total yang harus Anda bayarkan: Rp" + totalHargaBayar);
  }
}