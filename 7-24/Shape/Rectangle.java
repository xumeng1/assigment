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
	public double CalculateArea(){
		Area=longRectangle*wideRectangle;
		return Area;
	}
	public void AllArea( ArrayList<Shape> shapes) {
		System.out.println("长方形长为："+longRectangle+"\n");	
		System.out.println("长方形宽为："+wideRectangle+"\n");	
		System.out.println("长方形面积为："+Area+"\n");	
	}
}
