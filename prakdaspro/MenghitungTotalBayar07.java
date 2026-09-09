import java.util.Scanner;

public class MenghitungTotalBayar07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int harga;
    double potongan;
    double jml_bayar;
    double diskon = 0.15;

    System.out.print("Masukkan harga: ");
    harga = sc.nextInt();
    
    potongan = diskon * harga;
    jml_bayar = harga - potongan;
    int jml_bayar_int = (int) jml_bayar;
    System.out.println("Jumlah yang harus Anda bayar adalah Rp" + jml_bayar_int);
  }
}