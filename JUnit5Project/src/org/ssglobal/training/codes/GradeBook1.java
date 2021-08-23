package org.ssglobal.training.codes;

import java.util.Arrays;

public class GradeBook1 {
	
	private double grades[] = new double[0];
	
	// customize set method
	public void addGrade(double grade) {
		double[] temp = new double[grades.length + 1];
		System.arraycopy(grades, 0, temp, 0, grades.length);	
		temp[grades.length] = grade;
		//pointer arithmetic
		grades = temp;
		temp = null; // optional for higher java version	
} 

	public void deleteGrade(double grade) {
		int counter = 0;
		// count all grades occurences
		//typical for loop
		for (double data : grades) {
			if (data == grade) {
				counter++;
			}
		}
		
		// create a new temp grades minus counter grades
		double[] temp = new double[grades.length - counter];
		
		// remove all the grade
		int i = 0;
		for (double data : grades) {
			if (!(data == grade)) {
				temp[i] = data;
				i++;
			}
		}
		
		grades = null;
		grades = temp;
		temp = null;
	
	}
	
	public void printGrades() {
		Arrays.stream(grades).forEach((grade) -> {
			System.out.println(grade);
		});
		
	}
	
	

}
