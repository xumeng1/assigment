package text;

public class Squre extends Shape {
	
	public Squre(double Sidelength) {
		super(Sidelength);
		// TODO Auto-generated constructor stub
	}
	public double getSidelength(){
		return this.getSidelength();
	}
	public double CalculateArea(){
		Area=Sidelength*Sidelength;
		System.out.println(Area);
		return Area;
	}
	public void AllArea( Shape c) {
		System.out.println("�����α߳�Ϊ��"+c.Sidelength+"\n");	
		System.out.println("�����ε����Ϊ��"+c.Area+"\n");	
	}
}
