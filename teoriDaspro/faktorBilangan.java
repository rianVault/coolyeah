import java.util.Scanner;

public class faktorBilangan {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int angka, prima = 0;
    System.out.print("Masukkan angka: ");
    angka = sc.nextInt();
    
    System.out.print("Faktor bilangan dari " + angka + " adalah: ");

    for (int i = 1; i > 0; i++) {
      if (i > angka) {
        break;
      } else {
        if (angka % i == 0) {
          System.out.print(i + " ");
          prima++;
        }
      }
    }

    if (prima == 2) {
      System.out.println("\nBilangan prima");
    } else {
      System.out.println("\nBilangan bukan prima");
    }
  }
}
