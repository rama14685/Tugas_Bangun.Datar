package week10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean mulaiHitung = true;

        while (mulaiHitung) {
            System.out.println("Pilih bangun datar yang mau diitung:");
            System.out.println("1. Persegi");
            System.out.println("2. Segitiga");
            System.out.println("3. Lingkaran");
            System.out.println("4. Persegi Panjang");
            System.out.println("5. Keluar");

            int pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukin sisi: ");
                    int sisi = scanner.nextInt();
                    BangunDatar persegi = new Persegi(sisi);
                    System.out.println("Luas persegi: " + persegi.luas());
                    System.out.println("Keliling persegi: " + persegi.keliling());
                    break;
                case 2:
                    System.out.print("Masukin alas: ");
                    int alas = scanner.nextInt();
                    System.out.print("Masukin tinggi: ");
                    int tinggi = scanner.nextInt();
                    BangunDatar segitiga = new Segitiga(alas, tinggi);
                    System.out.println("Luas segitiga: " + segitiga.luas());
                    System.out.println("Keliling segitiga: " + segitiga.keliling());
                    break;
                case 3:
                    System.out.print("Masukin radius: ");
                    int radius = scanner.nextInt();
                    BangunDatar lingkaran = new Lingkaran(radius);
                    System.out.println("Luas lingkaran: " + lingkaran.luas());
                    System.out.println("Keliling lingkaran: " + lingkaran.keliling());
                    break;
                case 4:
                    System.out.print("Masukin panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukin lebar: ");
                    int lebar = scanner.nextInt();
                    BangunDatar persegiPanjang = new PersegiPanjang(panjang, lebar);
                    System.out.println("Luas persegi panjang: " + persegiPanjang.luas());
                    System.out.println("Keliling persegi panjang: " + persegiPanjang.keliling());
                    break;
                case 5:
                    mulaiHitung = false;
                    System.out.println("makasih ya");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        }

        scanner.close();
    }
}
