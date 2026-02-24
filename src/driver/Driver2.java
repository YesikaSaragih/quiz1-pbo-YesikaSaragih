import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah data (N): ");
        int N = input.nextInt();
        input.nextLine();

        String[] nama = new String[N];
        int[] nilai = new int[N];
        char[] kelompok = new char[N];

        for (int i = 0; i < N; i++) {
            System.out.print("\nMasukkan nama: ");
            nama[i] = input.nextLine();

            System.out.print("Masukkan nilai: ");
            nilai[i] = input.nextInt();

            System.out.print("Masukkan kelompok (L/P): ");
            kelompok[i] = input.next().charAt(0);

            input.nextLine();
        }

        System.out.print("\nMasukkan kelompok yang ingin dihitung (L/P): ");
        char pilih = input.next().charAt(0);

        int total = 0;

        for (int i = 0; i < N; i++) {
            if (Character.toUpperCase(kelompok[i]) == Character.toUpperCase(pilih)) {
                total += nilai[i];
            }
        }

        System.out.println("\nTotal nilai kelompok " + Character.toUpperCase(pilih) + " = " + total);

        input.close();
    }
}

