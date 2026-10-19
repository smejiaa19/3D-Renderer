package math;

public abstract class Vector {
    private final float x, y, z ;

    protected Vector(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public float getX() {
        return x;
    }
    public float getY() {
        return y;
    }
    public float getZ() {
        return z;
    }

    public float[] add(Vector vector2) {
        float[] results = new float[3];
        float xScaled = this.x + vector2.getX();
        results[0] = xScaled;
        float yScaled = this.y+ vector2.getY();
        results[1] = yScaled;
        float zScaled = this.z + vector2.getZ();
        results[2] = zScaled;
        return results;
    }
    public float[] scale(float scalar) {
        float[] product = new float[3];
        float xScaled = this.x * scalar;
        product[0] = xScaled;
        float yScaled = this.y * scalar;
        product[1] = yScaled;
        float zScaled = this.z * scalar;
        product[2] = zScaled;
        return product;
    }
    // Okay basicamente creo que esto nos devuelve otro vector endonde nosotros tenemos que dibujar los rayos. Pero no lo entiendo taaan bien, las interpolaciones las hacemos 3 veces para encontrar un punto medio de dos puntos.
    // Me esta comiendo la logica
    public float[] interpolation(float[] variable, Vector anotherVector) {
        float[] hola = new float[0];

        return hola;
    }
}
