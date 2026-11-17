import java.util.Scanner;

public class BioskopWithScanner07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int baris, kolom;
    String nama, pilihan;
    String[][] penonton = new String[4][2];

    while (true) {
      System.out.print("Masukkan nama: ");
      nama = sc.nextLine();
      System.out.print("Masukkan baris: ");
      baris = sc.nextInt();
      System.out.print("Masukkan kolom: ");
      kolom = sc.nextInt();
      sc.nextLine();

      if (baris > penonton.length || kolom > penonton[1].length) {
        System.err.println("Melebihi batas baris dan kolom yang sudah ditentukan lmao sigma mewing");
        continue;
      } else if (penonton[baris - 1][kolom - 1] != null) {
        System.out.println("Kursi sudah terisi oleh " + penonton[baris - 1][kolom - 1] + "! Silakan pilih baris dan kolom lain");
      }

      penonton[baris - 1][kolom - 1] = nama;

      System.out.print("Input penonton lainnya? (y/n): ");
      pilihan = sc.nextLine();

      if (pilihan.equalsIgnoreCase("n")) {
        break;
      }
    }

    for (int i = 0; i < penonton.length; i++) {
      for (int j = 0; j < penonton[i].length; j++) {
        System.out.println("Penonton baris " + i + " kolom " + j + ": " + penonton[i][j]);
        if (penonton[i][j] == null) {
          System.out.print("***");
        }
      }
    }
  }
}
