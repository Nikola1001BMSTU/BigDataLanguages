package lr73;

import java.util.Scanner;

public class lr735 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            String[] my_list = in.nextLine().split(" ");
            String temp = my_list[0];
            my_list[0] = my_list[my_list.length - 1];
            my_list[my_list.length - 1] = temp;
            System.out.println(String.join(" ", my_list));
        }
    }
}
