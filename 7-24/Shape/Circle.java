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
		System.out.println("Բ�İ뾶Ϊ��"+c.Sidelength+"\n");	
		System.out.println("Բ�����Ϊ��"+c.Area+"\n");	
	}
}
