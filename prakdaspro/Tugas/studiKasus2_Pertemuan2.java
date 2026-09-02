package Tugas;

import java.util.Scanner;

public class studiKasus2_Pertemuan2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

      int panjangTanah, lebarTanah, luasKolamPersegi, sisiKolamPersegi;
      double pi = 3.14, totalSisaLuasTanah, luasKolamLingkaran, diameterKolamLingkaran, jariJariLingkaran;

      System.out.printf("Masukkan total panjang tanah: ");
      panjangTanah = input.nextInt();
      System.out.printf("Masukkan total lebar tanah: ");
      lebarTanah = input.nextInt();
      System.out.printf("Masukkan sisi kolam persegi: ");
      sisiKolamPersegi = input.nextInt();
      System.out.printf("Masukkan diameter kolam lingkaran: ");
      diameterKolamLingkaran = input.nextInt();
      

      jariJariLingkaran = diameterKolamLingkaran / 2;
      luasKolamLingkaran = pi * jariJariLingkaran * jariJariLingkaran;
      luasKolamPersegi = sisiKolamPersegi * sisiKolamPersegi;
      totalSisaLuasTanah = ((panjangTanah * lebarTanah) - (luasKolamLingkaran + luasKolamPersegi));

      System.out.println("Total sisa luas tanah Anda: " + totalSisaLuasTanah);
  }
}
