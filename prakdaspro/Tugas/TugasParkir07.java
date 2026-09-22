package Tugas;

import java.util.Scanner;

public class TugasParkir07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan lama parkir (jam): ");
    int jamParkir = sc.nextInt();

    if (jamParkir == 2) {
      System.out.println("Total biaya Anda: Rp" + 2000);
    } else {
      System.out.println("Total biaya Anda: Rp" + ((jamParkir - 2) * 1000 + 2000));
    }
  }
}
