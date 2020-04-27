package business;

import java.sql.Date;

public class Customer {
	private String customerID;
	private String lastName;
	private String firstName;
	private char middleInitial;
	private Date birthDate;
	private int age;
	private String address;
	private String phone;
	private String bankCard;
	private DVD[] rentals;
	
	public Customer() {
		
	}
	
	public String getCustomerID() {
		return customerID;
	}
	
	public String getCustomerName() {
		return lastName + ", " + firstName + " " + middleInitial;
	}
	
	public Date getBirthDate() {
		return birthDate;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getBankCard() {
		return bankCard;
	}
	
	public DVD[] getRentals() {
		return rentals;
	}
	
	public void updateAddress(String newAddress) {
		address = newAddress;
	}
	
	public void updatePhone(String newPhone) {
		phone = newPhone;
	}
	
	public void updateBankCard(String newCard) {
		bankCard = newCard;
	}
}
