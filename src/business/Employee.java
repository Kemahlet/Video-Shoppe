package business;

public class Employee {
	public String employeeID;
	private String lastName;
	private String firstName;
	private char middleInitial;
	private String address;
	private String phone;
	private int hoursWorked;
	private String password;
	
	public Employee() {
		
	}
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	
	public void updateAddress(String newAddress) {
		address = newAddress;
	}
	
	public void updatePhone(String newPhone) {
		phone = newPhone;
	}
}
