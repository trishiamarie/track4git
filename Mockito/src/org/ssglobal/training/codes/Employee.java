package org.ssglobal.training.codes;

public class Employee {
	
	private String firstName;
	private String lastName;
	private Double salary;
	
	public Employee() {
		firstName = "";
	}
	
	
	
	public Employee(String firstName, String lastName, Double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {

		return super.toString();
	}
	

}
