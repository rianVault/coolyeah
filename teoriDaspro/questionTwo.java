import java.util.Scanner;

public class questionTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan semester: ");
    int semester = sc.nextInt();
    System.out.print("Masukkan IPK: ");
    double ipk = sc.nextFloat();
    ipk = 0.0;
    semester = 0;
    String pesan = "";

    if (semester == 1 || semester == 2) {
      if (ipk >= 2.75) {
        pesan = "Lolos Evaluasi Tahun Pertama";
      } else if (ipk < 2.75) {
        pesan = "Peringatan akademik 1";
      } else {
        pesan = "IPK tidak valid (0.00 - 4.00)";
      }
    } else if (semester >= 3 && semester <= 6) {
      if (ipk >= 3.00) {
        pesan = "Memenuhi syarat beasiswa";
      } else if (ipk < 3.00 || ipk >= 2.00) {
        pesan = "Status aman";
      } else if (ipk < 2.00) {
        pesan = "Peringatan akademik 2";
      } else {
        pesan = "IPK tidak valid (0.00 - 4.00)";
      } 
    } else if (semester == 7 || semester == 8) {
      if (ipk >= 2.75) {
        pesan = "Diizinkan mengambil tugas akhir/skripsi";
      } else if (ipk < 2.75) {
        pesan = "Wajib perbaikan nilai";
      } else {
        pesan = "IPK tidak valid (0.00 - 4.00)";
      }
    } else {
      pesan = "Semester tidak valid";
    }

    System.out.println(pesan);
  }
}
