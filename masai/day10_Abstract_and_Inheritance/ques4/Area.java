package com.masai.day10_Abstract_and_Inheritance.ques4;

public class Area extends Shape {

	
	
@Override
	public int rectangleArea(int length, int breadth) {
		int area = length*breadth;
		return area;
	}
	
@Override
public int circleArea(int radius) {
	
	int area =(int) (3.142)*radius*radius;
	
	return area;
}

@Override
public int squareArea(int side) {

	int area = side*side;
	return area;
}


}