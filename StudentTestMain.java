package  com;
import java.util.Scanner;
import com.Student;
public class StudentTestMain {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a={387,396,425,427};
		Student s = new Student("xiaoming","English",1,a);
		s.printInfo();
		s.level_up();
		s.Passed_cet4();
		s.printInfo();
	}
}
