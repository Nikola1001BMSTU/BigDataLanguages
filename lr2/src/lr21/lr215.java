package lr21;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class lr215 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] array_str = new String[n];
        for (int i = 0; i < n; i++) {
            array_str[i] = in.next();
        }
        int only_letters = 0;
        int equal_letters = 0;
        String letters = "eyuioaEYUIOA";
        for (int i = 0; i < n; i++) {
            String word = array_str[i];
            boolean only_latin = true;
            int gl_sogl = 0;
            for (int j = 0; j < word.length(); j++) {
                if (!(('a' <= word.charAt(j) && word.charAt(j) <= 'z') || ('A' <= word.charAt(j) && word.charAt(j) <= 'Z'))) {
                    only_latin = false;
                    break;
                }
                if (letters.contains(String.valueOf(word.charAt(j)))){
                    gl_sogl += 1;
                } else {
                    gl_sogl -= 1;
                }
            }
            if (only_latin){
                only_letters += 1;
                if (gl_sogl == 0){
                    equal_letters += 1;
                }
            }
        }
        System.out.println("words with only latin letters = " + only_letters);
        System.out.println("words with equal letters = " + equal_letters);
        System.out.println("Developer: Stepanenko");
        System.out.println("Task date: 11.02.2022 17:25");
        System.out.print("Done date: ");
        SimpleDateFormat format = new SimpleDateFormat("yyyy.MM.dd 'at' HH:mm:ss z");
        System.out.println(format.format(new Date()));
        in.close();
    }
}
