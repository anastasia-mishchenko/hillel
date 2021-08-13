package abstractInterfaces;

public interface CanMove {
    double speed = 0;
    default double speed(){
        return speed;
    };
}
