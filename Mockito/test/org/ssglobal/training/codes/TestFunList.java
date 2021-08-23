package org.ssglobal.training.codes;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when; //BDDMockito dapat ha
import static org.mockito.Mockito.doReturn; // dont use it
import static org.mockito.Mockito.doNothing;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TestFunList {
	
	@Mock
	private FunList mockedFunList;
	
	@Mock
	private List<String> arrayList;
	
	//bawal din private
	@Test
	public void testProcessStr() {
		// Mocking Area - Arrange : pwede marami
		//1 input, 1 assumption
		when(mockedFunList.processStr("str1", "str2")).thenReturn("str1 str2");
		
	
		//SUT : Act
		String actual = mockedFunList.processStr("str1", "str2");
		String expected = "str1 str2";
		Assertions.assertEquals(expected, actual);
	}
	
	@Test
	public void testRetrieveDataList() {
		
		when(arrayList.get(anyInt())).thenReturn("Anna", "Lorna", "Fe");
		
		String actual1 = arrayList.get(1);
		String expected = "Anna";
		Assertions.assertEquals(expected, actual1);
		String actual2 = arrayList.get(1);
		String expected2 = "Lorna";
		Assertions.assertEquals(expected2, actual2);
		String actual3 = arrayList.get(10); 
		//kahit 10 ito, yung last parin yung mageget
		String expected3 = "Fe";
		Assertions.assertEquals(expected3, actual3);
	}
	
	@Disabled
	@Test
	public void testRetrieveDataList2() {
		
		//dont use this
		// ginagamit lang yang doReturn() - pag spying
		//when().thenReturn() lagi
		doReturn(100).when(arrayList.get(anyInt()));
		Assertions.assertEquals(100, arrayList.get(1));
	}
	
	
	
	//Dependencies
	@Test
	public void testGetEmpty() {
		
		when(arrayList.get(anyInt())).thenReturn("Anna");
		when(arrayList.isEmpty()).thenReturn(false); //boolean
		
		Assertions.assertEquals(false, arrayList.isEmpty());
		Assertions.assertEquals("Anna", arrayList.get(1));
	}
	
	@Disabled
	@Test
	public void testAddAnywhereWhateverStr() { //pag may void, ayaw parin
		//pag ayaw ng donothing(), dothrow().when()....
		
		doNothing().when(arrayList).add(anyInt(), isA(String.class));
		arrayList.add(10, "Anna");
		//verify
		verify(arrayList, times(2)).add(10, "Anna");
	
	}
	

	//when().thenThrow() -- mocking and exception testing pwede
}
