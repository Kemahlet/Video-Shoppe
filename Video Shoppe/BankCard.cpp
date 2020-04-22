#include "BankCard.h"
#include <iostream>
#include <string>

using namespace std;

BankCard::BankCard(string customerID, string typeOfCard, string bank, string cardNumber,
	string nameOnCard, string expirationDate) {
	BankCard::customerID = this->customerID;
	BankCard::typeOfCard = this->typeOfCard;
	BankCard::bank = this->bank;
	BankCard::cardNumber = this->cardNumber;
	BankCard::nameOnCard = this->nameOnCard;
	BankCard::expirationDate = this->expirationDate;
}

BankCard::~BankCard() {

}