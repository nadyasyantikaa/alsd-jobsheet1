import java.util.Scanner;

public class Tugas1PlatNomor {
    public static void main(String[] args) {
        // array satu dimensi kode plat nomor
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        // array dua dimensi untuk nama kota
        String[] kota = {
            "BANTEN", 
            "JAKARTA", 
            "BANDUNG", 
            "CIREBON", 
            "BOGOR", 
            "PEKALONGAN", 
            "SEMARANG", 
            "SURABAYA", 
            "MALANG", 
            "TEGAL"
        };

        // input dari pengguna
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kode plat nomor: ");
        char plat = input.next().toUpperCase().charAt(0);
        
        // mencari dan cetak nama kota yang sesuai
        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == plat) {
                System.out.println("Kota dari plat nomor " + plat + " adalah: " + kota[i]);
                ditemukan = true;
                break;
            }
        }
        
        // output kode tidak ditemukan
        if (!ditemukan) {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }

        input.close();
    }
}
