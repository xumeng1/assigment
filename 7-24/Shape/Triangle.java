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
		System.out.println("�����εı߳�Ϊ��"+c.Sidelength+"\n");	
		System.out.println("�����ε����Ϊ��"+c.Area+"\n");	
	}
}
