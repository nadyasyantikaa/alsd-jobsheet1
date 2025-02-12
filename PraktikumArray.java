import java.util.Scanner;

public class PraktikumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==============================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("==============================");


        System.out.print("Jumlah Mata Kuliah: ");
        int matkul = sc.nextInt();
        sc.nextLine();

        // deklarasi array untuk simpan data mata kuliah
        String MatKul[] = new String[matkul];
        double NilaiAngka[] = new double[matkul];
        String NilaiHuruf[] = new String[matkul];
        double BobotNilai[] = new double[matkul];
        int BobotSKS[] = new int[matkul];
        double TotalNilai = 0;
        int SKS = 0;

        // input mata kuliah
        System.out.println("");
        for (int i = 0; i < matkul; i++) {
            System.out.print("Nama Mata Kuliah ke-" + (i + 1) + ": ");
            MatKul[i] = sc.nextLine();
        }

        // input SKS
        System.out.println("");
        for (int i = 0; i < matkul; i++) {
            System.out.print("Masukkan SKS MK " + MatKul[i] + ": ");
            BobotSKS[i] = sc.nextInt();
            SKS += BobotSKS[i];
        }

        // input nilai angka 
        System.out.println("");
        for (int i = 0; i < matkul; i++) {
            System.out.print("Masukkan Nilai MK " + MatKul[i] + ": ");
            NilaiAngka[i] = sc.nextDouble();
        }

        // konversi nilai angka ke nilai huruf dan bobot nilai
        for (int i = 0; i < matkul; i++) {
            if (NilaiAngka[i] > 80) {
                NilaiHuruf[i] = "A";
                BobotNilai[i] = 4.00;
            } else if (NilaiAngka[i] > 73) {
                NilaiHuruf[i] = "B+";
                BobotNilai[i] = 3.50;
            } else if (NilaiAngka[i] > 65) {
                NilaiHuruf[i] = "B";
                BobotNilai[i] = 3.00;
            } else if (NilaiAngka[i] > 60) {
                NilaiHuruf[i] = "C+";
                BobotNilai[i] = 2.50;
            } else if (NilaiAngka[i] > 50) {
                NilaiHuruf[i] = "C";
                BobotNilai[i] = 2.00;
            } else if (NilaiAngka[i] > 39) {
                NilaiHuruf[i] = "D";
                BobotNilai[i] = 1.00;
            } else {
                NilaiHuruf[i] = "E";
                BobotNilai[i] = 0;
            }
        }

        for (int i = 0; i < matkul; i++) {
            TotalNilai += (BobotNilai[i] * BobotSKS[i]);
        }

        double IPK = TotalNilai / SKS;

        // tampilkan hasil konversi nilai
        System.out.println("\n===========================================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("===========================================================");
        System.out.printf("%-20s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < matkul; i++) {
            System.out.printf("%-20s %-12.2f %-12s %-12.2f\n", MatKul[i], NilaiAngka[i], NilaiHuruf[i], BobotNilai[i]);
        }

        System.out.println("===========================================================");
        System.out.printf("IPK: %.2f\n", IPK);
    }
}