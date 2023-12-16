import java.util.Scanner;

public class No6 {
    public static void main(String[] args) {

        String kata; // Ganti dengan kata yang ingin Anda cek
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kata : ");
        kata = scanner.nextLine();

        if (isPalindrome(kata)) {
            System.out.println(kata + " adalah palindrome.");
        } else {
            System.out.println(kata + " bukan palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        
        str = str.toLowerCase();

        int panjang = str.length();

        // Cek setiap karakter pada posisi yang sesuai di awal dan akhir kata
        for (int i = 0; i < panjang / 2; i++) {
            if (str.charAt(i) != str.charAt(panjang - 1 - i)) {
                return false; // Tidak palindrome
            }
        }

        return true; // Palindrome
    }
}
