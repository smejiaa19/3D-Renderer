package math;


public class Mesh extends Vector {
    public Mesh(double x, double y, double z){
        super(x, y, z);
    }

    public static void main(String[] args) {
        Mesh vector1 = new Mesh(1d, 0.75d, 0d);
        Mesh vector2 = new Mesh(-1d, 0.75d, 0d);
        Mesh vector3 = new Mesh(1d, -0.75d, 0d);
        Mesh vector4 = new Mesh(-1d, -0.75d, 0d);
    }
}
