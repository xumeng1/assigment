package text;
import java.util.ArrayList;
public class Squre extends Shape {
	private double Sidelength;
	private double Area;
	public Squre(double Sidelength){
		this.Sidelength=Sidelength;
	}
	public double getSidelength(){
		return Sidelength;
	}	
	public double calculateArea(){
		Area=Sidelength*Sidelength;
		return Area;
	}
}
