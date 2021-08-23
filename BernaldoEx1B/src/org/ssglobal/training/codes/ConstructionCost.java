package org.ssglobal.training.codes;


public class ConstructionCost  {
	

		public double length = 200, width = 300, baseCost = 250000, cost = 2000000, 
							costPerSqrFt;
		public byte floorNumber = 3;
		
	
		public double computeCost() {
			
			
			costPerSqrFt  = (cost - baseCost) / (width * length * floorNumber);
			
			System.out.println("The cost per square foot of floor space for a "
									+ "200 by 300 building" );
			
			System.out.println("of 3 stories with a base cost of 250000 and a "
		              + "total cost of 2000000 is:"
		              		+ costPerSqrFt);
			
			return costPerSqrFt;
			
			
	
		}

}
