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
		System.out.println("�����γ�Ϊ��"+c.longRectangle+"\n");	
		System.out.println("�����ο�Ϊ��"+c.Sidelength+"\n");	
		System.out.println("���������Ϊ��"+c.Area+"\n");	
	}
}
