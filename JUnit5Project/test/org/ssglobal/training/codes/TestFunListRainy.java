package org.ssglobal.training.codes;


import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestFunListRainy { //RAINY DAY TESTING 

	FunList funList;
	
	//Step 1:
	@BeforeEach 
	public void setup() {
		System.out.println("initialization"); 
		funList = new FunList("test/config/myfile.txt");
	}
	
	//Step 2:
	@Test 
	public void testCountEqualsValueRainy() { 
		long unexpected = 6;
		long actual = funList.countWords(); 
		Assertions.assertNotEquals(unexpected, actual); 
	
	}
	
	
	@Test
	public void testCountNonNegativeFile1Rainy() {
		long count2 = funList.countWords();
		boolean isNonNegative = count2 <= 0;
		Assertions.assertFalse(isNonNegative);
		
	}
	
	@Test
	public void testCountNonNegativeFile2Rainy() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long unexpected = 100;
		long actual = funList.countWords();
		Assertions.assertNotEquals(unexpected, actual);
		funList = null;
	}
	
	@Test
	public void testContentListNotNullRainy() {
		List<String> temp = funList.getContentList();
		Assertions.assertNull(temp); //straighforward
		//pag walang expected na value, false talaga sa rainy
		
	}
	
	@Test
	public void testSameContentArrayRainy() {
		Assertions.assertThrows(ClassCastException.class , ()->{
			String[] unexpected = {"The fox jumps over the window."};
			String[] actual = funList.getContentArray();
			Assertions.assertNotSame(unexpected, actual);
		});
		
	}
	
	@Test
	public void testSameContentArrayRainy2() {
		String[] unexpected = {"The fox jumps over the window."};
		String[] actual = funList.getContentArray2();
		Assertions.assertNotSame(unexpected, actual); 
		
	}
	
	@Test
	public void testSameContentArraysValueRainy() {
		String[] expected = {"The fox jumps over the window..."};
		String[] actual = funList.getContentArray2();
		Assertions.assertNotEquals(expected, actual);
		
	}
	
	//Step 3:
	@AfterEach 
	public void teardown() {
		System.out.println("destroyer"); 
		funList = null;
		
	}
}
