import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class PostcodeMatch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个邮政编码：");
		String s = in.next();
		if(check(s)){
			System.out.println("该邮政编码是合法的");
		}
		else{
			System.out.println("该邮政编码是不合法的");
		}
	}	
	private static boolean check(String s ) {
		String regex = "[0-9]{6}";
		Pattern pattern = Pattern.compile(regex);
		Matcher m = pattern.matcher(s);
		if(m.find()){
			return true;
		}
		else
			return false;
	}
}
