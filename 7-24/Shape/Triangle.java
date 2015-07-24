package text;

public class Triangle extends Shape {
	
	public Triangle(double Sidelength) {
		super(Sidelength);
		// TODO Auto-generated constructor stub
	}
	public double getSidelength(){
		return this.getSidelength();
	}
	public double CalculateArea(){
		Area=Math.cos(60)*Sidelength*Sidelength*1/2;
		System.out.println(Area);
		return Area;
	}
	public void AllArea( Shape c) {
		System.out.println("三角形的边长为："+c.Sidelength+"\n");	
		System.out.println("三角形的面积为："+c.Area+"\n");	
	}
}
