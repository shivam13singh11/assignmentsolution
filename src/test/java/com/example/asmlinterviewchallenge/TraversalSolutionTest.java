package com.example.asmlinterviewchallenge;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TraversalSolutionTest {

    private List<Integer> expectedOrder = new ArrayList<>();


    @BeforeEach
    public void populateExpectedList() {

        expectedOrder = List.of(1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10);
    }


    @Test
    public void testIterativeSolution() {
        IterativeTraversalSolution spiralTraversalSolution = new IterativeTraversalSolution();
        int inputArray[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        List<Integer> spiralOrderSolution = spiralTraversalSolution.spiralPrintBruteForceSolution(inputArray);
        assertArrayEquals(expectedOrder.toArray(), spiralOrderSolution.toArray());
    }


}