import java.util.Scanner;

public class Kafe07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan nama: ");
    String nama = sc.nextLine();
    System.out.print("Masukkan status member (y/n): ");
    String statusMentah = sc.nextLine();
    System.out.print("Masukkan jam kunjung: ");
    int jamKunjung = sc.nextInt();

    boolean status = statusMentah.equalsIgnoreCase("y");
    Menu(nama, status, jamKunjung);

    int totalHarga = 0;
    String lanjut;

    do {
      System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
      int pilihanMenu = sc.nextInt();

      if (pilihanMenu < 1 || pilihanMenu > 6) {
        System.out.println("Menu tidak tersedia");
      } else {
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc.nextInt();
        totalHarga += hitungTotalHarga07(pilihanMenu, banyakItem);
      }

      System.out.print("Apakah ingin memesan menu lain? (y/n): ");
      lanjut = sc.next();
    } while (lanjut.equalsIgnoreCase("y"));

    System.out.print("Masukkan kode promo: ");
    String kodePromo = sc.next();

    int besarDiskon = hitungDiskon(totalHarga, kodePromo, status);
    int totalBayar = totalHarga - besarDiskon;

    System.out.println("\nTotal harga: Rp" + totalHarga);
    System.out.println("Besar diskon: Rp" + besarDiskon);
    System.out.println("Total yang harus dibayar: Rp" + totalBayar);
  }

  public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {
    System.out.println("Selamat datang, " + namaPelanggan + "!");

    if (isMember) {
      System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    }

    if (jamKunjung >= 14 && jamKunjung <= 16) {
      System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
    }

    System.out.println("MENU RESTO KAFE");
    System.out.println("1. Kopi Hitam Rp15.000");
    System.out.println("2. Cappuccino Rp20.000");
    System.out.println("3. Latte Rp22.000");
    System.out.println("4. Teh Tarik Rp12.000");
    System.out.println("5. Roti Bakar Rp10.000");
    System.out.println("6. Mie Goreng Rp18.000");
    System.out.println("Silakan pilih menu yang Anda inginkan.");
  }

  public static int hitungTotalHarga07(int pilihanMenu, int banyakItem) {
    int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

    int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
    return hargaTotal;
  }

  public static int hitungDiskon(int total, String kodePromo, boolean isMember) {
    int diskon = 0;

    if (kodePromo.equals("DISKON50")) {
      diskon += (total * 50) / 100;
    } else if (kodePromo.equals("DISKON30")) {
      diskon += (total * 30) / 100;
    } else {
      System.out.println("Kode promo invalid");
    }

    if (isMember) {
      diskon += (total * 10) / 100;
    }

    return diskon;
  }
}