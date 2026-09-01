import java.util.Scanner;

public class Bank07 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int jml_tabungan_awal, lama_menabung;
    double persentase_bunga = 0.02, bunga, jml_tabungan_akhir;

    System.out.print("Masukkan jumlah tabungan awal Anda: ");
    jml_tabungan_awal = input.nextInt();
    System.out.print("Masukkan lama menabung Anda: ");
    lama_menabung = input.nextInt();

    bunga = lama_menabung * persentase_bunga * jml_tabungan_awal;
    jml_tabungan_akhir = bunga + jml_tabungan_awal;

    System.out.println("Bunga adalah " + bunga);
    System.out.println("Jumlah tabungan akhir Anda adalah " + jml_tabungan_akhir);
  }
}