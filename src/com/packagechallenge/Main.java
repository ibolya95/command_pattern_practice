package com.packagechallenge;

public class Main {

    public static void main(String[] args) {
	    int[][] myArray = {
	            {30, 15, 58, 31, 23, 64},
                {40, 10, 18, 33, 34, 49},
                {23, 40, 80, 31, 62, 74},
                {35, 14, 86, 30, 23, 77},
	    };

		SumRow sumRow = new SumRow();
		sumRow.execute(myArray);
		System.out.println("================================");
		SumColumn sumColumn = new SumColumn();
		sumColumn.execute(myArray);
		System.out.println("================================");
		MaxRow maxRow = new MaxRow();
		maxRow.execute(myArray);
		System.out.println("================================");
		MinColumn minColumn = new MinColumn();
		minColumn.execute(myArray);
		System.out.println("================================");
		AverageRow averageRow = new AverageRow();
		averageRow.execute(myArray);

    }
}
