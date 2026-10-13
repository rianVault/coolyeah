package kuisPrakDaspro;

import java.util.Scanner;

public class segitiga {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int sudut1, sudut2, sudut3, totalSudut;

    System.out.print("Masukkan sudut 1: ");
    sudut1 = sc.nextInt();
    System.out.print("Masukkan sudut 2: ");
    sudut2 = sc.nextInt();
    System.out.print("Masukkan sudut 3: ");
    sudut3 = sc.nextInt();

    totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
      if (sudut1 == 90 || sudut2 == 90 || sudut3 == 90) {
        System.out.println("Jenis segitiga -- siku-siku");
      } else if (sudut1 == sudut2 && sudut1 == sudut3 && sudut2 == sudut3 ) {
        System.out.println("Jenis segitiga -- sama sisi");
      } else {
        System.out.println("Jenis segitiga -- sama kaki");
      }
    } else {
      System.out.println("Jenis segitiga -- bukan segiga");
    }
  }
}
