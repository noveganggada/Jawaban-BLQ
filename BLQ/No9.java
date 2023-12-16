import java.util.Scanner;

public class No9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Angka :");
        int N = scanner.nextInt();
        int[] deret = generateKelipatanTiga(N);

        System.out.println("Deret kelipatan 3 dengan panjang :" + N);
        for (int angka : deret) {
            System.out.print(angka + " ");
        }
        scanner.close();
    }

    public static int[] generateKelipatanTiga(int N) {
        int[] deret = new int[N];
        for (int i = 0; i < N; i++) {
            deret[i] = N * (i + 1);
        }
        return deret;
    }
}
