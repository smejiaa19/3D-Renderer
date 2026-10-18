package math;

public class FirstVector extends Vector {
    public static void main(String[] args) {
        FirstVector firstVector = new FirstVector();

        firstVector.setCoordinates(0, 1f);
        firstVector.setCoordinates(1, 0.75f);
        firstVector.setCoordinates(2, 0f);

        firstVector.getCoordinates();
    }
}
