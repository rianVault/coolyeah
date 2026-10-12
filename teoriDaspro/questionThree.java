import java.util.Scanner;

public class questionThree {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan status kartu (A/X): ");
    String status = sc.nextLine();
    System.out.print("Masukkan PIN: ");
    int pin = sc.nextInt();
    System.out.print("Masukkan suhu ruangan: ");
    double suhu = sc.nextDouble();
    pin = 0000;
    suhu = 0.00;
    String pesan = "";

    if (status.equals("A")) {
      if (pin == 4829) {
        if (suhu <= 28.0) {
          pesan = "Akses diterima: pintu terbuka, AC normal";
        } else {
          pesan = "Akses diterima: pintu terbuka, harap nyalakan pendingin tambahan";
        }
      } else {
        pesan = "Akses ditolak: PIN salah";
      }
    } else {
      pesan = "Akses ditolak: Kartu tidak aktif/diblokir";
    }

    System.out.println(pesan);
  }
}
