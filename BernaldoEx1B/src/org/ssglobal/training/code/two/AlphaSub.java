package org.ssglobal.training.code.two;

public class AlphaSub  {
	
			
			public void printRadiationValues() {
			
			Gamma test = new Gamma();
			
			System.out.println("radRate1: " + test.radRate1);
			System.out.println("radRate2: " + test.radRate2);
			System.out.println("radRate3: " + test.radRate3);
			System.out.println("cancerRate1: " + test.cancerRate1);
			System.out.println("cancerRate1: " + test.cancerRate2);
			System.out.println("cancerRate1: " + test.cancerRate3);
			
			test.totalCancerRates();
			
	}
}
			
			
		