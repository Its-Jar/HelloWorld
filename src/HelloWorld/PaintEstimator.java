package HelloWorld;


import java.util.Scanner;
import java.lang.Math;

	public class PaintEstimator {
	   public static void main(String[] args) {
	      try (Scanner scnr = new Scanner(System.in)) {
			double wallHeight;
			  double wallWidth;
			  double wallArea;
			  double paintNeeded;
			  
			  System.out.println("Enter wall height (feet):");
			  wallHeight = scnr.nextDouble();
			  System.out.println("Enter wall width (feet):");
			  wallWidth = scnr.nextDouble();
			  
			  wallArea = (wallHeight * wallWidth);
			  System.out.println("Wall area: " + wallArea + " square feet");
			  paintNeeded = (wallArea / 350);
			  System.out.println("Paint needed: " + paintNeeded + " gallons");
			  
			  System.out.println("Cans needed: " + Math.round(paintNeeded) + " can(s)");
		}
	   }
	}
