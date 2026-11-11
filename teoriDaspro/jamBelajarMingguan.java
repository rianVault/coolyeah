import java.util.Scanner;

public class jamBelajarMingguan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jamHarian, jamMingguan = 0;

    for (int i = 1; i <= 7; i++) {
      System.out.print("Masukkan jam hari " + i + ": ");
      jamHarian = sc.nextInt();
      if (jamHarian > 10) {
        i--;
      } else {
        jamMingguan += jamHarian;
      }
    }
    System.out.println("Jam total dalam satu minggu: " + jamMingguan);
  }
}
