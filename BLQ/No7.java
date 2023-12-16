import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class No7 {
    public static void main(String[] args) {
        int[] deretAngka = {8, 7, 0, 2, 7, 1, 7, 6, 3, 0, 7, 1, 3, 4, 6, 1, 6, 4, 3}; // Ganti dengan deret angka Anda

        // Menghitung mean
        double mean = hitungMean(deretAngka);
        System.out.println("Mean: " + mean);

        // Menghitung median
        double median = hitungMedian(deretAngka);
        System.out.println("Median: " + median);

        // Menghitung modus
        int[] modus = hitungModus(deretAngka);
        System.out.println("Modus: " + Arrays.toString(modus));
    }

    public static double hitungMean(int[] deret) {
        int jumlah = 0;
        for (int angka : deret) {
            jumlah += angka;
        }
        return (double) jumlah / deret.length;
    }

    public static double hitungMedian(int[] deret) {
        Arrays.sort(deret);
        int panjang = deret.length;
        if (panjang % 2 == 0) {
            int tengah1 = deret[panjang / 2 - 1];
            int tengah2 = deret[panjang / 2];
            return (double) (tengah1 + tengah2) / 2;
        } else {
            return deret[panjang / 2];
        }
    }

    public static int[] hitungModus(int[] deret) {
        Map<Integer, Integer> frekuensi = new HashMap<>();

        // Menghitung frekuensi setiap angka dalam deret
        for (int angka : deret) {
            frekuensi.put(angka, frekuensi.getOrDefault(angka, 0) + 1);
        }

        // Mencari nilai maksimum
        int max = 0;
        for (int value : frekuensi.values()) {
            if (value > max) {
                max = value;
            }
        }

        // Mengumpulkan modus dengan frekuensi maksimum
        int modusCount = 0;
        for (int key : frekuensi.keySet()) {
            if (frekuensi.get(key) == max) {
                modusCount++;
            }
        }

        // Membuat array untuk menyimpan modus
        int[] modus = new int[modusCount];
        int index = 0;
        for (int key : frekuensi.keySet()) {
            if (frekuensi.get(key) == max) {
                modus[index] = key;
                index++;
            }
        }

        Arrays.sort(modus); // Mengurutkan modus untuk mengambil yang terkecil jika lebih dari satu

        return modus;
    }
}
