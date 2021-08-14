package com.packagechallenge;

public class SumRow implements Command{

    @Override
    public void execute(int[][] myArray) {
        for(int i = 0 ; i < 4 ; i++) {
            int sum = 0;
            for(int j = 0 ; j < 6 ; j++) {
                sum = sum + myArray[i][j];
            }
            System.out.println("The sum of row "+ (i+1) + " = " + sum);
        }
    }
}
