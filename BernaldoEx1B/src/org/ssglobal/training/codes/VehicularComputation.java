package org.ssglobal.training.codes;


public class VehicularComputation {

		
		public int totVehicles = 1;
		public int vanTotal = 18;
		public int sedanTotal = 20;
		public int truckTotal = 27;
		public int totalSUV = 35;
		public float vanPct = 1.1F;
		public float sedanPct = 1.1F;
		public double truckPct = 2.5;
		public float suvPct = 2.5F;
		
		
		public int vehicleAccum() {
			totVehicles = vanTotal + sedanTotal + truckTotal 
					 + totalSUV;
			System.out.println(totVehicles);
			return totVehicles;
		
		}
		
		public void percentVehicle(float vanPct, float sedanPct, 
										double truckPct, float suvPct) {
			
			vanPct = vanTotal / totVehicles;
			sedanPct = sedanTotal / totVehicles;
			truckPct = truckTotal / totVehicles;
			suvPct = totalSUV / totVehicles;
			
			System.out.println("The van percent is: " + vanPct);
			System.out.println("The sedan percent is: " + sedanPct);
			System.out.println("The truck percent is: " + truckPct);
			System.out.println("The SUV percent is: " + suvPct);
		
		
		}
		
}
