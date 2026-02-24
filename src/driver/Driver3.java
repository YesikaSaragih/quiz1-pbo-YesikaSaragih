import java.util.Scanner;

public class Driver3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] nama = new String[100];
        String[] nim = new String[100];
        String[] asrama = new String[100];
        int[] jumlahMasuk = new int[100];
        int[] jumlahKeluar = new int[100];
        String[] status = new String[100];

        int totalOrder = 0;
        int pilih;

        do {
            System.out.println("\n=== SISTEM LAUNDRY DEL ===");
            System.out.println("1. Tambah Order");
            System.out.println("2. Set Jumlah Keluar");
            System.out.println("3. Lihat Semua Order");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = input.nextInt();
            input.nextLine();

            if (pilih == 1) {

                System.out.print("Nama    : ");
                nama[totalOrder] = input.nextLine();

                System.out.print("NIM     : ");
                nim[totalOrder] = input.nextLine();

                System.out.print("Asrama  : ");
                asrama[totalOrder] = input.nextLine();

                System.out.print("Jumlah Pakaian Masuk: ");
                jumlahMasuk[totalOrder] = input.nextInt();
                input.nextLine();

                jumlahKeluar[totalOrder] = 0;
                status[totalOrder] = "Diproses";

                totalOrder++;

                System.out.println("Order berhasil ditambahkan!");

            } else if (pilih == 2) {

                System.out.print("Masukkan nomor order (1-" + totalOrder + "): ");
                int nomor = input.nextInt() - 1;
                input.nextLine();

                if (nomor >= 0 && nomor < totalOrder) {

                    System.out.print("Jumlah Pakaian Keluar: ");
                    jumlahKeluar[nomor] = input.nextInt();
                    input.nextLine();

                    if (jumlahKeluar[nomor] == jumlahMasuk[nomor]) {
                        status[nomor] = "Selesai - Jumlah Sesuai";
                        System.out.println("✔ Jumlah sesuai.");
                    } else {
                        status[nomor] = "Error - Jumlah Tidak Sesuai";
                        System.out.println("⚠ Jumlah tidak sesuai!");
                    }

                } else {
                    System.out.println("Nomor order tidak valid!");
                }

            } else if (pilih == 3) {

                for (int i = 0; i < totalOrder; i++) {
                    System.out.println("\nOrder ke-" + (i + 1));
                    System.out.println("Nama         : " + nama[i]);
                    System.out.println("NIM          : " + nim[i]);
                    System.out.println("Asrama       : " + asrama[i]);
                    System.out.println("Jumlah Masuk : " + jumlahMasuk[i]);
                    System.out.println("Jumlah Keluar: " + jumlahKeluar[i]);
                    System.out.println("Status       : " + status[i]);
                }
            }

        } while (pilih != 0);

        System.out.println("Program selesai.");
        input.close(); 
    }
}