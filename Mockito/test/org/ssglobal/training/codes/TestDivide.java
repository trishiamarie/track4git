package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when; 
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class TestDivide {
	
	@Mock
	private Divide divide;
	
	@InjectMocks
	private Mathematics math;
	
	@BeforeEach
	public void setup() {
		math = new Mathematics(divide);
		
	}
	
	@Test
	public void testComplexOp() {
		
		//create a mock - Arrange
		when(divide.div(anyInt(), isA (Integer.class))).thenReturn(1);
		
		//SUT - Act
		double actual = math.complexOp(10, 10);
		Assertions.assertEquals(1999.00, actual);
		
		//Verification - Assert
		verify(divide, times(2)).div(10, 10);
		
	}
	
	@AfterEach
	public void teardown() {
		math = null;
	}
	
	
}
