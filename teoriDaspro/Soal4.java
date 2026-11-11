import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlahProduk;
        int jumlahHari;

        // Input jumlah produk (minimal 1)
        do {
            System.out.print("Masukkan jumlah produk (minimal 1): ");
            jumlahProduk = sc.nextInt();
            if (jumlahProduk < 1) {
                System.out.println("Jumlah produk minimal 1. Silakan ulangi.");
            }
        } while (jumlahProduk < 1);

        // Input jumlah hari (minimal 1)
        do {
            System.out.print("Masukkan jumlah hari (minimal 1): ");
            jumlahHari = sc.nextInt();
            if (jumlahHari < 1) {
                System.out.println("Jumlah hari minimal 1. Silakan ulangi.");
            }
        } while (jumlahHari < 1);

        int totalSeluruhProduk = 0;
        int produk = 1;

        // OUTER LOOP: while (per produk)
        while (produk <= jumlahProduk) {
            System.out.println("\n=== Produk " + produk + " ===");
            int totalProduk = 0;

            // INNER LOOP: for (per hari)
            for (int hari = 1; hari <= jumlahHari; hari++) {
                int terjual;

                // do-while: ulangi input hari tersebut jika negatif
                do {
                    System.out.print("Hari ke-" + hari + " jumlah terjual: ");
                    terjual = sc.nextInt();
                    if (terjual < 0) {
                        System.out.println("Jumlah terjual tidak boleh negatif. Ulangi input hari ke-" + hari + ".");
                    }
                } while (terjual < 0);

                totalProduk += terjual;
            }

            double rataRata = (double) totalProduk / jumlahHari;
            System.out.println("Total Produk " + produk + "      : " + totalProduk);
            System.out.printf("Rata-rata harian Produk %d : %.2f%n", produk, rataRata);

            totalSeluruhProduk += totalProduk;
            produk++;
        }

        System.out.println("\n==============================");
        System.out.println("Total seluruh produk : " + totalSeluruhProduk);

        sc.close();
    }
}