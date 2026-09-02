public class ContohTipeData07 {
  public static void main(String[] args) {
    char golonganDarah = 'A';
    byte jarak = (byte) 130;
    short jumlahPendudukDalamSetahun = 1025;
    float suhu = 60.50F;
    double berat = 0.5467812345;
    long saldo = 150000000;
    int angkaDesimal = 0x10;

    System.err.println("Golongan darah\t\t\t\t\t\t\t: " + (byte) golonganDarah);
    System.err.println("Jarak\t\t\t\t\t\t\t\t: " + jarak);
    System.err.println("Jumlah penduduk dalam satu dusun\t\t\t\t: " + jumlahPendudukDalamSetahun);
    System.err.println("Suhu\t\t\t\t\t\t\t\t: " + suhu);
    System.err.println("Berat\t\t\t\t\t\t\t\t: " + (float) berat);
    System.err.println("Saldo\t\t\t\t\t\t\t\t: " + saldo);
    System.err.println("Angka desimal\t\t\t\t\t\t\t: " + angkaDesimal);
  }
}
