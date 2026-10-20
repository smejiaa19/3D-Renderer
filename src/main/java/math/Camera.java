package math;

public class Camera extends Vector {
    public Camera(double x, double y, double z) {
        super(x, y, z);
    }
    public static void main(String[] args) {
        Camera camera = new Camera(0d, 0d, -1d);
    }
}
