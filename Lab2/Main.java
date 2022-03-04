package Lab2;
import java.util.Scanner;

public class Main {
    public static void print_arr(String[] arr){
        System.out.println("Массив слов");
        for (String s : arr) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void print_matrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // 5. Ввести n слов с консоли.
        // Найти количество слов, содержащих только символы латинского алфавита,
        // а среди них – количество слов с равным числом гласных и согласных букв.

        System.out.println("Введите n");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        int count_english = 0;
        int count_equals = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = in.next();
        }
        print_arr(arr);
        for (String str : arr) {
            if (str.matches("[a-zA-Z]+")) {
                count_english += 1;
                String vowels = "aeiou";
                int counVow = 0;
                for (char charstr : str.toLowerCase().toCharArray()) {
                    if (vowels.indexOf(charstr) != -1)
                        counVow++;
                }
                if (counVow == (str.length() - counVow))
                    count_equals += 1;
            }

        }
        System.out.println("количество слов, содержащих только символы латинского алфавита: " + count_english);
        System.out.println("количество слов с равным числом гласных и согласных букв: " + count_equals);

//  6. Ввести n слов с консоли. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.
//  Если таких слов несколько, найти первое из них.
        boolean increasing = true;
        for (String str : arr) {
            char[] arr_char_str = str.toCharArray();
            for (int i = 0; i < arr_char_str.length - 1; i++) {
                increasing = increasing && arr_char_str[i] < arr_char_str[i + 1];
            }
            if (increasing) {
                System.out.println("слово, символы в котором идут в строгом порядке возрастания их кодов " + str);
                break;
            }
        }
        if (!increasing)
            System.out.println("слово, символы в котором идут в строгом порядке возрастания их кодов: Таких слов нет");


//Ввести с консоли n – размерность матрицы a[n][n].
// Задать значения элементов матрицы в интервале значений от -n до n с помощью датчика случайных чисел.

        System.out.println("Введите n для матрицы");
        n = in.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int) (Math.random() * (2*n+1)) - n;
            }
        }
        print_matrix(matrix);

//5. Транспонировать квадратную матрицу.
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        System.out.println("Транспонированная");
        print_matrix(matrix);
//  6. Вычислить норму матрицы.
        int matrix_norm = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            int norm = 0;
            for (int j = 0; j < matrix.length; j++) {
                norm+= matrix[i][j];
            }
            if (matrix_norm < norm)
                matrix_norm = norm;
        }
        System.out.println("Норма матрицы: " + matrix_norm);
    }
}

