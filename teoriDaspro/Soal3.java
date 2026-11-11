public class Soal3 {
  public static void main(String[] args) {
    for (int i = 1; i <= 5; i++) {
      int total = 0;
      System.out.print("n = " + i + " -> jumlah kuadrat = ");
      for (int j = 1; j <= i; j++) {
        total += (j * j);
        System.out.print(" + ");
        System.out.print(j * j);
      }
      System.out.println(" = " + total);
    }
  }
}