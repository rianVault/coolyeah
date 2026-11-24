public class pengunjungCafe07 {
  static int hitungTotalBelanja(int... harga) {
    int total = 0;
    for (int h : harga) {
      total += h;
    }
    return total;
  }

  public static void main(String[] args) {
    System.out.println("Total belanja 1 item: Rp" + hitungTotalBelanja(15000));
    System.out.println("Total belanja 3 item: Rp" + hitungTotalBelanja(15000, 20000, 12000));
    System.out.println("Total belanja 5 item: Rp" + hitungTotalBelanja(15000, 20000, 22000, 12000, 10000));
  }
}