package lr21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lr216 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] array_str = new String[n];
        for (int i = 0; i < n; i++) {
            array_str[i] = in.next();
        }

        for (int i = 0; i < n; i++) {
            String word = array_str[i];
            boolean not_fail = true;
            for (int j = 0; j < word.length() - 1; j++) {
                if (word.charAt(j) >= word.charAt(j+1)){
                    not_fail = false;
                    break;
                }
            }
            if (not_fail){
                System.out.println(word);
                break;
            }
        }
        System.out.println("Developer: Stepanenko");
        System.out.println("Task date: 11.02.2022 17:25");
        System.out.print("Done date: ");
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z");
        System.out.println(format.format(new Date()));
        in.close();
    }
}
