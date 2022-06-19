package lr51;

import java.util.Arrays;

public class Drob {
    private int amount;
    private int chisl;
    private int[] znam = new int[this.amount];

    public Drob(int amount, int chisl, int[] znam) {
        this.amount = amount;
        this.chisl = chisl;
        this.znam = znam;
    }

    public Drob() {
    }

    public Drob(int amount, int[] znam) {
        this.amount = amount;
        this.chisl = 1;
        this.znam = znam;
    }


    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getChisl() {
        return chisl;
    }

    public void setChisl(int chisl) {
        this.chisl = chisl;
    }

    public int[] getZnam() {
        return znam;
    }

    public void setZnam(int[] znam) {
        this.znam = znam;
    }

    double to_int(){
        double ans = 1;
        for (int i = this.amount - 1; i != 0; i--) {
            ans = this.znam[i] + 1/ans;
        }
        return ans;
    }
    static Drob from_int(double a){
        int[] new_znam = new int[100];
        int i = 1;
        new_znam[0] = (int)a;
        a-=new_znam[0];
        try {
            for (i = 1; i < 100; i++) {
                new_znam[i] = (int) (1 / a);
                a = 1 / a - new_znam[i];
                if (new_znam[i] == 0) {
                    break;
                }
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            i = 0;
        }
        int[] new_new = new int[i];
        for (int j = 0; j < i; j++) {
            new_new[j] = new_znam[j];
        }
        return new Drob(i, 1, new_new);
    }

    public static Drob sum(Drob a, Drob b){
        return from_int(a.to_int() + b.to_int());
    }
    public static Drob min(Drob a, Drob b){
        return from_int(a.to_int() - b.to_int());
    }
    public static Drob mul(Drob a, Drob b){
        return from_int(a.to_int() * b.to_int());
    }
    public static Drob div(Drob a, Drob b){
        return from_int(a.to_int() / b.to_int());
    }

    @Override
    public String toString() {
        return "Drob{" +
                "amount=" + amount +
                ", chisl=" + chisl +
                ", znam=" + Arrays.toString(znam) +
                '}';
    }
}
