package text;
import java.util.ArrayList;
public class Circle extends Shape{
	private double r;
	private double Area;
	public Circle(double r) {
		this.r=r;
	}
	public double getr(){
		return r;
	}
	public double calculateArea(){
		this.Area=Math.PI*r*r;
		return Area;
	}
}
