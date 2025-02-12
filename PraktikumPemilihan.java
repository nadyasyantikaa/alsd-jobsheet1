import java.util.Scanner;

public class PraktikumPemilihan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        
        // input nilai mahasiswa
        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = input.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = input.nextDouble();
        
        System.out.println("================================");
        System.out.println("================================");
        
        // validasi rentang nilai dengan batas (0 - 100)
        if (tugas < 0 || tugas > 100 || kuis < 0 || kuis > 100 || uts < 0 || uts > 100 || uas < 0 || uas > 100) {
            System.out.println("nilai tidak valid");
            System.out.println("================================");
            System.out.println("================================");
        } else {
            // hitungan nilai akhir
            double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
            String nilaiHuruf;

            // konversi nilai ke huruf
            if (nilaiAkhir >= 80) {
                nilaiHuruf = "A";
            } else if (nilaiAkhir >= 73) {
                nilaiHuruf = "B+";
            } else if (nilaiAkhir >= 65) {
                nilaiHuruf = "B";
            } else if (nilaiAkhir >= 60) {
                nilaiHuruf = "C+";
            } else if (nilaiAkhir >= 50) {
                nilaiHuruf = "C";
            } else if (nilaiAkhir >= 39) {
                nilaiHuruf = "D";
            } else {
                nilaiHuruf = "E";
            }

            // output 
            System.out.printf("nilai akhir : %.1f\n", nilaiAkhir);
            System.out.println("Nilai Huruf : " + nilaiHuruf);
            System.out.println("================================");
            System.out.println("================================");

            // cek status kelulusan
            if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") || nilaiHuruf.equals("C+")) {
                System.out.println("SELAMAT ANDA LULUS");
            }
        }
        
        input.close();
    }
}