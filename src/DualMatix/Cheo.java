package DualMatix;


import java.util.Scanner;

import matrix.SquareMatrix;

public class Cheo {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("nhập kích cỡ ma trận: ");
        int size = sc.nextInt();
        int[][] arr = Sum.matrix(size);
        SquareMatrix.print(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][i];
        }
        System.out.println("tổng đường chéo 1 là: " + sum);
        sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[arr.length - i - 1][i];
        }
        System.out.println("tổng đường chép 2 là: " + sum);


    }

}
