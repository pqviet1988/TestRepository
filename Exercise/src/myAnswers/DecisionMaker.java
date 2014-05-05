package myAnswers;

/* Template for the "Decision Maker" exercise */


public class DecisionMaker {

	/* Put your "decision" method here, assuming the parameters are
	 * the number of months required to complete the job and the
	 * perceived level of difficulty, on a 1 to 10 scale
	 */

	/* Decision for the project */
	private enum Decision {ACCEPT, DECLINE, DISCUSS};
	
	/* project duration threshold for being long project */
	private static int THRESHOLD_DURATION = 3;
	
	/* Difficulty threshold for being hard project */
	private static int THRESHOLD_DIFFICULTY = 7;
	
	/* Desion function with project duration and difficulty as the input */
	public static Decision decision (int month, int difficulty)
	{
		if (month > THRESHOLD_DURATION && difficulty < THRESHOLD_DIFFICULTY)
			return Decision.ACCEPT;
		else if (month <= THRESHOLD_DURATION && difficulty >= THRESHOLD_DIFFICULTY)
			return Decision.DECLINE;
		else
			return Decision.DISCUSS;
	
	}
	
	/* Main program that tests the "decision" function */
	public static void main(String[] args) {
		
		/* Project 1: Easy with plenty of time */
		//System.out.println("You should " + decision(12, 1) + " Project 1");
		/* Project 2: Hard with very little time */
		//System.out.println("You should " + decision(1, 9) + " Project 2");
		/* Project 3: Easy but with little time */
		//System.out.println("You should " + decision(2, 5) + " Project 3");
		/* Project 4: Hard but with lots of time */
		//System.out.println("You should " + decision(12, 8) + " Project 4");
		System.out.println("aaa");
		Mystery mys = new Mystery(3);
		System.out.println("aaa1");
		
		
	}

}
