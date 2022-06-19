package lab_3.var_3.part_2;

import java.util.Objects;

public class Petal {
    int id;
    String conditionPetal;
    String color;
        Petal(String color) {
            this.color = color;
            this.conditionPetal = "Ещё не распустился";
        }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Petal petal = (Petal) o;
        return Objects.equals(color, petal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Цвет лепестка с номером: " + id + " - " + color + ", его состояние: " + conditionPetal;
    }
}
