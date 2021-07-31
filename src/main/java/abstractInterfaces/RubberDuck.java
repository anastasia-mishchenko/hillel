package abstractInterfaces;

import java.util.Objects;

public class RubberDuck extends Birds implements CanSwim{
    boolean isRubber;

    @Override
    public String toString() {
        return "RubberDuck{" +
                "isRubber=" + isRubber +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RubberDuck that = (RubberDuck) o;
        return isRubber == that.isRubber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), isRubber);
    }

    @Override
    public void canSwim() {
        System.out.println("I can swim");

    }
}
