package business;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement;
import java.util.Date;

public class Database {
	private Connection connect = null;
	private Statement statement = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	
	public void connect() throws Exception {
		connect = DriverManager.getConnection("jdbc:mysql://localhost/video_shoppe?user=root&password=root");
	}
	
	public ResultSet getEmployeeInformation(String ID) throws Exception {
		try {
			connect();
			statement = connect.createStatement();
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
			connect();
			statement = connect.createStatement();
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
			connect();
			statement = connect.createStatement();
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
	
	private void close() {
		try {
			if (resultSet != null) {
				resultSet.close();
			}
			
			if (statement != null) {
				statement.close();
			}
			
			if (connect != null) {
				connect.close();
			}
		} catch (Exception e) {
			
		}
	}
}
