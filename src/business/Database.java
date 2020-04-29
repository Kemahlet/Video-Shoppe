package business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; 
import java.sql.Statement;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;

import java.sql.Date;

public class Database {
	private Connection connection = null;
	private Statement statement = null;
	private ResultSet resultSet = null;
	private Shell shell = new Shell();
	
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
	
	public ResultSet getCustomerInformation (String ID) throws Exception
	{
		try
		{
			connect();
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
			connect();
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
			connect();
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
			connect();
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
			connect();
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
			connect();
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
			connect();
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
			connect();
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
	
	public void returnDVD(String barcode) throws Exception {
		try {
			connect();
			int numberInStock = 0;
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT NUMBER_IN_STOCK FROM dvd WHERE BARCODE = " + barcode + ";");
			if (resultSet.next()) {
				numberInStock = resultSet.getInt("NUMBER_IN_STOCK");
				numberInStock++;
				statement.executeQuery("UPDATE dvd SET NUMBER_IN_STOCK = " + Integer.toString(numberInStock) + " WHERE BARCODE = " + barcode + ";");
				MessageBox dialog = new MessageBox(shell, SWT.OK);
				dialog.setText("Confirmation");
				dialog.setText("DVD succesfully returned!");
			}
			else {
				MessageBox dialog = new MessageBox(shell, SWT.ERROR | SWT.OK);
				dialog.setText("Error");
				dialog.setMessage("DVD not found!");
			}
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}
	
	/*public String[] getDvdInformation(String searchBy, String keyword) throws Exception {
		try {
			connect();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("SELECT TITLE, YEAR, GENRE, ACTORS, DIRECTOR, AGE_RATING FROM dvd WHERE " + searchBy + " = " + keyword + ";");
			if (resultSet.next()) {
				String[] results = new String[5];
				results[0] = resultSet.getString("TITLE");
				results[1] = resultSet.getString("")
			}
			else
				return null;
		} catch (Exception e) {
			throw e;
		} finally {
			close();
		}
	}*/
	
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