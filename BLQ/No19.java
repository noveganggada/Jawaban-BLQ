import java.util.Scanner;

public class No19 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Kalimat: ");
        String kalimat = scanner.nextLine();

        if (isPangram(kalimat)) {
            System.out.println("Kalimat ini adalah pangram.");
        } else {
            System.out.println("Kalimat ini bukan pangram.");
        }
    }

    public static boolean isPangram(String kalimat) {
        // Mengubah semua karakter dalam kalimat menjadi huruf kecil
        kalimat = kalimat.toLowerCase();

        // Mengecek keberadaan setiap huruf alfabet dalam kalimat
        for (char huruf = 'a'; huruf <= 'z'; huruf++) {
            if (kalimat.indexOf(huruf) == -1) {
                // Jika ada huruf yang tidak ditemukan, kalimat bukan pangram
                return false;
            }
        }

        // Jika semua huruf ditemukan, kalimat adalah pangram
        return true;
    }
}