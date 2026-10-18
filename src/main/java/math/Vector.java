package math;

public abstract class Vector {
    private final float[] coordinates;

    protected Vector() {
        coordinates = new float[3];
    }

    public float[] getCoordinates() {
        return coordinates.clone();
    }

    public void setCoordinates(int i, float value) {
        coordinates[i] = value;
    }
}
