package lr73;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lr736 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] my_list = in.nextLine().split(" ");
        String temp = my_list[0];
        for (int i = 0; i < my_list.length - 1; i++) {
            my_list[i] = my_list[i + 1];
        }
        my_list[my_list.length - 1] = temp;
        System.out.println(String.join(" ", my_list));
    }
}
