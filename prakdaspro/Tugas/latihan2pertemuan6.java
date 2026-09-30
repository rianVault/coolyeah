import java.util.Scanner;

public class latihan2pertemuan6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double diskonBuku = 0;

    System.out.print("Masukkan buku yang ingin dibeli: ");
    String bukuYangDibeli = sc.nextLine();
    System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
    int jumlahBuku = sc.nextInt();
    
    if (bukuYangDibeli.equals("kamus")) {
      if (jumlahBuku > 2) {
        diskonBuku = 0.12;
      } else {
        diskonBuku = 0.1;
      }
    } else if (bukuYangDibeli.equals("novel")) {
      if (jumlahBuku > 3) {
        diskonBuku = 0.09;
      } else if (jumlahBuku <= 3) {
        diskonBuku = 0.08;
      } else {
        diskonBuku = 0.07;
      }
    } else {
      if (jumlahBuku > 3) {
        diskonBuku = 0.05;
      }
    }

    System.out.println("Diskon yang Anda dapat: " + diskonBuku);
  }  
}