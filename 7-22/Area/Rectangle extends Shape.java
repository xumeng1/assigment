package com;
public class Rectangle extends Shape{
	private double longRectangle;
	private double wideRectangle;
	private double Area;
	public Rectangle (double longRectangle, double wideRectangle) {
		this.longRectangle=longRectangle;
		this.wideRectangle=wideRectangle;
	}
	public double CalculateArea(){
		Area=longRectangle*wideRectangle;
		System.out.println(Area);
		return Area;
	}
}
