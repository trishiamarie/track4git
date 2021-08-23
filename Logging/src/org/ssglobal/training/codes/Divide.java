package org.ssglobal.training.codes;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Divide {
	
	private static Logger logger = Logger.getLogger(Divide.class.getName());
	
	public Divide() {
		logger.setLevel(Level.INFO);
	}
	

	public int div(int x, int y)  throws ArithmeticException, Exception {
		logger.info("execute div x = " + x + " and y=" + y);
		
		//put logger.info before if or while loop
		// if nested if, one logger nalang, then description
		logger.info("validation: denominator should no be zero");
		if (y == 0) {
			// put logger.severe before throw new
			logger.severe("division by zero not allowed");
			throw new ArithmeticException("division by zero not allowed");
		}else {
			logger.info("exit without errors div()");
			return x/y;
		}
	
	}

}
