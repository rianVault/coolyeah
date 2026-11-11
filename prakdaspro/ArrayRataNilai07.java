import java.util.Scanner;

public class ArrayRataNilai07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Masukkan banyak mahasiswa: ");
    int mahasiswa = sc.nextInt();
    int[] nilaiMhs = new int[mahasiswa];
    int total = 0;
    double rata2;

    for (int i = 0; i < nilaiMhs.length; i++) {
      System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
      nilaiMhs[i] = sc.nextInt();
      total += nilaiMhs[i];
    }

    rata2 = total / nilaiMhs.length;
    System.out.println("Total nilai: " + total);
    System.out.println("Rata-rata: " + rata2);

    int tertinggi = nilaiMhs[0];
    int terendah = nilaiMhs[0];
    int lulus = 0;
    for (int i = 0; i < nilaiMhs.length; i++) {
      if (nilaiMhs[i] > tertinggi) {
        tertinggi = nilaiMhs[i];
      }
      if (nilaiMhs[i] < terendah) {
        terendah = nilaiMhs[i];
      }
      if (nilaiMhs[i] > 70) {
        lulus++;
      }
    }

    System.out.println("Nilai tertinggi: " + tertinggi);
    System.out.println("Nilai terendah: " + terendah);
    System.out.println("Mahasiswa yang lulus: " + lulus);

    if (rata2 >= 85) {
      System.err.println("Predikat kelas: SANGAT BAIK");
    } else if (rata2 >= 70) {
      System.err.println("Predikat kelas: BAIK");
    } else {
      System.err.println("Predikat kelas: PERLU PENDAMPINGAN");
    }
  }
}
