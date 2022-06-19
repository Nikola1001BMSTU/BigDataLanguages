package lr71;

import java.util.Scanner;

public class lr716 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str_start = in.nextLine();
        String str_find = in.nextLine();
        String str_in = in.nextLine();
        int i = 0;
        while (i < str_start.length() - str_find.length() + 1) {
            if (str_start.substring(i, i + str_find.length()).equals(str_find)){
                str_start = str_start.substring(0, i + str_find.length()) + str_in + str_start.substring(i + str_find.length(), str_start.length());
            }
            i++;
        }
        System.out.println(str_start);
    }
}
