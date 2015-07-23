import java.util.ArrayList;
public class MyString {
	private char[] ch;
	public MyString(String str){
		this.ch=str.toCharArray();
	}
	public String toValue(){
		String s="";
		for(char c:ch){
			s+=c;
		}
		return s;
	}
	public int length(){
		int i=0;
		for(char c:ch){
			i++;
		}
		return i;
	}
	public void reverse(){
		char[] a=new char[this.length()];
		int i=0;
		for(int j=this.length()-1;j>=0;j--){
			a[i]=this.ch[j];
			i++;
		}
		this.ch=a;
	}
	public void concat(MyString str){
		String s;
		s=this.toValue()+str.toValue();
		this.ch=s.toCharArray();
	}
	public void lower(){
		for(int i=0;i<this.length();i++){
			if((int)this.ch[i]>=65&&(int)this.ch[i]<=90){
				this.ch[i]+=32;
			}
		}
	}
	public void upper(){
		for(int i=0;i<this.length();i++){
			if((int)this.ch[i]>=97&&(int)this.ch[i]<=122){
				this.ch[i]-=32;
			}
		}
	}
	public static void main(String[] args) {
		MyString x = new MyString("abc");
		System.out.println(x.toValue()); 
		System.out.println(x.length()); 
		x.reverse();
		System.out.println(x.toValue());
		x.upper();
		System.out.println(x.toValue()); 
		x.reverse();
		System.out.println(x.toValue()); 
		x.lower();
		System.out.println(x.toValue()); 
		MyString y = new MyString("xyz");
		x.concat(y);
		System.out.println(x.toValue()); 
		System.out.println(x.length());  

	}
}
