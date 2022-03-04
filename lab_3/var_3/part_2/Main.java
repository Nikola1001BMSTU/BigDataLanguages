package lab_3.var_3.part_2;

public class Main {
    public static void main(String[] args) {
        Petal petal1 = new Petal("Красный");
        Petal petal2 = new Petal("Белый");
        Petal petal3 = new Petal("Чёрный");
        Petal petal4 = new Petal("Розовый");
        Bud bud1 = new Bud(petal1, 4);
        Rose  rose1 = new Rose(bud1);
        rose1.bud.showColor();
        bud1.addPetal(petal2);
        bud1.addPetal(petal3);
        bud1.addPetal(petal4);
        rose1.bud.showColor();
        System.out.println();
        rose1.bud.bloomBud();
        System.out.println();
        rose1.bud.witherBud();
    }
}
