import java.util.Scanner;

public class gajiKaryawanLoop {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int gajiHarian = 0, jamKerjaHarian;

    for (int i = 1; i > 0; i++) {
      System.out.print("Masukkan jam kerja harian Anda: ");
      jamKerjaHarian = sc.nextInt();
      System.out.print("Masukkan gaji harian Anda: ");
      gajiHarian = sc.nextInt();
      if (jamKerjaHarian > 8) {
        gajiHarian += (gajiHarian * 8 / 100);
      } else if (jamKerjaHarian < 0) {
        break;
      }
      System.out.println("Total gaji Anda pada hari " + i + ": " + gajiHarian);
      System.out.println("=============================================");
    }
  }
}
