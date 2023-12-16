import java.util.Scanner;

public class No17 {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        int gunung = 0;
        int lembah = 0;
        int ketinggian = 0;

        System.out.print("Masukkan input: ");
        String inp = scanner.nextLine();
        String[] inpArr = inp.split(" ");

        for(int i = 0; i < inpArr.length; i++) {
            System.out.println(inpArr[i]);
            if(inpArr[i].equals("N")) {
                ketinggian++;
            } else {
                ketinggian--;
            }

            if(ketinggian == 0) {
                if(!inpArr[i].equals("N")) {
                    gunung++;
                } else {
                    lembah++;
                }
            }
        }

        System.out.println("gunung: "+gunung + "," + "lembah: "+lembah);

    }
}