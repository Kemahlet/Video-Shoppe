package business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.Date;

public class Database {
	private Connection connection = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public void connection() throws Exception {
		connection = DriverManager.getConnection("jdbc:mysql://localhost/video_shoppe?user=root&password=root");
	}
	
	public ResultSet getEmployeeInformation(String ID) throws Exception {
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM employee WHERE EMPLOYEEID = " + ID + ";");
			return resultSet;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	public String getEmployeePassword(String ID) throws Exception {
		try {
			connection();
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
	
	public boolean checkIfManager(String ID) throws Exception {
		try {
			connection();
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
	
	public ResultSet getCustomerInformation (String ID) throws Exception
	{
		try
		{
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT * FROM customer WHERE CUSTOMERID = " + ID + ";");
			return resultSet;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	public String getCustomerName(String ID) throws Exception
	{
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT NAME FROM customer WHERE CUSTOMERID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("NAME");
			else
				return null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	public String getCustomerDriverLicense(String ID) throws Exception
	{
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT DRIVER_LICENSE FROM customer WHERE CUSTOMERID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("DRIVER_LICENSE");
			else
				return null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
		
	}
	
	public Date getCustomerDateOfBirth(String ID) throws Exception
	{
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT DATE_OF_BIRTH FROM customer WHERE CUSTOMERID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getDate("DATE_OF_BIRTH");
			else
				return null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	public String getCardNumber(String ID) throws Exception
	{
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT CARD_NUMBER FROM customer WHERE CUSTOMERID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("CARD_NUMBER");
			else
				return null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	public String getAddress(String ID) throws Exception
	{
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT ADDRESS FROM customer WHERE CUSTOMERID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("ADDRESS");
			else
				return null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	public String getEmail(String ID) throws Exception
	{
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT EMAIL FROM customer WHERE CUSTOMERID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("EMAIL");
			else
				return null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
			close();
		}
	}
	
	public String getOutstandingRentals(String ID) throws Exception
	{
		try {
			connection();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT OUTSTANDING_RENTALS FROM customer WHERE CUSTOMERID = " + ID + ";");
			if (resultSet.next())
				return resultSet.getString("OUTSTANDING_RENTALS");
			else
				return null;
		}
		catch (Exception e) 
		{
			throw e;
		} 
		finally 
		{
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