import java.util.Scanner;
public class No5 {
    public static void main(String[] args) throws Exception {
        int limit, a, b, fibonacci;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Banyak bilangan yang mau ditampilkan: ");
        limit = input.nextInt();
        a = 1;
        b = 1;
        fibonacci = 1;

        for (int i =1; i <= limit; i++){
            System.out.print(b + ", ");
            fibonacci = a + b;
            a = b;
            b = fibonacci;
        }
    }
}