package math;

public class Camera extends Vector {
    public Camera(float x, float y, float z) {
        super(x, y, z);
    }
    public static void main(String[] args) {
        Camera camera = new Camera(0f, 0f, -1f);
    }
}
