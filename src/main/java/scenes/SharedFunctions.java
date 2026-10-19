package scenes;

import java.awt.Dimension;
import java.awt.Toolkit;

public class SharedFunctions {
    public static double[] getScreenSize() {
        double[] dimensions = new double[2];
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        dimensions[0] = width;
        double height = screenSize.getHeight();
        dimensions[1] = height;
        return dimensions;
    }

    public static double[] getAlpha(double[] dimensions) {
        // In order to get alpha we need to loop through each pixel of the width
        // And do the following operation a = (i / width), then save all the alphas
        int width = (int) dimensions[0];
        double[] alphas = new double[width];
        for (int i = 0; i < width; i++) {
            double currentAlpha = i / dimensions[0];
            alphas[i] = currentAlpha;
        }
        return alphas;
    }

    public static double[] getBeta(double[] dimensions) {
        int height = (int) dimensions[1];
        double[] betas = new double[height];
        for (int i = 0; i < height; i++) {
            Double currentBeta = i / dimensions[1];
            betas[i] = currentBeta;
        }
        return betas;
    }

    public static void main(String[] args) {
        double[] sizes = {1200d, 800d};
        getAlpha(sizes);
        getBeta(sizes);
    }
}
