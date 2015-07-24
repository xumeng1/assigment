package text;

public class Circle extends Shape{
	
	public Circle(double Sidelength) {
		super(Sidelength);
		// TODO Auto-generated constructor stub
	}
	public double getSidelength(){
		return this.getSidelength();
	}
	public double CalculateArea(){
	
		this.Area=Math.PI*this.Sidelength*this.Sidelength;
		return Area;
	}
	public void AllArea( Shape c) {
		System.out.println("圆的半径为："+c.Sidelength+"\n");	
		System.out.println("圆的面积为："+c.Area+"\n");	
	}
}
