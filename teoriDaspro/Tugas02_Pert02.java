package teoriDaspro;

import java.util.Scanner;

public class Tugas02_Pert02 {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int panjangTanah, lebarTanah, luasKolamPersegi, sisiKolamPersegi = 2;
      double phi = 3.14, totalSisaLuasTanah, luasKolamLingkaran, diameterKolamLingkaran = 5, jariJariLingkaran;

      System.out.printf("Masukkan total panjang tanah: ");
      panjangTanah = input.nextInt();
      System.out.printf("Masukkan total lebar tanah: ");
      lebarTanah = input.nextInt();

      jariJariLingkaran = diameterKolamLingkaran / 2;
      luasKolamLingkaran = phi * jariJariLingkaran * jariJariLingkaran;
      luasKolamPersegi = sisiKolamPersegi * sisiKolamPersegi;
      totalSisaLuasTanah = ((panjangTanah * lebarTanah) - (luasKolamLingkaran + luasKolamPersegi));

      System.out.println("Total sisa luas tanah Anda: " + totalSisaLuasTanah);
  }
}