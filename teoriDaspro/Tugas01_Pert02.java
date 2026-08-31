package teoriDaspro;
import java.util.Scanner;

public class Tugas01_Pert02 {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      int gajiPokok, jumlahAnak, totalTunjanganAnak, gajiKotor, tunjanganPerAnak = 100000;
      double persentasePotonganPensiun = 0.1, hitungPotonganPensiun, gajiBersih;

      System.out.print("Masukkan gaji pokok Anda: ");
      gajiPokok = input.nextInt();
      System.out.print("Masukkan jumlah anak Anda: ");
      jumlahAnak = input.nextInt();

      totalTunjanganAnak = jumlahAnak * tunjanganPerAnak;
      hitungPotonganPensiun = gajiPokok * persentasePotonganPensiun;
      gajiKotor = gajiPokok + totalTunjanganAnak;
      gajiBersih = gajiKotor - hitungPotonganPensiun;

      System.out.println("Gaji bersih Anda: " + gajiBersih);
    }
}
