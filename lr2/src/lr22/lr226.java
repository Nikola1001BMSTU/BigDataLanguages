package lr22;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lr226 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] my_array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                my_array[i][j] = ThreadLocalRandom.current().nextInt(-n, n + 1);
            }
        }
        System.out.println("my matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(my_array[i][j] + " ");
            }
            System.out.println();
        }
        int norm = 0;
        for (int i = 0; i < n; i++) {
            int cur_norm = 0;
            for (int j = 0; j < n; j++) {
                cur_norm += Math.abs(my_array[i][j]);
            }
            if (cur_norm > norm){norm = cur_norm;}
        }
        System.out.println("Norm of matrix = " + norm);
    }
}
