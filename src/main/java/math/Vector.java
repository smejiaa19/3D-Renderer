package math;

public abstract class Vector {
    private final double x, y, z ;

    protected Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }

    // TODO: Modify this function so that it return a vector like x, y and z and not an array.
    public double[] add(Vector vector2) {
        double[] results = new double[3];
        double xScaled = this.x + vector2.getX();
        results[0] = xScaled;
        double yScaled = this.y+ vector2.getY();
        results[1] = yScaled;
        double zScaled = this.z + vector2.getZ();
        results[2] = zScaled;
        return results;
    }

    // TODO: Same as the other one
    public double[] scale(double scalar) {
        double[] product = new double[3];
        double xScaled = this.x * scalar;
        product[0] = xScaled;
        double yScaled = this.y * scalar;
        product[1] = yScaled;
        double zScaled = this.z * scalar;
        product[2] = zScaled;
        return product;
    }
    public double[][] interpolation(double[] alpha, double[] beta, Vector anotherVector) {
        int dimension = alpha.length * beta.length;
        double[][] interpolationValues = new double[dimension][3];

        // Esto nos da las primeras dos interpolaciones de alpha
        for (int i = 0; i < alpha.length; i++){
            // Primer paso
            double[] firstInterpolation = (scale((1 - alpha[i])));
            // Segundo paso
            double[] secondInterpolation = anotherVector.scale(alpha[i]);
            // Tercer paso

        }

        return interpolationValues;
    }
}
