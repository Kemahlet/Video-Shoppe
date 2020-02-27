#pragma once

#ifndef DVD_H_
#define DVD_H_

#include <iostream>

class DVD {

	string title;
	string genre;
	string actors [5];
	string director;
	string ageRating;
	float price;
	string year;

public:
	DVD();
	virtual ~DVD();
};

#endif /* DVD_H_ */

