public class ContohVariabel07 {
  public static void main(String[] args) {
    String salahSAtuHobySayaAdalah = "Bermain petak umpet";
    boolean isPandai = true;
    char jenisKelamin = 'L';
    byte _umurSayaSekarang = 20;
    double $ipk = 3.24, tinggi = 1.78;
    
    System.err.println(salahSAtuHobySayaAdalah);
    System.err.println("Apakah pandai? " + isPandai);
    System.err.println("Jenis kelamin: " + jenisKelamin);
    System.err.println("Umurku saat ini: " + _umurSayaSekarang);
    System.err.println(String.format("Saya beripk %s, dengan tinggi badan %s", $ipk, tinggi));
  }
}
