#pragma once
#ifndef Address_H_
#define Address_H_

#include <iostream>

using namespace std;

class Address {
	string customerID;
	string addressType;
	string careOf;
	string building;
	string street;
	string unit;
	string city;
	string state;
	string postalCode;

public:
	Address(string customerID, string addressType, string careOf, string building,
		string street, string unit, string city, string state, string postalCode);
	virtual ~Address();
};

#endif /* Address_H_ */