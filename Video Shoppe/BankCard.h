#pragma once
#ifndef BankCard_H_
#define BankCard_H_

#include <iostream>
#include <string>

using namespace std;

class BankCard{
	string customerID;
	string typeOfCard;
	string bank;
	string cardNumber;
	string nameOnCard;
	string expirationDate;

public:
	BankCard(string customerID, string typeOfCard, string bank, string cardNumber,
		string nameOnCard, string expirationDate);
	virtual ~BankCard();
};

#endif