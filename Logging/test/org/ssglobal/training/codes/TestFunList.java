package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestFunList {
	
	private FunList funlist;
	
	@BeforeEach
	public void setup() {
		this.funlist = new FunList("test/config/myfile.txt");
	}
	
	@Test
	public void testEnableDisplay() {
		funlist.enableDisplay();
		
	}
	
	@Test
	public void testShowLines() {
		funlist.showLines();
		
	}
	
	@AfterEach
	public void teardown() {
		funlist = null;
	}

}
