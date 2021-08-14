package com.packagechallenge;

public class MaxRow implements Command {
    @Override
    public void execute(int[][] myArray) {
        for(int i = 0 ; i < 4 ; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = 0 ; j < 6 ; j++) {
                if(myArray[i][j] > max) {
                    max = myArray[i][j];
                }
            }
            System.out.println("The maximum value of the row " + (i+1) + " is: " + max);
        }
    }
}
