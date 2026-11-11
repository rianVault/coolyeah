public class task2 {
  public static void main(String[] args) {
    char huruf = 'a';

    for (int i = 1; i <= 5; i++) {
      for (int j = 5; j > i; j--) {
        System.out.print(" ");
      }
      int bilanganGanjil = i * 2 - 1;
      for (int k = 1; k <= bilanganGanjil; k++) {
        System.out.print(huruf++);
      }
      System.out.println("");
    }
  }
}
