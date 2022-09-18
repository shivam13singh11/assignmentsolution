package com.example.asmlinterviewchallenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class AsmlInterviewChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(AsmlInterviewChallengeApplication.class, args);
        int[][] inputMatrix =
                {
                        {1, 2, 3, 4, 5},
                        {16, 17, 18, 19, 6},
                        {15, 24, 25, 20, 7},
                        {14, 23, 22, 21, 8},
                        {13, 12, 11, 10, 9}
                };

        int top = 0, bottom = inputMatrix.length - 1;
        int left = 0, right = inputMatrix[0].length - 1;
       RecursiveTraversalSolution.printTravesalOfArray(inputMatrix, top, bottom, left, right);

    }

}
