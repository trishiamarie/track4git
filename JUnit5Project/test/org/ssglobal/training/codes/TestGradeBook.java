package org.ssglobal.training.codes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestGradeBook {
	
	private GradeBook1 gb;
	
	@BeforeEach
	public void setup() {
		gb = new GradeBook1();
		
	}
	
	//SUNNY DAY
	
	//TESTING WITH SINGLE PARAMETER
	
	@ParameterizedTest // pag may parameter
	@ValueSource(doubles = {95.5, 90.5, 70.5, 50.6, 68.6}) // if array ganto
	// pag may ibang set of grades pwede, ibang method nalang
	public void testAddFiveGrades1(double testData) {
		gb.addGrade(testData); //void kaya ganito
		gb.printGrades();
	}
	
	@ParameterizedTest // pag may parameter
	@ValueSource(doubles = {40.5, 30.5, 70.5, 25.6, 50.6})
	public void testAddFiveGrades2(double testData) {
		gb.addGrade(testData); 
		gb.printGrades();
	}
	
	@ParameterizedTest // pag may parameter
	@ValueSource(doubles = {95.5, 90.5, 70.5, 50.6, 68.6, 
							95.5, 90.2, 76.6, 92.4, 96.1}) // if array ganto
	public void testAddTenGrades(double testData) {
		gb.addGrade(testData); //void kaya ganito
		gb.printGrades();
	}
	
	
	@ParameterizedTest
	@ValueSource(doubles = {95.5, 90.5, 70.5, 50.6, 68.6})
	public void testDeleteGrade1(double testData) {
		gb.addGrade(testData); //void kaya ganito
		gb.deleteGrade(testData);
		gb.printGrades();
		
	}
	

	@AfterEach
	public void teardown() {
		gb = null;
	}

}
