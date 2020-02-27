#pragma once
#ifndef Customer_H_
#define Customer_H_

#include <iostream>
#include <string>
#include "Address.h"
#include "DVD.h"
#include "BankCard.h"

using namespace std;

class Customer {
	string customerID;
	string lastName;
	string firstName;
	string middleInitial;
	string birthDate;
	int age;
	Address address;
	string phone;
	BankCard bankCards[16];
	DVD rentals[3];

public:
	Customer();
	virtual ~Customer();
	DVD getRentals();
	void updateAddress(Address newAddress);
	void updatePhone(string newPhone);
	void updateBankCards(BankCard newCard);
};

#endif