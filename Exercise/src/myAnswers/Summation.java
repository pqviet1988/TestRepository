package myAnswers;

/*
 * Program to use in Practical 1 for practice with some of 
 * Eclipse's debugging features - BUGGY VERSION!
 * 
 * The program is meant to sum the natural numbers in a
 * fixed range
 * 
 * Author: Malcolm Corney
 * Version: 1.1
 * 
 */

public class Summation {

	/* Constants defining the bounds of the range to be summed */
	private static final short START = 1;
	private static final short END = 1000; // First try 5, then 1000;

	/* Variable to hold the sum of numbers from START to END, inclusive */
	private int total;

	/* Constructor to initialize instance variable */
	public Summation() {
		total = 0;
	}

	/* Method to calculate the sum */
	public void add() {
		for (short index = START; index < END; index++) {
			
			total += index;
			/*
			if (total < 0)
			{
				total -= index;
				System.out.println(""+total);
			}*/
		}
	}

	/* Method to print the result to the screen */
	public void displayResult() {
		System.out.printf("The sum of the integers from %d to %d is %d.%n",
				START, END, total);
	}

	/* Main program */
	
	public static void main(String[] args) {
		Summation sum = new Summation();
		sum.add();
		sum.displayResult();
	}
}


