package math;


public class Mesh extends Vector {
    public Mesh(float x, float y, float z){
        super(x, y, z);
    }

    public static void main(String[] args) {
        Mesh vector1 = new Mesh(1f, 0.75f, 0f);
        Mesh vector2 = new Mesh(-1f, 0.75f, 0f);
        Mesh vector3 = new Mesh(1f, -0.75f, 0f);
        Mesh vector4 = new Mesh(-1f, -0.75f, 0f);
    }
}
