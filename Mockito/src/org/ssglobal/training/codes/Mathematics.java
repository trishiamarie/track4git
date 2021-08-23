package org.ssglobal.training.codes;

public class Mathematics { //injectables
	
	private Divide divide;
	
	public Mathematics(Divide divide) {
		this.divide = divide;
	}
	
	public double complexOp(int x, int y) {
		double formula = (2000.00/divide.div(x, y)) - divide.div(x, y);
								//managed thru mocking
						// 2000/1 - 1 = 1999
		return formula;
	}

}
//1. problematic
//2. walang error but kung ano yung mali kay divide, mali rin kay math
//3. test and mock (para maayos yung may error, magmock)
