package business;

public class Employee {
	private String employeeID;
	private String lastName;
	private String firstName;
	private char middleInitial;
	private String address;
	private String phone;
	private int hoursWorked;
	private String password;
	
	public Employee() {
		
	}
	
	public String getEmployeeID() {
		return employeeID;
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public String getName() {
		String name = firstName + " " + lastName;
		return name;
	}
	
	public String getFullName() {
		String fullName = lastName + ", " + firstName + " " + middleInitial;
		return fullName;
	}
	
	public int getHourWorked() {
		return hoursWorked;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void updateAddress(String newAddress) {
		address = newAddress;
	}
	
	public void updatePhone(String newPhone) {
		phone = newPhone;
	}
}
