package org.ssglobal.training.codes;

import java.util.Arrays;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;


public class TestMathematics {
	
	private Mathematics m;
	
	@BeforeEach
	public void setup() {
		m = new Mathematics();
		
	}
	
	//Sunny Day
	
	@ParameterizedTest
	@MethodSource("mathProvider") //shortcut ito
	//@MethodSource(value = {"mathProvider"})
	 // more than 1 test data (naka-array)
	public void testDivideCorrectData(int[] testdata) {
		
			Assertions.assertDoesNotThrow(() -> { // no surround try-catch
					
					int actual = m.divide(testdata[0], testdata[1]);
					Assertions.assertEquals(testdata[2], actual);
			});
	}
	
	//Rainy Day
	@ParameterizedTest
	@MethodSource("mathProvider2") 
	public void testDivideIncorrectData(int[] testdata) {
		
			Assertions.assertThrows(ArithmeticException.class, () -> { // no surround try-catch
					
					int actual = m.divide(testdata[0], testdata[1]);
					Assertions.assertNotEquals(testdata[2], actual);
			});
	}
	

	@AfterEach
	public void teardown() {
		m = null;
	}
	
	
	//Custom Test Data
	// always static (sunny day)
	private static Stream<int[]> mathProvider() {	 // x,  y, q
		return Stream.of(new int[]{1, 2, 0}, new int[] {5, 2, 2}, 
					     new int[] {10, 2, 5});
	}
	
	//(rainy day)
	private static Stream<int[]> mathProvider2() {	 // x,  y, q
		return Stream.of(new int[]{1, 2, 1}, new int[] {5, 0, 0}, 
					     new int[] {10, 2, -5});
	}

}

//no collection lists, array is always used in testing