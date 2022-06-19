package lr51;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lr515 {
    public static void main(String[] args) {
        int amount = 1;
        Scanner in = new Scanner(System.in);
        try {
            amount = in.nextInt();
        } catch (Exception e){
            System.out.println("baaad input, will be 1");
            in.nextLine();
        }

        My_matrix[] my_array = new My_matrix[amount];
        int n = 3 * amount;
        for (int i = 0; i < amount; i++) {
            try {
                int ax_x = ThreadLocalRandom.current().nextInt(2, n + 2);
                int ax_y = ThreadLocalRandom.current().nextInt(2, n + 2);
                my_array[i] = new My_matrix(ax_x, ax_y);
                for (int j = 0; j < ax_x; j++) {
                    for (int k = 0; k < ax_y; k++) {
                        my_array[i].setNumber(j, k, ThreadLocalRandom.current().nextInt(-n, n + 1));
                    }
                }
            } catch (OutOfMemoryError e){
                if (i==0){
                    System.out.println("too many matrix, will be 1");
                    amount = 1;
                    n = 3;
                    i-=1;
                }else{
                    System.out.println("too many matrix, will be " + (i-1));
                    amount = i-1;
                    break;
                }
            }
        }
        for (int i = 0; i < amount; i++) {
            System.out.println("Matrix " + i);
            int[][] temp = my_array[i].getNumbers();
            for (int j = 0; j < temp.length; j++) {
                System.out.println(Arrays.toString(temp[j]));
            }
        }
        System.out.println("input k");
        int for_swap = 0;
        try{
            for_swap = in.nextInt();
        } catch (Exception e){
            System.out.println("baaaad input, will be 0");
            in.nextLine();
        }
        for (int i = 0; i < amount; i++) {
            my_array[i].change(for_swap);
        }
        System.out.println("swapped lines:");
        for (int i = 0; i < amount; i++) {
            System.out.println("Matrix " + i);
            int[][] temp = my_array[i].getNumbers();
            for (int j = 0; j < temp.length; j++) {
                System.out.println(Arrays.toString(temp[j]));
            }
        }
        System.out.println("input i");
        int for_square = 0;
        try{
            for_square = in.nextInt();
        } catch (Exception e){
            System.out.println("baaaad input, will be zero");
            in.nextLine();
        }
        my_array[for_square] = my_array[for_square].square();
        System.out.println("Squared matrix");
        for (int i = 0; i < amount; i++) {
            System.out.println("Matrix " + i);
            int[][] temp = my_array[i].getNumbers();
            for (int j = 0; j < temp.length; j++) {
                System.out.println(Arrays.toString(temp[j]));
            }
        }
    }
}
