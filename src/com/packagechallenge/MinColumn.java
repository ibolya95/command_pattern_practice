package com.packagechallenge;

public class MinColumn implements Command {
    @Override
    public void execute(int[][] myArray) {
        for(int i = 0 ; i < 6 ; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < 4 ; j++) {
                if(myArray[j][i] < min) {
                    min = myArray[j][i];
                }
            }
            System.out.println("The minimum value of the column " + (i+1) + " is: " + min);
        }
    }
}
