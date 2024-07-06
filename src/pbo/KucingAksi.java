package pbo;
import java.util.Scanner;

public class KucingAksi {
    public static void main(String[] args) {
        // io sederhana
        try {
            Scanner scanner = new Scanner(System.in);

            // array
            DetailKucing[] kucing = new DetailKucing[2];

            for (int i = 0; i < kucing.length; i++) {
                System.out.print("Masukkan nama kucing " + (i + 1) + ": ");
                String nama = scanner.nextLine();
                System.out.print("Masukkan jenis kucing " + (i + 1) + ": ");
                String jenis = scanner.nextLine();
                System.out.print("Masukkan warna kucing " + (i + 1) + ": ");
                String warna = scanner.nextLine();
                System.out.print("Masukkan umur kucing " + (i + 1) + ": ");
                int umur = Integer.parseInt(scanner.nextLine());

                // objek
                kucing[i] = new DetailKucing(nama, jenis, warna, umur);
            }

            for (DetailKucing data : kucing) {
                System.out.println("============");
                System.out.println("Detail Kucing: ");
                System.out.println(data.tampilkanInfo());
            }
        } catch (NumberFormatException e) {
            System.out.println("Kesalahan format nomor: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan umum: " + e.getMessage());
        }
    }
}
