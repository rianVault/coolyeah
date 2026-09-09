import java.util.Scanner;

public class GajiKaryawan07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int gajiPokok;
    double bonus, totalGaji;
    double tunjTransp = 600000;
    double tunjMkn = 400000;

    System.out.print("Masukkan gaji pokok: ");
    gajiPokok = sc.nextInt();

    bonus = 0.05 * gajiPokok;
    totalGaji = gajiPokok + tunjTransp + tunjMkn - 0.1 * gajiPokok;
    System.out.println("Bonus bulanan Anda adalah Rp" + bonus);
    int totalGaji_int = (int) totalGaji;
    System.out.println("Gaji yang diterima adalah Rp" + totalGaji_int);
  }
}