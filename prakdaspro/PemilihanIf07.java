import java.util.Scanner;

public class PemilihanIf07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("--- Cetak KRS SIAKAD ---");
    System.out.print("Masukkan jumlah SKS: ");
    int jumlahSks = sc.nextInt();

    if (jumlahSks > 24) {
      System.out.println("Melebihi Batas");
    } else {
      System.out.println("KRS valid");
    }
  }
}