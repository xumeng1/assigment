import java.util.Scanner;
public class YearDays {
	static int days;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            System.out.println("Please input year:");
            Scanner sc=new Scanner(System.in);
            int year=sc.nextInt();
             GetDays(year);
            System.out.println("The days are:"+days);
	}
         public static int  GetDays(int year)
         {  
    	
            if(year%4==0&&year%100!=0||year%400==0)
               days=366;
    	    else
    	     days=365; 
          
    	   } 
     
       }
 } 
