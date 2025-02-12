import java.util.Scanner;

public class Tugas3MataKuliah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input jumlah mata kuliah n
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        // deklarasi array untuk menyimpan data mata kuliah
        String[] namaMatkul = new String[n];
        int[] sks = new int[n];
        int[] semester = new int[n];
        String[] hariKuliah = new String[n];

        // input data mata kuliah dari pengguna
        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMatkul[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sks[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semester[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariKuliah[i] = scanner.nextLine();
        }

        int pilihan;
        do {
            // menampilkan menu
            System.out.println("\n=== MENU JADWAL KULIAH ===");
            System.out.println("1. Tampilkan Semua Jadwal Kuliah");
            System.out.println("2. Tampilkan Jadwal Berdasarkan Hari");
            System.out.println("3. Tampilkan Jadwal Berdasarkan Semester");
            System.out.println("4. Cari Mata Kuliah");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanSemuaJadwal(namaMatkul, sks, semester, hariKuliah);
                    break;
                case 2:
                    System.out.print("Masukkan hari kuliah yang ingin ditampilkan: ");
                    String hari = scanner.nextLine();
                    tampilkanJadwalHari(namaMatkul, sks, semester, hariKuliah, hari);
                    break;
                case 3:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int sem = scanner.nextInt();
                    tampilkanJadwalSemester(namaMatkul, sks, semester, hariKuliah, sem);
                    break;
                case 4:
                    System.out.print("Masukkan nama mata kuliah yang ingin dicari: ");
                    String namaCari = scanner.nextLine();
                    cariMataKuliah(namaMatkul, sks, semester, hariKuliah, namaCari);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi!");
            }
        } while (pilihan != 5);

        scanner.close();
    }

    // fungsi menampilkan semua jadwal kuliah
    public static void tampilkanSemuaJadwal(String[] nama, int[] sks, int[] semester, String[] hari) {
        System.out.println("\n=== JADWAL KULIAH ===");
        System.out.printf("%-20s %-5s %-10s %-10s\n", "Mata Kuliah", "SKS", "Semester", "Hari");
        System.out.println("------------------------------------------------");
        for (int i = 0; i < nama.length; i++) {
            System.out.printf("%-20s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
        }
    }

    // fungsi menampilkan jadwal berdasarkan hari tertentu
    public static void tampilkanJadwalHari(String[] nama, int[] sks, int[] semester, String[] hari, String hariCari) {
        System.out.println("\n=== JADWAL KULIAH HARI " + hariCari.toUpperCase() + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (hari[i].equalsIgnoreCase(hariCari)) {
                System.out.printf("%-20s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di hari " + hariCari);
        }
    }

    // fungsi menampilkan jadwal berdasarkan semester 
    public static void tampilkanJadwalSemester(String[] nama, int[] sks, int[] semester, String[] hari, int semesterCari) {
        System.out.println("\n=== JADWAL KULIAH SEMESTER " + semesterCari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (semester[i] == semesterCari) {
                System.out.printf("%-20s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah di semester " + semesterCari);
        }
    }

    // fungsi mencari mata kuliah berdasarkan nama
    public static void cariMataKuliah(String[] nama, int[] sks, int[] semester, String[] hari, String namaCari) {
        System.out.println("\n=== PENCARIAN MATA KULIAH: " + namaCari + " ===");
        boolean ditemukan = false;
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].equalsIgnoreCase(namaCari)) {
                System.out.printf("%-20s %-5d %-10d %-10s\n", nama[i], sks[i], semester[i], hari[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Mata kuliah " + namaCari + " tidak ditemukan.");
        }
    }
}
