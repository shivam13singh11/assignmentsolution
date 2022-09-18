package com.example.asmlinterviewchallenge;

public class RecursiveTraversalSolution {
    public static void printTravesalOfArray(int inputMatrix[][], int top, int bottom,
                                            int left, int right) {
        // Base condition
        if (inputMatrix == null || inputMatrix.length == 0 || left > right) {
            return;
        }

        // Printing the top row
        for (int i = left; i <= right; i++) {
            System.out.print(inputMatrix[top][i] + " ");
        }
        top++;

        if (top > bottom) {
            return;
        }
        // Printing the rightmost column
        for (int i = top; i <= bottom; i++) {
            System.out.print(inputMatrix[i][right] + " ");
        }
        right--;

        if (left > right) {
            return;
        }
        // Printing the bottom row
        for (int i = right; i >= left; i--) {
            System.out.print(inputMatrix[bottom][i] + " ");
        }
        bottom--;

        if (top > bottom) {
            return;
        }
        // Printing the leftmost column
        for (int i = bottom; i >= top; i--) {
            System.out.print(inputMatrix[i][left] + " ");
        }
        left++;

        printTravesalOfArray(inputMatrix, top, bottom, left, right);
    }

    public static void main(String[] args) {
        int[][] mat =
                {
                        {1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}
                };

        int top = 0, bottom = mat.length - 1;
        int left = 0, right = mat[0].length - 1;

        printTravesalOfArray(mat, top, bottom, left, right);
    }
}
