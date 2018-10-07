package matrix;

public class SquareMatrix {
    public static int[][] generator(int size, int max) {
        int[][] outRay = new int[size][size];
        for (int j = 0; j < outRay.length; j++) {
            for (int i = 0; i < outRay[j].length; i++) {
                outRay[j][i] = (int) (Math.random() * max);
            }
        }
        return outRay;
    }

    public static int[][] generator(int size, int max, int min) {
        max = max - min;
        int[][] outRay = new int[size][size];
        for (int j = 0; j < outRay.length; j++) {
            for (int i = 0; i < outRay[j].length; i++) {
                outRay[j][i] = (int) (Math.random() * max + min);
            }
        }
        return outRay;
    }

    public static int[][] generator(int size) {
        int[][] outRay = new int[size][size];
        for (int j = 0; j < outRay.length; j++) {
            for (int i = 0; i < outRay[j].length; i++) {
                outRay[j][i] = (int) (Math.random() * size);
            }
        }
        return outRay;
    }

    public static void print(int[][] arr) {
        for (int[] x : arr) {
            System.out.println();
            for (int y : x) {
                System.out.print(y + " ");
            }
        }
    }

    public static int[][] sum(int[][] arr1, int[][] arr2) {
        int[][] sumRay = new int[arr1.length][arr2.length];
        for (int i = 0; i < sumRay.length; i++) {
            for (int j = 0; j < sumRay[i].length; j++) {
                sumRay[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        return sumRay;
    }
}
