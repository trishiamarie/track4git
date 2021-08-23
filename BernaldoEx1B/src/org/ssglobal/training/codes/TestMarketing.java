package org.ssglobal.training.codes;


public class TestMarketing {

	
	public boolean discountPrice = false;
	public boolean msrp = true;
	public boolean belowcost = false;
	
	public char airCond = 'Y';
	public char pwrSteer = 'Y';
	public char pwrBrakes = 'Y';
	public char sunRoof = 'Y';
	
	public String color = "White";
	public String interior = "Cloth";
	public String engine = "8 Cylinders";
	
		public static void displayInfos() {
			
			TestMarketing test = new TestMarketing();
			test.updateColors("Red");
			System.out.println("MSRP: " + test.msrp);
			System.out.println("airCond: " + test.airCond);
			System.out.println("pwrSteer: " + test.pwrSteer);
			System.out.println("pwrBrakes: " + test.pwrBrakes);
		}
	
		void updateColors(String newColor) {
			
			TestMarketing test = new TestMarketing();
			test.color = newColor;
			System.out.print("The new color is:" + test.color);
		}
	
}
