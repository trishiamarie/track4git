package org.ssglobal.training.code.two;

class Gamma {
	
	
	public boolean radRate1 = true, radRate2 = false, radRate3 = true;
	
	public float cancerRate1 = 0.01f, cancerRate2 = 0.02f, 
								cancerRate3 = 0.05f, totalCancerRate;
	
	
		public void totalCancerRates() {
		
		totalCancerRate = cancerRate1 + cancerRate2 + cancerRate3;
		
		System.out.println("The total cancer rate is: " + totalCancerRate);
		
		
	}

}
