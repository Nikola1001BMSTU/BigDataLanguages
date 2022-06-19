package lr51;

import java.util.Arrays;

public class My_matrix {
    private int axis_x;
    private int axis_y;
    private int[][] numbers = new int[axis_x][axis_y];
    public My_matrix() {
    }

    public My_matrix(int axis_x, int axis_y, int[][] numbers) {
        this.axis_x = axis_x;
        this.axis_y = axis_y;
        this.numbers = numbers;
    }

    public My_matrix(int axis_x, int axis_y) {
        this.axis_x = axis_x;
        this.axis_y = axis_y;
        this.numbers = new int[axis_x][axis_y];
    }

    public void setAxis_x(int axis_x) {
        this.axis_x = axis_x;
    }

    public void setAxis_y(int axis_y) {
        this.axis_y = axis_y;
    }

    public int getAxis_x() {
        return axis_x;
    }

    public int getAxis_y() {
        return axis_y;
    }

    My_matrix square(){
        My_matrix new_m = new My_matrix(this.axis_x, this.axis_x);
        for (int i = 0; i < this.axis_x; i++) {
            for (int j = 0; j < this.axis_x; j++) {
                for (int k = 0; k < this.axis_y; k++) {
                    new_m.numbers[i][j] += this.numbers[i][k] * this.numbers[j][k];
                }
            }
        }
        return new_m;
    }

    public int[][] getNumbers() {
        return numbers;
    }

    public void setNumbers(int[][] numbers) {
        this.numbers = numbers;
    }
    public void setNumber(int i, int j, int k){
        this.numbers[i][j] = k;
    }

    public void change(int k){
        int min = this.numbers[0][k];
        int max = this.numbers[0][k];
        int min_row = 0;
        int max_row = 0;
        for (int i = 0; i < this.axis_x; i++) {
            if (this.numbers[i][k] < min){
                min = this.numbers[i][k];
                min_row = i;
            }
            if (this.numbers[i][k] > max){
                max = this.numbers[i][k];
                max_row = i;
            }
        }
        int[] mid = this.numbers[min_row];
        this.numbers[min_row] = this.numbers[max_row];
        this.numbers[max_row] = mid;

    }

    @Override
    public String toString() {
        return "My_matrix{" +
                "axis_x=" + axis_x +
                ", axis_y=" + axis_y +
                ", numbers=" + Arrays.toString(numbers) +
                '}';
    }
}
