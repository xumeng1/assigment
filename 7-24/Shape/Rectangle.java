package text;

public class Rectangle extends Shape{

	public Rectangle(double longRectangle, double wideRectangle) {
		super(longRectangle, wideRectangle);
		// TODO Auto-generated constructor stub
	}
	public double getlongRectangle(){
		return this.getlongRectangle();
	}
	public double getwideRectangle(){
		return this.getwideRectangle();
	}
	public double CalculateArea(){
		Area=longRectangle*wideRectangle;
		return Area;
	}
	public void AllArea( Shape c) {
		System.out.println("长方形长为："+c.longRectangle+"\n");	
		System.out.println("长方形宽为："+c.Sidelength+"\n");	
		System.out.println("长方形面积为："+c.Area+"\n");	
	}
}
