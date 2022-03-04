package lab_3.var_1;

public class Continued_Fraction {
    int n;
    int x;
    int a[];
    double A;
    int temp;

    public double getA() {
        return A;
    }

    Continued_Fraction(int n, int x) {
       this.n = n;
       this.x = x;
       temp = 0;
       this.a = new int[n];
       for (int i = 0; i < n; i++) {
           a[i] = (int)(Math.random()*10);
       }
       A = calculation(this.temp, this.x, this.n, this.a);
       System.out.println("А = " + A);
    }
    public double calculation(int temp, int x, int n, int[] a) {
        if (temp == n-1) {
            return a[temp];
        }

        return a[temp] + (x/calculation(temp+1, x, n, a));
    }
    public static void sum(double cf1, double cf2) {
        double sum = cf1 + cf2;
        System.out.println("Сумма двух цепных дробей равна: " + sum);
    }
    public static void sub(double cf1, double cf2) {
        double sub = cf1 - cf2;
        System.out.println("Разность двух цепных дробей равна: " + sub);
    }
    public static void mult(double cf1, double cf2) {
        double mult = cf1 * cf2;
        System.out.println("Произведение двух цепных дробей равна: " + mult);
    }
    public static void div(double cf1, double cf2) {
        double div = cf1 / cf2;
        System.out.println("Деление двух цепных дробей равна: " + div);
    }

    public static void main(String[] args) {
        Continued_Fraction[] cf = new Continued_Fraction[2];
        cf[0] = new Continued_Fraction(2, 10);
        cf[1] = new Continued_Fraction(2, 10);
        sum(cf[0].A, cf[1].A);
        sub(cf[0].A, cf[1].A);
        mult(cf[0].A, cf[1].A);
        div(cf[0].A, cf[1].A);
    }
}
