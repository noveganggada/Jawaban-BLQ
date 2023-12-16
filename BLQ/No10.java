import java.util.Scanner;

public class No10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nama : ");
        String nama = scanner.nextLine();

        String[] split = nama.split(" "); //untuk menyimpan dan memisahkan array dari "nama" dengan "spasi"
        
        for(int i = 0; i < split.length; i++) {

            int lastIndexOf = split[i].length();
            System.out.println(split[i].substring(0,1)+"***"+split[i].substring(lastIndexOf-1));

        }
    }
}