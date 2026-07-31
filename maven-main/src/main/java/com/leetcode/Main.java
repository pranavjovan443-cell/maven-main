package com.leetcode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int n = 5;

        int[][] paths = {
                {1, 2},
                {2, 3},
                {3, 4},
                {4, 5},
                {1, 5}
        };

        int[] answer = solution.gardenNoAdj(n, paths);

        System.out.println(Arrays.toString(answer));
    }
}