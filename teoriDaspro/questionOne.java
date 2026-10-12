import java.util.Scanner;

public class questionOne {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan kelas (ekonomi/eksekutif): ");
    String kelas = sc.nextLine();
    System.out.println("Masukkan usia: ");
    int usia = sc.nextInt();
    int biaya = 0;

    if (kelas.equalsIgnoreCase("ekonomi")) {
      if (usia > 0 || usia < 12) {
        biaya = 30000;
      } else if (usia >= 12 || usia <= 60) {
        biaya = 50000;
      } else if (usia > 60) {
        biaya = 35000;
      } else {
        System.out.println("Usia harus benar!");
      }
    } else if (kelas.equalsIgnoreCase("eksekutif")) {
      if (usia > 0 || usia < 12) {
        biaya = 80000;
      } else if (usia >= 12 || usia <= 60) {
        biaya = 120000;
      } else if (usia > 60) {
        biaya = 90000;
      } else {
        System.out.println("Usia harus benar!");
      }
    } else {
      System.out.println("Kelas tidak tersedia, masukkan dengan benar untuk mengetahui biaya Anda secara tepat!");
    }

    System.out.println("Biaya Anda adalah Rp" + biaya);
    sc.close();
  }
}