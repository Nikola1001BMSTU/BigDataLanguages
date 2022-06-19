package lab_3.var_3.part_2;

import java.util.Arrays;
import java.util.Objects;

public class Bud {
    int nPetals;
    Petal[] petals;
    String conditionBud;
    Bud (Petal petal, int maxPetals) {
        this.nPetals = 0;
        this.conditionBud = "";
        this.petals = new Petal[maxPetals];
        this.petals[nPetals] = petal;
        petal.id = nPetals;
        this.nPetals++;
    }
    public void addPetal(Petal petal) {
        this.petals[nPetals] = petal;
        petal.id = nPetals;
        nPetals++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bud bud = (Bud) o;
        return nPetals == bud.nPetals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nPetals);
    }

    @Override
    public String toString() {
        return "Bud{" +
                "nPetals=" + nPetals +
                ", petals=" + Arrays.toString(petals) +
                ", conditionBud='" + conditionBud + '\'' +
                '}';
    }
    public void showColor() {
        for (int i = 0; i < petals.length; i++) {
            if (petals[i] != null)
                System.out.println(petals[i].toString());
        }
    }
    public void witherBud() {
        conditionBud = "Бутон завял";
        for (int i = 0; i < petals.length; i++) {
            if (petals[i] != null) {
                petals[i].conditionPetal = "Завял";
                System.out.println(petals[i].toString());
            }
        }
    }
    public void bloomBud() {
        conditionBud = "Бутон расцвёл";
        for (int i = 0; i < petals.length; i++) {
            if (petals[i] != null) {
                petals[i].conditionPetal = "Расцвёл";
                System.out.println(petals[i].toString());
            }
        }
    }
}
