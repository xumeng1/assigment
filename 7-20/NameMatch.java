import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class NameMatch {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个英文姓名：");
		String s =in.next();
		if(check(s)){
			System.out.println("该姓名合法");
		}
		else
			System.out.println("该姓名不合法");	
	}
	private static boolean check(String s ) {
		String regex="[A-Z][a-z]+\\s[A-Z][a-z]*\\s[A-Z][a-z]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		return m.matches();
	}
}
