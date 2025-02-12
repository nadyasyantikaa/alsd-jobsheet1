import java.util.Scanner;

public class Tugas2MenghitungKubus {
    public static void main(String[] args) {
        int pilihan;
        Scanner scanner = new Scanner(System.in);

        do {
            // menampilkan menu
            System.out.println("\n=== KALKULATOR KUBUS ===");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.print("Masukkan pilihan Anda: ");
            pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 3) {
                System.out.print("Masukkan panjang rusuk kubus: ");
                double rusuk = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        System.out.println("Volume Kubus: " + hitungVolume(rusuk) + " satuan kubik");
                        break;
                    case 2:
                        System.out.println("Luas Permukaan Kubus: " + hitungLuasPermukaan(rusuk) + " satuan persegi");
                        break;
                    case 3:
                        System.out.println("Keliling Kubus (Total Panjang Rusuk): " + hitungKeliling(rusuk) + " satuan panjang");
                        break;
                }
            } else if (pilihan != 4) {
                System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan != 4);

        System.out.println("Terima kasih telah menggunakan program ini!");
        scanner.close();
    }

    // fungsi untuk menghitung volume kubus
    public static double hitungVolume(double rusuk) {
        return Math.pow(rusuk, 3); // rumus: V = s³
    }

    // fungsi untuk menghitung luas permukaan kubus
    public static double hitungLuasPermukaan(double rusuk) {
        return 6 * Math.pow(rusuk, 2); // rumus: A = 6 × s²
    }

    // fungsi untuk menghitung keliling kubus (total panjang rusuk kubus)
    public static double hitungKeliling(double rusuk) {
        return 12 * rusuk; // rumus: K = 12 × s
    }
    
}
