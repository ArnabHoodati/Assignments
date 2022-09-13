package com;

class Rectangle {	//class
	//create instances variable
	int length;		
	int breadth;
	void calculateArea(int l, int b){	//create method for calculate area of rectangle
		length=l;
		breadth=b;
		System.out.println("Area of this rectangle is : "+(l*b));	//output

	}
}
