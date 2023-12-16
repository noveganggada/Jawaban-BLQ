public class No8 {
    public static void main(String[] args) {
        int[] deret = {1, 2, 4, 7, 8, 6, 9};

        int minimal = hitungMinimal(deret);
        int maksimal = hitungMaksimal(deret);

        System.out.println("Nilai Minimal: " + minimal);
        System.out.println("Nilai Maksimal: " + maksimal);
    }

    public static int hitungMinimal(int[] deret) {
        int minimal = Integer.MAX_VALUE;

        for (int i = 0; i <= deret.length - 4; i++) {
            int total = 0;
            for (int j = i; j < i + 4; j++) {
                total += deret[j];
            }
            minimal = Math.min(minimal, total);
        }

        return minimal;
    }

    public static int hitungMaksimal(int[] deret) {
        int maksimal = Integer.MIN_VALUE;

        for (int i = 0; i <= deret.length - 4; i++) {
            int total = 0;
            for (int j = i; j < i + 4; j++) {
                total += deret[j];
            }
            maksimal = Math.max(maksimal, total);
        }

        return maksimal;
    }
}
