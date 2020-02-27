#pragma once
#ifndef Transaction_H_
#define Transaction_H_

#include <string>
#include <iostream>
#include "DVD.h"

using namespace std;

class Transaction {
	string transactionID;
	string transactionType;
	string date;
	DVD titles[3];

public:
	Transaction();
	virtual ~Transaction();
	void cancel();
	void updateInventory();
};


#endif