package org.ssglobal.training.codes;

import org.junit.jupiter.api.Assertions;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test; // ayan yung imported na package for 5
// you can apply static import kay assertions

//JUnit 5
//Reflection API Annotation also
//No Porgramming ( no if else and loop) : always USE ASSERTIONS for testing only
//REGRESSION TESTING - simultaneous
//ONE CLASS PER TEST CASE TRANSACTIONS
//Don't use BeforeAll/AfterAll : ayaw ni sir!!!

public class TestFunList { //SUNNY DAY TESTING 
	
	private FunList funList;
	//private Word word;
	
	//One setup per test case
	// Isang beses lang tatawagin ang before all - hindi lalabas lahat ng output
	//always static
	/*@BeforeAll
	public static void setupAll() {
		System.out.println("initialization");
		funList = new FunList("test/config/myfile.txt");
	}*/
	
	//Step 1. matic initializer na ito
	@BeforeEach // pag iba iba yung data use beforeeach
	public void setup() {
		System.out.println("initialization"); // remove mo na ito
		funList = new FunList("test/config/myfile.txt");
	}
	

	//Step 2. test methods ( execution)
	//Testing on count returning a value
	 // to disable test methods
	@Test 
	public void testCountEqualsValue() { //description of the evidence
		// do not program here
		long expected = 6; // expected
		long actual = funList.countWords(); //actual
		Assertions.assertEquals(expected, actual); // verification
		
	}
	
	//ONE ASSERT PER METHOD
	@Disabled
	@Test
	public void testCountNonNegativeFile1() {
		long count2 = funList.countWords();
		boolean isNonNegative = count2 > 0; //conditional expression
		Assertions.assertTrue(isNonNegative); 
		// wag mag double equals ha
		// user assertTrue for inequality
		//assertFalse - used for rainy days
	}
	
	@Disabled
	@Test
	public void testCountNonNegativeFile2() {
		FunList funList = new FunList("test/config/myfile2.txt");
		long expected = 0;
		long actual = funList.countWords();
		Assertions.assertEquals(expected, actual); //assertFalse(rainy)
		funList = null; //always set to null bc wala ito sa teardown
	}
	
	@Disabled
	@Test
	public void testContentListNotNull() {
		List<String> temp = funList.getContentList();
		Assertions.assertNotNull(temp); //return value of the function
	}
	
	//same not/same: about memory address
	//Used for static object same address, different objects/pointer
	//Enum, constant objects or pointers pointing to one object
	
	@Disabled
	@Test
	public void testSameContentArray() { //test with exception
		Assertions.assertDoesNotThrow(()->{ //para maging failure
			String[] expected = {"The fox jumps over the window."};
			String[] actual = funList.getContentArray();
			Assertions.assertSame(expected, actual); 
		});  //supplier interface ito
		//assertNotSame -- rainy days
		//pag may (error) exception -- assertDoesNotThrow (sunny)
		// assertThrows(rainy)
	}
	
	@Disabled
	@Test
	public void testSameContentArray2() {
			String[] expected = {"The fox jumps over the window."};
			String[] actual = funList.getContentArray2();
			Assertions.assertSame(expected, actual); 
	
	}

	@Disabled
	@Test
	public void testSameContentArraysValue() {
		String[] expected = {"The fox jumps over the window."};
		String[] actual = funList.getContentArray2();
		Assertions.assertArrayEquals(expected, actual);
		// walang ArrayNotEquals() -- wala sa rainy
	}
	
	@Test
	public void testDisplay() {
		funList.showLines(); //display lang ito
	}
	
	//Testing w/ Time Constraints are used in void methods
	@Test
	public void testDisplayInSeconds() {
		Assertions.assertTimeout(Duration.ofSeconds(2), () -> { 
			funList.showLines(); //display lang ito
		}); //supplier interface ito
		
	}
	
	@Test
	public void testDisplayInMillis() {
		Assertions.assertTimeout(Duration.ofMillis(5000), () -> { 
			funList.showLines(); //display lang ito
		}); //supplier interface ito
		
	}
	
	@Test
	public void testDisplayInMinutes() {
		Assertions.assertTimeout(Duration.ofMinutes(2), () -> { 
			funList.showLines(); //display lang ito
		}); //supplier interface ito
		
	}
	
	@RepeatedTest(value = 5) // repeating methods
	public void testSameContentArraysValueRepeat( ) {
		String[] expected = {"The fox jumps over the window."};
		String[] actual = funList.getContentArray();
		Assertions.assertArrayEquals(expected, actual);
	}
	

	//Step 3. Object teardown

	@AfterEach // one tear down every after test case
	public void teardown() {
		System.out.println("destroyer"); // remove mo na ito
		funList = null;
		
	}
	
	/*@AfterAll
	public static void teardownAll() {
		System.out.println("destroyer");
		funList = null;
	}*/
	
}

//Fixtures : to initialize, manage and teardown every test 
//fail : exception testing
//Seldom use yung VOID - iwasan mo na magamittttt

//Behavioral Testing 
