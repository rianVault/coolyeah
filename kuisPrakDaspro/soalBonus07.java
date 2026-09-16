package kuisPrakDaspro;

import java.util.Scanner;

public class soalBonus07 {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan detik: ");
    int detik = sc.nextInt();

    int jam = detik / 3600;
    int sisaDetik = detik % 3600;
    int menit = sisaDetik / 60;
    sisaDetik = sisaDetik % 60;
    System.out.println(jam + " jam " + menit + " menit " + sisaDetik + " detik");
  }
}
