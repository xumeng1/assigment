package  com;
import java.util.Scanner; 
import com.Shape;
public class TestMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle Rectangle=new Rectangle(20,30);
		Circle Circle = new Circle(20);
		Rectangle.CalculateArea();
		Circle.CalculateArea();
	}
}
