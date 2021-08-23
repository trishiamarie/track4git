package org.ssglobal.training.codes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDao { //SQL ITOOOOOOOOO
	
	private Connection conn;
	
	public void openConnect(String username, String password, String url) {
		try {
			conn = DriverManager.getConnection(null, null, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void closeConnect() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	// if wala pa database, mock mo lang para gumana
	public List<Employee> selectAllEmployees() {
		List<Employee> employees = new ArrayList<>();
		try (Statement stmt = conn.createStatement();) {// try with resource lgi
			ResultSet dataset = stmt.executeQuery("select * from employee");
			while(dataset.next()) {
				Employee rec = new Employee();
				rec.setFirstName(dataset.getString(0));
				rec.setLastName(dataset.getString(1));
				rec.setSalary(dataset.getDouble(2));
				employees.add(rec);
			
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}

}
