import java.util.Scanner;

public class PemesananKafe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] menu = {
            "Nasi Goreng", "Mie Goreng", "Roti Bakar", 
            "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"
        };
        int[] harga = {15000, 13000, 10000, 12000, 8000, 18000, 20000};

        System.out.println("DAFTAR MENU:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i] + " - Rp " + harga[i]);
        }
        System.out.println();

        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int jumlahItem = sc.nextInt();
        sc.nextLine();

        String[] pesananNama = new String[jumlahItem];
        int[] pesananHarga = new int[jumlahItem];
        int totalBiaya = 0;

        for (int i = 0; i < jumlahItem; i++) {
            boolean ditemukan = false;

            while (!ditemukan) {
                System.out.print("Masukkan nama menu ke-" + (i + 1) + ": ");
                String namaCari = sc.nextLine();

                for (int j = 0; j < menu.length; j++) {
                    if (menu[j].equalsIgnoreCase(namaCari)) {
                        pesananNama[i] = menu[j];
                        pesananHarga[i] = harga[j];
                        totalBiaya += harga[j];
                        ditemukan = true;
                        System.out.println("Menu " + menu[j] + " ditambahkan (Rp " + harga[j] + ")\n");
                        break;
                    }
                }

                if (!ditemukan) {
                    System.out.println("Menu \"" + namaCari + "\" tidak ada. Coba lagi.\n");
                }
            }
        }

        System.out.println("\nRINGKASAN PESANAN:");
        for (int i = 0; i < jumlahItem; i++) {
            System.out.println((i + 1) + ". " + pesananNama[i] + " : Rp " + pesananHarga[i]);
        }
        System.out.println("TOTAL BIAYA: Rp " + totalBiaya);

        sc.close();
    }
}