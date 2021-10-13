package asciiart;
import java.awt.Color;

public class ASCIIArt {
    // The lookup table for all of the chars that can be used
    public static final String GRAYSCALE_CHARS  = "@#BW8gMN6&9RQqE0d$DbpmOa5AH2GZeKPS3X4U%kwohFVyzIsCu{xfn}tJTi17c=jYL?l[]v<>+|)r(/\\*_!;^~\":,-'.`";
    // The lookup table of the brightness of each char, from 0 to 1
    public static final double[] GRAYSCALE_VALUES = {0, 0.07863, 0.08205, 0.1316, 0.1453, 0.147, 0.1504, 0.1641, 0.1761, 0.1761, 0.1778, 0.2017, 0.2154, 0.2274, 0.2274, 0.2291, 0.2427, 0.2598, 0.2615, 0.2684, 0.2752, 0.2769, 0.2889, 0.2923, 0.294, 0.2974, 0.3026, 0.3077, 0.3077, 0.3094, 0.3162, 0.3197, 0.3333, 0.3333, 0.3385, 0.3538, 0.3607, 0.3795, 0.3846, 0.4017, 0.4034, 0.4068, 0.4291, 0.4325, 0.4444, 0.4598, 0.4632, 0.4667, 0.4752, 0.4855, 0.5077, 0.5128, 0.5128, 0.5128, 0.5179, 0.5214, 0.5231, 0.535, 0.535, 0.5368, 0.5385, 0.5436, 0.5624, 0.5624, 0.5624, 0.5641, 0.5778, 0.5829, 0.5846, 0.5863, 0.5863, 0.5915, 0.6017, 0.6068, 0.641, 0.6581, 0.6889, 0.694, 0.6974, 0.7333, 0.7333, 0.7402, 0.7675, 0.7744, 0.7863, 0.8068, 0.8342, 0.8427, 0.8598, 0.894, 0.947, 0.959, 0.9675, 1};
    
    /**
     * Convert a java.awt.Color object to a grayscale float
     * @param c A java.awt.Color object
     * @return A value between 0 and 1 representing grayscale
     */
    public static double getBrightness(Color c) {
        return 0.3*(c.getRed()/255.0) + 0.59*(c.getGreen()/255.0) + 0.11*(c.getBlue()/255.0);
    }
    
    /**
     * Convert a picture object to a 2D array of grayscale floats
     * @param picture A picture object
     * @return A 2D array of grayscale values between 0 and 1
     */
    public static double[][] getGrayscaleArray(Picture picture) {
        int rows = picture.height();
        int cols = picture.width();
        double[][] image = new double[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                image[i][j] = getBrightness(picture.get(j, i));
            }
        }
        return image;
    }

    public static void main(String[] args) {
        Picture picture = new Picture("Examples/ursinus.png");
        double[][] image = getGrayscaleArray(picture);
        System.out.println(image[10][4]);
        // TODO: Make ASCII art.  You should define at least one method
        // that takes in the image array, as well as the number of 
        // rows and columns in each block
    }
}