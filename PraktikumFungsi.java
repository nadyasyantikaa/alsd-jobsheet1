public class PraktikumFungsi {
    // data stok bunga di setiap cabang 
    static int[][] stokBunga = {
        {10, 5, 15, 7},  // RoyalGarden 1
        {6, 11, 9, 12},  // RoyalGarden 2
        {2, 10, 10, 5},  // RoyalGarden 3
        {5, 7, 12, 9}    // RoyalGarden 4
    };

    // harga setiap jenis bunga
    static int[] hargaBunga = {75000, 50000, 60000, 10000}; // {Aglonema, Keladi, Alocasia, Mawar}

    // pengurangan stok bunga mati pada RoyalGarden 4
    static int[] bungaMati = {-1, -2, 0, -5}; // {Aglonema, Keladi, Alocasia, Mawar}

    public static void main(String[] args) {
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Terjual:");
        hitungPendapatan();

        System.out.println("\nStok RoyalGarden 4 Sebelum Pengurangan:");
        tampilkanStokCabang(3); // RoyalGarden 4 ada di indeks ke-3

        System.out.println("\nStok RoyalGarden 4 Setelah Pengurangan Bunga Mati:");
        updateStokBungaMati(3);
        tampilkanStokCabang(3);
    }

    // fungsi untuk menghitung pendapatan setiap cabang jika semua bunga terjual
    public static void hitungPendapatan() {
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + pendapatan);
        }
    }

    // fungsi untuk menampilkan stok bunga di cabang tertentu
    public static void tampilkanStokCabang(int cabangIndex) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        for (int i = 0; i < stokBunga[cabangIndex].length; i++) {
            System.out.println(namaBunga[i] + ": " + stokBunga[cabangIndex][i]);
        }
    }

    // fungsi untuk memperbarui stok bunga di RoyalGarden 4 setelah ada bunga mati
    public static void updateStokBungaMati(int cabangIndex) {
        for (int i = 0; i < stokBunga[cabangIndex].length; i++) {
            stokBunga[cabangIndex][i] += bungaMati[i]; // stok update
            if (stokBunga[cabangIndex][i] < 0) stokBunga[cabangIndex][i] = 0; 
        }
    }
}
