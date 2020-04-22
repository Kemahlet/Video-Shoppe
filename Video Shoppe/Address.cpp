#include "Address.h"
#include <iostream>

using namespace std;

Address::Address(string customerID, string addressType, string careOf, string building, 
	string street, string unit, string city, string state, string postalCode)
{
	Address::customerID = this->customerID;
	Address::addressType = this->addressType;
	Address::careOf = this->careOf;
	Address::building = this->building;
	Address::street = this->building;
	Address::unit = this->building;
	Address::city = this->city;
	Address::state = this->state;
	Address::postalCode = this->postalCode;
}

Address::~Address()
{
}
