package  com;
import java.io.InputStream;
import java.util.Scanner;
public class Student {
	private String name;
	private String major;
	private int grade;
	private int[] cet4_scores;
	public Student(String name,String major,int grade,int[]cet4_scores){
		this.name=name;
		this.major=major;
		this.grade=grade;
		this.cet4_scores=cet4_scores;
	}
	public String getname(){
		return name;
	}
	public String getmajor(){
		return major;
	}
	public int getgrade(){
		return grade;
	}
	public int[] getcet4_scores(){
		return cet4_scores;
	}
	public void level_up(){
		grade++;
	}
	public boolean  Passed_cet4(){
		int i; 
		for(i=0;i<cet4_scores.length;i++){
			if(cet4_scores[i]>=425){
				return true;	
			}
		}
		return false;
	}
	public void printInfo(){
		System.out.println("姓名： "+getname()+"\n"+"年级：  "+getgrade()+"\n"+"专业：  "+getmajor()+"\n"+"四级通过情况：   "+Passed_cet4());
	}
}
