package lab_3.var_4.part_2;

public class Brigade {
    Designer[] designers;
    Brigade(int maxDesigners) {
        designers = new Designer[maxDesigners];
        for (int i = 0; i < maxDesigners; i++) {
            designers[i] = new Designer("Ivanov" + i);
        }
    }
    public String toString() {
        String temp = "";
        for (int i = 0; i < designers.length; i++) {
            temp += designers[i].toString();
        }
        return temp;
    }
}
