import java.util.Scanner;

public class No11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

       // Using a for loop to iterate in reverse order
       for (int i = nama.length() - 1; i >= 0; i--) {
            char x = nama.charAt(i);
        if(nama.length()%2==0) {
            System.out.println("***" + x + "***");
        } else {
            System.out.println("**" + x + "**");
            }
        }   
    }
}