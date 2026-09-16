package kuisPrakDaspro;

import java.util.Scanner;

public class KeramikLantai07 {
  public static void main(String[] args) {
    System.out.println("========================= HITUNG KEBUTUHAN KERAMIK=========================");
    int panjangRuangan, lebarRuangan, hargaSatuKeramik = 45000, luasRuangan, totalBiayaBelanja;
    double sisiKeramik = 0.6, luasSatuKeramik,  totalKeramikMinimum, totalKeramikAkhir;

    Scanner sc = new Scanner(System.in);
    
    System.out.print("Masukkan panjang ruangan (meter): ");
    panjangRuangan = sc.nextInt();
    System.out.print("Masukkan lebar ruangan (meter): ");
    lebarRuangan = sc.nextInt();

    luasSatuKeramik = sisiKeramik * sisiKeramik;
    luasRuangan = panjangRuangan * lebarRuangan;

    totalKeramikMinimum = luasRuangan / luasSatuKeramik;
    
    totalKeramikAkhir = totalKeramikMinimum + (totalKeramikMinimum * 0.1);
    
    totalBiayaBelanja = (int) (hargaSatuKeramik * totalKeramikAkhir);

    System.out.println("Total biaya belanja Anda yaitu: Rp" + totalBiayaBelanja);
  }
}
