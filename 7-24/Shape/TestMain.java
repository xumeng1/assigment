package text;
import java.util.ArrayList;
public class TestMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(5));
		shapes.add(new Rectangle(4,5));
		shapes.add(new Squre(5));
		shapes.add(new Triangle(5));
	}
}
