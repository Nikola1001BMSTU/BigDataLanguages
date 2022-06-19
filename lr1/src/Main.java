package lab_1;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void print_int_arr(int[] arr){
        System.out.println("Полученный массив");
        for (int elem: arr) {
            System.out.print(elem);
            System.out.print(' ');
        }
        System.out.println();
    }

    public static void main(String[] args) {
        //5. Создать программу ввода целых чисел как аргументов командной строки, подсчета их суммы (произведения) и вывода результата на консоль.
//6. Создать приложение, выводящее фамилию разработчика, дату и время получения задания, а также дату и время сдачи задания.
// Для получения последней даты и времени использовать класс Calendar из пакета java.util
        int sum = 0;
        int prev = 1;
        for (var arg:args) {
            try {
                sum += Integer.valueOf(arg);
                prev *= Integer.valueOf(arg);
            } catch (NumberFormatException ex){
                System.out.println("Введено не численное значение: "+ arg);
            }
        }
        System.out.println("Сумма чисел: "+sum);
        System.out.println("Произведение чисел: "+prev);
        System.out.println("Фамилия разработчка: Голиков Николай \nДата и время получения: февраль 2022");
        System.out.println("Дата сдачи задания: "+ Calendar.getInstance().getTime());


        //        Ввести с консоли n целых чисел и поместить их в массив. На консоль вывести:
//        5. Элементы, расположенные методом пузырька по убыванию модулей.

        System.out.println("Введите n массива");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(Math.abs(arr[i]) < Math.abs(arr[i+1])){
                    isSorted = false;
                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println("sorted");
        print_int_arr(arr);


//        6. Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.
        System.out.println("Все трехзначные числа, в десятичной записи которых нет одинаковых цифр.");
        for(int i=0; i<arr.length; i++)
        {
            int num = Math.abs(arr[i]);
            if (num > 99
                    && num <1000
                    && num/100 != num%10
                    && num/100 != num%100/10
                    && num%100/10 != num%10){
                System.out.print(arr[i]);
                System.out.println(' ');
            }
        }
        System.out.println();
    }
}
