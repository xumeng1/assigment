import java.util.Scanner;
public class Leap {

	static boolean isLeap(int year)
	{

		if
		(year%4==0&&year%100!=0||year%400==0){
			return true;         
		}
		else{
			return false;
		}


	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("请输入一个年份：");
		int year=in.nextInt();
		if(Leap.isLeap(year))
		{
			System.out.println(year+"年是闰年");
		}
		else
		{
			System.out.println(year+"年不是闰年");
		}

	}
}
