package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

public class TestCountry {
	
	private Country c;
	
	@BeforeEach
	public void setup() {
		c = new Country();
		
	}
	//SUNNY DAY 
	@ParameterizedTest
	@EnumSource(value = Country.Choice.class) //with Enum parameter
	public void testGreetPerCountry(Country.Choice option) {
		String actual = c.sayGreet(option);
		Assertions.assertNotNull(actual);
		
	}
	
	//RAINY DAY
	@ParameterizedTest
	@EnumSource(value =Country.Choice.class)// reflection API lang
	public void testGreetPerCountryRainy(Country.Choice option) { //if wala sa choice
		String actual = c.sayGreet(option);
		Assertions.assertNull(actual);
		
	}
	
	
	@AfterEach
	public void teardown() {
		c = null;
	}
}

	
	//Structures of test data (POJO, enum, array)
	//sometimes u need to create your own data




