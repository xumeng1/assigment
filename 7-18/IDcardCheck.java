import java.util.*;
public class Cheak {
	/**
         * @param args
	 */
 static int power[]={7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
	static int sum;
	static String idcord18;
	static String checkCode;
	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("请依次输入身份证号码：");
		Scanner in = new Scanner(System.in);
		String a=in.next();
	        String[]b=new String[18];   	 
		 if(a.length()!=18){
		   System.out.println("您的输入有误！！");
		 }
		 else{
		   for(int i=0;i<17;i++){
	           b[i]=String.valueOf(a.charAt(i));
		   System.out.print(b[i]+" ");
	           }
		int sss=sum(b);
	        CodeBySum(sss);
		String ck= CodeBySum(sss);
		idcord18=String.valueOf(a.charAt(17));
		  if((ck).equals(idcord18)){
		     System.out.println("该身份证合法");
		 }
		  else
		     System.out.println("该身份证不合法");
		}
	}
	public static int  sum (String[] b){
		   int sum=0;
		   int[] c = new int[17];
		   for(int i=0;i<17;i++){
		       c[i]=Integer.parseInt(b[i]);
		       sum+=c[i]*power[i];
		     }
		return sum;
	}	
	public static String CodeBySum(int sss){
		switch(sss%11){
		case 0: checkCode="1";break;
		case 1: checkCode="0";break;
		case 2: checkCode="X";break;
		case 3: checkCode="9";break;
		case 4: checkCode="8";break;
		case 5: checkCode="7";break;
		case 6: checkCode="6";break;
		case 7: checkCode="5";break;
		case 8: checkCode="4";break;
		case 9: checkCode="3";break;
		case 10: checkCode="2";break;
		}
		return checkCode;
	}
}
