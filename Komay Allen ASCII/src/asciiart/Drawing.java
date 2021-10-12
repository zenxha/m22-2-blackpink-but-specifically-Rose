package asciiart;


public class Drawing {
    /**
     * Use the Princeton algs4cs Picture library to draw
     * this as an RGB color image
     * 
     * @param r A 2D array of the red values between 0 and 0xFF
     * @param g A 2D array of the green values between 0 and 0xFF
     * @param b A 2D array of the blue values between 0 and 0xFF
     */
    public static void showPic(int[][] r, int[][] g, int[][] b) {
        int height = r.length;
        int width = r[0].length;
        Picture pic = new Picture(width, height);
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                int rgb = r[row][col] << 16 | g[row][col] << 8 | b[row][col];
                pic.setRGB(col, row, rgb);
            }
        }
        pic.show();
    }
    
    public static void videoExample() {
        // Initialize the red, green, and blue channels
        int[][] r = new int[400][500];
        int[][] g = new int[400][500];
        int[][] b = new int[400][500];
        // Draw a vertical red rectangle
        for (int i = 20; i < 100; i++) {
            for (int j = 50; j < 80; j++) {
                r[i][j] = 0xFF;
            }
        }
        // Draw a horizontal blue rectangle
        for (int i = 50; i < 80; i++) {
            for (int j = 20; j < 100; j++) {
                b[i][j] = 0xFF;
            }
        }
        // Draw a gray diagonal
        int index = 0;
        while (index < r.length && index < r[0].length) {
            int value = index;
            if (value > 0xFF) {
                value = 0xFF;
            }
            r[index][index] = value;
            g[index][index] = value;
            b[index][index] = value;
            index++;
        }
        showPic(r, g, b);
    }
    
    /**
     * 
     * @param r 2D array of red components in each pixel
     * @param g 2D array of green components in each pixel
     * @param b 2D array of blue components in each pixel
     * @param cx Center of the circle's x coordinate
     * @param cy Center of the circle's y coordinate
     * @param radius Radius of the circle
     * 
     * (x-cx)^2 + (y-cy)^2 <= radius^2
     * 
     */
    public static void drawCircle(int[][] r, int[][] g, int[][] b,
                                  double cx, double cy, double radius) {
        // TODO: Write a system of loops that draws the appropriate
        // circle in magenta
        
        // Loop through every pixel, and check if that pixel is within
        // the circle
        
        // Loop through the rows first
        for (int i = 0; i < r.length; i++) {
            // For each row, loop each column
            for (int j = 0; j < r[i].length; j++) {
                double x = j;
                double y = i;
                double distSqr = Math.pow(x-cx, 2) + Math.pow(y-cy, 2);
                // Check to see if it's in the circle
                if (distSqr <= radius*radius) {
                    // We're in the circle!
                    r[i][j] = 0xFF;
                    b[i][j] = 0xFF;
                }
            }
        }
        
    }
    
    public static void main(String[] args) {
        // Initialize the red, green, and blue channels
        int[][] r = new int[400][500];
        int[][] g = new int[400][500];
        int[][] b = new int[400][500];
        drawCircle(r, g, b, 300, 100, 50);
        drawCircle(r, g, b, 100, 200, 20);
        drawCircle(r, g, b, 300, 300, 100);
        showPic(r, g, b);
    }
}
