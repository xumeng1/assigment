package  com;
import java.io.InputStream;
import java.util.Scanner;
public class rectangle {
	private double longRectangle;
	private double wideRectangle;
	private double Sidelength;
	private String color;
	private double Area;
	public rectangle(double longRectangle,double wideRectangle,String color){
		this.longRectangle=longRectangle;
		this.wideRectangle=wideRectangle;
		this.color=color;
	}
	public rectangle(double Sidelength,String color){
		this.longRectangle=Sidelength;
		this.wideRectangle=Sidelength;
		this.color=color;
	}	
	public double GetLongRectangle(){
		return longRectangle;
	}
	public double GetwideRectangle(){
		return wideRectangle;
	}
	public String Getcolor(){
		return color; 
	}
	public double GetArea(){
		Area=longRectangle*wideRectangle;
		return Area;
	}
	public void printInfo(){
		System.out.println("长 ："+GetLongRectangle()+"\n"+"宽：  "+GetwideRectangle()+"\n"+"颜色  ："+Getcolor()+"\n"+"面积：   "+GetArea());
	}
}
