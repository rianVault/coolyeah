import java.util.Scanner;

public class tugas2SeleksiAsisten07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean mahasiswaAktif, mendapatSanksiAkademik, sertifikatKompetensi;
    int nilaiDaspro, nilaiWawancara;

    System.out.print("Apakah mahasiswa aktif? (true/false): ");
    mahasiswaAktif = sc.nextBoolean();
    System.out.print("Apakah memiliki sanksi akademik? (true/false): ");
    mendapatSanksiAkademik = sc.nextBoolean();
    System.out.print("Masukkan nilai Dasar Pemrograman Anda: ");
    nilaiDaspro = sc.nextInt();
    System.out.print("Apakah memiliki sertifikat kompetensi pemrograman? (true/false): ");
    sertifikatKompetensi = sc.nextBoolean();
    System.out.print("Masukkan nilai wawancara Anda: ");
    nilaiWawancara = sc.nextInt();

    if (mahasiswaAktif && !mendapatSanksiAkademik) {
      if (nilaiDaspro >= 80 || sertifikatKompetensi) {
        if (nilaiWawancara >= 75) {
          System.out.println("Selamat Anda diterima sebagai asisten praktikum");
        } else {
          System.out.println("Gagal: nilai wawancara Anda tidak mencukupi");
        }
      } else {
        System.out.println("Gagal: nilai Daspro Anda kurang dari 80 dan Anda tidak memilik sertifikat kompetensi");
      }
    } else {
      System.out.println("Gagal: Anda bukan mahasiswa aktif atau Anda mendapat sanksi Akademik");
    }
  }
}