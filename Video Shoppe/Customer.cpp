#include "Customer.h"

using namespace std;

Customer::Customer() {

}

Customer::~Customer() {
	cout << "Customer removed" << endl;
}

DVD Customer::getRentals() {
	return *Customer::rentals;
}

void Customer::updateAddress(Address newAddress) {
	Customer::address = newAddress;
}

void Customer::updatePhone(string newPhone) {
	Customer::phone = newPhone;
}

void Customer::updateBankCards(BankCard newCard) {
	for (int i = 0; i < sizeof(Customer::bankCards); i++) {
		if (Customer::bankCards[i] != nullptr)
			continue;
		else
			Customer::bankCards[i] = newCard;
		return;
	}
}