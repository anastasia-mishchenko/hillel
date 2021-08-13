package abstractInterfaces;

public interface CanFly extends CanMove {
    public double speed (CanFly fly);

    @Override
    double speed();
}
