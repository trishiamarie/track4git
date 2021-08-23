package org.ssglobal.training.codes;

import java.util.Scanner;

public class Paint {

		
		final int COVERAGE = 350;
		int length, width, height;
		double totalSqFt, paintNeeded;
	
		
		public void computeGallonsPaint() {
			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.print("Enter length:");
			int length = scanner.nextInt();
			
			System.out.print("Enter width:");
			int width = scanner.nextInt();
			
			System.out.print("Enter height:");
			int height = scanner.nextInt();
			
			totalSqFt = ((2 * length * width) + (2 * length * height) + 
					(2 * height * width)); 
			
			paintNeeded = totalSqFt / COVERAGE;
			
			System.out.println("Paint needed in gallons:" + paintNeeded);
			
			scanner.close();
			
	
	}

}
