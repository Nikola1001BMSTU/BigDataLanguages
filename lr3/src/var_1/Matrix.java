package lab_3.var_1;


import java.util.Arrays;

public class Matrix {
    int m;
    int n;
    int M[][];
    Matrix(){}
    Matrix (int m, int n) {
        this.m = m;
        this.n = n;
        this.M = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                this.M[i][j] = j+i;
                //this.M[i][j] = 1;
            }

    }
    public void changePlace(int k) {
        //Arrays.stream(this.M).sorted();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
        System.out.println();
        int min = this.M[0][k];
        int min_index = 0;
        int max = this.M[0][k];
        int max_index = 0;
        for (int i = 1; i < this.m; i++) {
            if (min < this.M[i][k]) {
                min = this.M[i][k];
                min_index = i;
            }
            if (max > this.M[i][k]) {
                max = this.M[i][k];
                max_index = i;
            }
        }
        for (int i = 0; i < n; i++) {
            int temp;
            temp = M[min_index][i];
            M[min_index][i] = M[max_index][i];
            M[max_index][i] = temp;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(M[i][j] + " ");
            System.out.println();
        }
    }
    public void pow2(){
        Arrays.stream(this.M).forEach(x-> Arrays.stream(x).forEach(y-> {
                    System.out.println(y);
                }));
        Arrays.stream(this.M).forEach(x-> Arrays.stream(x).forEach(y->{
            y=y*y;
            System.out.println(y);
        }));
    }


    public static void main(String[] args) {
        Matrix[] matrixArray = new Matrix[10];
        int t = 3;
        for (int i = 0; i < 2; i++) {
            matrixArray[i] = new Matrix(t, t);
        }
        int i =1;
        //matrixArray[i].pow2();
        matrixArray[i].changePlace(1);
        Matrix mmm = new Matrix();
    }

}
