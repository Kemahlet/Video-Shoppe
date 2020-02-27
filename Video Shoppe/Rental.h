#pragma once
#ifndef Rental_H_
#define Rental_H_

#include "Transaction.h"

class Rental : public Transaction {
	float amountDue;
	string dueDate;

public:
	Rental();
	virtual ~Rental();
	void updateCustomerRentals();
};
#endif