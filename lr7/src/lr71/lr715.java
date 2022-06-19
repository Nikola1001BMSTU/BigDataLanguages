package lr71;

import java.util.Scanner;

public class lr715 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str_start = in.nextLine();
        int k = Integer.parseInt(in.nextLine());
        String str_in = in.nextLine();
        str_start = str_start.substring(0, k) + str_in + str_start.substring(k, str_start.length());
        System.out.println(str_start);
    }
}
