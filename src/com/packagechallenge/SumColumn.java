package com.packagechallenge;

public class SumColumn implements Command {
    @Override
    public void execute(int[][] myArray) {
        for(int i = 0 ; i < 6 ; i++) {
            int sum = 0;
            for(int j = 0 ; j < 4 ; j++) {
                sum = sum + myArray[j][i];
            }
            System.out.println("The sum of column "+ (i+1) + " = " + sum);
        }
    }
}
