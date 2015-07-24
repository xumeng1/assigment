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
	public double gethigh(){
		return high;
	}
	public double calculateArea(){
		Area=high*Sidelength*0.5;
		return Area;
	}
}
