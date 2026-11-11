import java.util.Scanner;

public class SearchNilai {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan banyak nilai: ");
    int banyakNilai = sc.nextInt();
    int[] nilai = new int[banyakNilai];

    for (int i = 0; i < nilai.length; i++) {
      System.out.print("Masukkan nilai data indeks ke-" + i);
      int dataNilai = sc.nextInt();
      nilai[i] = dataNilai;
    }

    System.out.print("Masukkan nilai yang ingin dicari: ");
    int key = sc.nextInt();
    boolean ditemukan = false;

    for (int i = 0; i < nilai.length; i++) {
      if (nilai[i] == key) {
        System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + i);
        ditemukan = true;
        break;
      }
    }

    if (!ditemukan) {
      System.out.println("Nilai '" + key + "' tidak ditemukan.");
    }
  }
}
