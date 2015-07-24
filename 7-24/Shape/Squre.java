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
	public double CalculateArea(){
		Area=Sidelength*Sidelength;
		System.out.println(Area);
		return Area;
	}
	public void AllArea(ArrayList<Shape> shapes) {
		System.out.println("正方形边长为："+Sidelength+"\n");	
		System.out.println("正方形的面积为："+Area+"\n");	
	}
}
