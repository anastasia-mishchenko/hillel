package abstractInterfaces;

import java.util.Objects;

public abstract class Birds {
    private boolean hasBeak = true;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Birds birds = (Birds) o;
        return hasBeak == birds.hasBeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hasBeak);
    }

    public boolean isHasBeak() {
        return hasBeak;
    }
}
