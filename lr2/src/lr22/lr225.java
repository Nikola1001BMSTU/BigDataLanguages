package lr22;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lr225 {
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
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int mid = my_array[i][j];
                my_array[i][j] = my_array[j][i];
                my_array[j][i] = mid;
            }
        }
        System.out.println("transported matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(my_array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
