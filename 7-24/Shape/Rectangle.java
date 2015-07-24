package text;
import java.util.ArrayList;
public class Rectangle extends Shape{
	private double longRectangle;
	private double wideRectangle;
	private double Area;
	public Rectangle(double longRectangle, double wideRectangle) {
		this.longRectangle=longRectangle;
		this.wideRectangle=wideRectangle;
	}
	public double getlongRectangle(){
		return longRectangle;
	}
	public double getwideRectangle(){
		return wideRectangle;
	}
	public double calculateArea(){
		Area=longRectangle*wideRectangle;
		return Area;
	}
}
