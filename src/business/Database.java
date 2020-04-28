package business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.sql.Date;

public class Database {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public void connect() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost/video_shoppe?user=root&password=root");
	}
	
	// Queries the database to grab all information about an employee
	public ResultSet getEmployeeInformation(String ID) throws Exception {
		try {
			connect();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM employee WHERE EMPLOYEEID = " + ID + ";");
			return resultSet;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	// Queries the database to fetch an employee's password
	public String getEmployeePassword(String ID) throws Exception {
		try {
			connect();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT PASSWORD FROM employee WHERE EMPLOYEEID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("PASSWORD");
			else
				return null;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	// Queries the database to check if the employee is a manager
	public boolean checkIfManager(String ID) throws Exception {
		try {
			connect();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT IS_MANAGER FROM employee WHERE EMPLOYEEID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getBoolean("IS_MANAGER");
			else
				return false;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	// Queries the database to grab the name of an employee
	public String getEmployeeName(String ID) throws Exception {
		try {
			connect();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT NAME FROM employee WHERE EMPLOYEEID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("NAME");
			else
				return null;
		} catch(Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	public int getHoursWorked(String ID) throws Exception {
		try {
			connect();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT HOURS_WORKED FROM employee WHERE EMPLOYEEID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getInt("HOURS_WORKED");
			else
				return 0;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			
			if (statement != null) {
				statement.close();
			}
			
			if (connection != null) {
				connection.close();
			}
		} catch (Exception e) {
			
		}
	}
}
