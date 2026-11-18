import java.util.Scanner;

public class kuisLagi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Masukkan n: ");
    int n = sc.nextInt();
    System.out.print("Masukkan m: ");
    int m = sc.nextInt();

    int pangkat = 1;

    for (int i = 1; i <= m; i++) {
      pangkat *= n;
    }
    System.err.println(pangkat);
  }
}