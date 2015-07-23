import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class EmailMatch {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个邮编地址：");
		String s =in.next();
		if(check(s)){
			System.out.println("该邮编合法");
		}
		else
			System.out.println("该邮编不合法");	
	}
	private static boolean check(String s ) {
		String regex="[0-9a-zA-Z]+[.0-9a-zA-Z_-]*@[0-9a-zA-Z]+[.0-9a-zA-Z_-]*[a-zA-Z]+";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		return m.matches();
	}
}
