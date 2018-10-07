package DualMatix;

import java.util.Scanner;

import matrix.SquareMatrix;

public class Sum {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("nhập kích cỡ hai ma trận: ");
        int size = sc.nextInt();
        int[][] arr1 = matrix(size);
        SquareMatrix.print(arr1);
        int[][] arr2 = matrix(size);
        SquareMatrix.print(arr2);
        System.out.println("tổng 2 ma trận: ");
        SquareMatrix.print(SquareMatrix.sum(arr1, arr2));
    }

    public static int[][] matrix(int size) {
        System.out.println("\n" + "ma trận : ");
        int[][] arr2 = new int[size][size];
        for (int i = 0; i < arr2.length; i++) {
            System.out.println("\n" + "hàng: " + i);
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print("nhập ô " + j + ": ");
                arr2[i][j] = sc.nextInt();
                System.out.println();
            }
        }
        System.out.println();
        return arr2;
    }
}
