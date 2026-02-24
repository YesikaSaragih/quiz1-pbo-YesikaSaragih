import java.util.Scanner;

public class Driver1{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] kodeMenu = {"NGS","AP","SA","BU","MAP","GG","SAM","RD","IB","NUK"};
        String[] namaMenu = {
            "Nasi Goreng Special",
            "Ayam Penyet",
            "Sate Ayam",
            "Bakso Urat",
            "Mie Ayam Pangsit",
            "Gado-Gado",
            "Soto Ayam",
            "Rendang Daging",
            "Ikan Bakar",
            "Nasi Uduk Komplit"
        };

        int[] hargaMenu = {
            25000,20000,22000,18000,17000,
            15000,19000,30000,28000,23000
        };

        // Data pembeli
        String ucok = "Ucok";
        int beratUcok = 100;

        String butet = "Butet";
        int beratButet = 50;

        // Rasio berat
        int rasio = beratUcok / beratButet; // 2

        System.out.println("===== MENU RESTORAN =====");
        for (int i = 0; i < kodeMenu.length; i++) {
            System.out.println(kodeMenu[i] + " | " +
                    namaMenu[i] + " | Rp " + hargaMenu[i]);
        }

        System.out.print("\nButet pilih kode menu: ");
        String pilihKode = input.next().toUpperCase();

        System.out.print("Butet beli berapa porsi? ");
        int jumlahButet = input.nextInt();

        for (int i = 0; i < kodeMenu.length; i++) {

            if (pilihKode.equals(kodeMenu[i])) {

                int jumlahUcok = jumlahButet * rasio;

                double totalButet = hargaMenu[i] * jumlahButet;
                double totalUcok = hargaMenu[i] * jumlahUcok;

                double diskonButet = hitungDiskon(totalButet);
                double diskonUcok = hitungDiskon(totalUcok);

                System.out.println("\n===== STRUK PEMBELIAN =====");

                System.out.println("\nPembeli : " + butet);
                System.out.println("Jumlah  : " + jumlahButet);
                System.out.println("Total   : Rp " + totalButet);
                System.out.println("Diskon  : Rp " + diskonButet);
                System.out.println("Bayar   : Rp " + (totalButet - diskonButet));

                System.out.println("\nPembeli : " + ucok);
                System.out.println("Jumlah  : " + jumlahUcok);
                System.out.println("Total   : Rp " + totalUcok);
                System.out.println("Diskon  : Rp " + diskonUcok);
                System.out.println("Bayar   : Rp " + (totalUcok - diskonUcok));

                break;
            }
        }

        input.close();
    }

    // Method diskon otomatis
    public static double hitungDiskon(double total) {
        if (total >= 500000) return total * 0.25;
        else if (total >= 400000) return total * 0.20;
        else if (total >= 300000) return total * 0.15;
        else if (total >= 200000) return total * 0.10;
        else if (total >= 100000) return total * 0.05;
        else return 0;
    }
}
