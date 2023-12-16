import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class No15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Waktu 12Jam : ");
        String waktu12Jam = scanner.nextLine();
        
        // Format awal
        SimpleDateFormat format12 = new SimpleDateFormat("hh:mm:ss a");
        // Format 24 jam
        SimpleDateFormat format24 = new SimpleDateFormat("HH:mm:ss");
        
        try {
            // Parsing waktu dalam format 12 jam menjadi objek Date
            Date date12 = format12.parse(waktu12Jam);
            
            // Mengonversi ke format 24 jam
            String waktu24Jam = format24.format(date12);
            
            System.out.println("Waktu dalam format 24 jam: " + waktu24Jam);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
