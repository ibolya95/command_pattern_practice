package com.packagechallenge;

public class AverageRow implements Command {
    @Override
    public void execute(int[][] myArray) {
        for(int i = 0 ; i < 4 ; i++) {
            double average = 0;
            int sum = 0;
            for (int j = 0 ; j < 6 ; j++) {
                sum = sum + myArray[i][j];
                average = Double.valueOf(sum) / 6;
            }
            System.out.println("The average of the row " + (i+1) +  " is: " + average);
        }
    }
}
