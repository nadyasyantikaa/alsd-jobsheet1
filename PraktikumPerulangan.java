import java.util.Scanner;

public class PraktikumPerulangan {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input NIM
        System.out.print("Masukkan NIM: ");
        String nim = scanner.next();

        // -2 digit terakhir NIM
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // jika n kurang dari 10, maka tambahkan 10 (n+=10)
        if (n < 10) {
            n += 10;
        }

        System.out.println("=========================");
        System.out.println("n : " + n);

        // menampilkan deret bilangan
        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue; // untuk melewati angka 6 dan 10
            }
            if (i % 2 == 1) {
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }

        System.out.println(); // pindah ke baris baru setelah output
        scanner.close();
    }
}
