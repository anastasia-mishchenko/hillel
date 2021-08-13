package abstractInterfaces;

import java.util.Objects;

public class Duckbill extends Mammals implements CanSwim{
    boolean hasBeak;

    @Override
    public String toString() {
        return "Duckbill{" +
                "hasBeak=" + hasBeak +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Duckbill duckbill = (Duckbill) o;
        return hasBeak == duckbill.hasBeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasBeak);
    }

    @Override
    public void canSwim() {
        System.out.println("I can swim");

    }
}
