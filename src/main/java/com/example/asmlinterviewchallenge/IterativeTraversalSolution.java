package com.example.asmlinterviewchallenge;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class IterativeTraversalSolution {

    public List<Integer> spiralPrintBruteForceSolution(int[][] matrix) {

        //Creating the outputList
        List<Integer> spiralList = new ArrayList<>();

        //Initializing the row and column iterators.
        int i, rowIterator = 0, colIterator = 0;

        //Setting the max rowCount & column count.
        var rowCount = matrix.length;
        var colCount = matrix[0].length;

        //Checking the base condition
        if (matrix == null || matrix.length == 0) {
            return null;
        }

        while (rowIterator < rowCount && colIterator < colCount) {

            //Iterating over the top row from left to right
            for (i = colIterator; i < colCount; i++) {
                spiralList.add(matrix[rowIterator][i]);
            }
            rowIterator++;

            //Iterating over rightmost column from top to bottom
            for (i = rowIterator; i < rowCount; i++) {
                spiralList.add(matrix[i][colCount - 1]);
            }
            colCount--;

            //Iterating over the bottom row from right to left
            if (rowIterator < rowCount) {
                for (i = colCount - 1; i >= colIterator; i--) {
                    spiralList.add(matrix[rowCount - 1][i]);
                }
                rowCount--;
            }

            //Iterating over the leftmost column from bottom to top
            if (colIterator < colCount) {
                for (i = rowCount - 1; i >= rowIterator; i--) {
                    spiralList.add(matrix[i][colIterator]);
                }
                colIterator++;
            }
        }
        return spiralList;
    }


}
