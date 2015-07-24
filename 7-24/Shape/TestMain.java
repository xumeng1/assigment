package text;
import text.Shape;
import text.All;
import java.util.ArrayList;
public class TestMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Circle(5));
		shapes.add(new Rectangle(4,5));
		shapes.add(new Squre(5));
		shapes.add(new Triangle(4,5));
		System.out.println("Total Area:" + getTotalArea(shapes));
	}
	public static double getTotalArea(ArrayList shapes) {
		double total_area = 0;
		for (int i = 0; i < shapes.size(); i++) {
			total_area += ((Shape) shapes.get(i)).CalculateArea();
		}
		return total_area;
	}
}
