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
	public double CalculateArea(){
		this.Area=Math.PI*r*r;
		return Area;
	}
	public void AllArea(ArrayList<Shape> shapes) {
		System.out.println("圆的半径为："+r+"\n");	
		System.out.println("圆的面积为："+Area+"\n");	
	}
}
