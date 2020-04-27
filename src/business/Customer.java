package business;

import java.sql.Date;

public class Customer {
	public String customerID;
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
