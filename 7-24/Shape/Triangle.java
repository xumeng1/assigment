package text;
import java.util.ArrayList;
public class Triangle extends Shape {
	private double high;
	private double Sidelength;
	private double Area;
	public Triangle(double high, double Sidelength) {
		this. high= high;
		this.Sidelength=Sidelength;
	}
	public double getSidelength(){
		return Sidelength;
	}
	public double CalculateArea(){
		return high;
	}
	public double getArea(){
		double Area=0;
		Area=high*Sidelength*1/2;
		System.out.println(Area);
		return Area;
	}
	public void AllArea( ArrayList<Shape> shapes) {
		System.out.println("三角形的边长为："+Sidelength+"\n");
		System.out.println("三角形的高为："+high+"\n");
		System.out.println("三角形的面积为："+Area+"\n");	
	}
}
