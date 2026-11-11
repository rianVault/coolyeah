import java.util.Scanner;

public class PengelolaanNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyak nilai mahasiswa: ");
        int banyakNilai = sc.nextInt();
        int[] nilai = new int[banyakNilai];

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
        }

        int total = 0;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 0; i < nilai.length; i++) {
            total += nilai[i];

            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        double rataRata = (double) total / banyakNilai;

        System.out.println("\nNilai Rata-rata: " + rataRata);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah : " + terendah);
        System.out.println("\nDaftar Nilai dan Status:");

        for (int i = 0; i < nilai.length; i++) {
            String status = (nilai[i] >= 60) ? "LULUS" : "TIDAK LULUS";
            System.out.println((i + 1) + ". Nilai: " + nilai[i] + " | Status: " + status);
        }

        sc.close();
    }
}