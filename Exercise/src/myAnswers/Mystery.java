package myAnswers;

public class Mystery {
	protected Mystery (int m) {//System.out.println("adad");
		
	}
 
  private static class MysteryHolder { 
     private final static Mystery INSTANCE = new Mystery(3);
  }
  public static Mystery getInstance() {
	  System.out.println("adad1mmm");
     Mystery ms = MysteryHolder.INSTANCE;
     return ms;
  }
}
