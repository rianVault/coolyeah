import java.util.Scanner;

public class ArrayNilai07 {
  public static void main(String[] args) {
    int[] nilaiAkhhir = new int[10];
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < nilaiAkhhir.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
      nilaiAkhhir[i] = sc.nextInt();
    }

    int lulus = 0;
    for (int i = 0; i < nilaiAkhhir.length; i++) {
      String status = (nilaiAkhhir[i] > 70) ? "LULUS" : "TIDAK LULUS";
      if (nilaiAkhhir[i] > 70) {
        System.out.println("Mahasiswa ke-" + (i + 1) + ": " + nilaiAkhhir[i] + " (" + status + ")");
        lulus++;
      }
    }
    System.out.println("Mahasiswa lulus: " + lulus);
    System.out.println("Mahasiswa tidak lulus: " + (nilaiAkhhir.length - lulus));
  }
}
