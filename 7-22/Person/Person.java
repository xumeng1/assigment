package java3;
public class Person {
	static Limb Handnum;
	static Limb Legnum;
	public Person(Limb Handnum ,Limb Legnum){
		this.Handnum=Handnum;
		this.Legnum=Legnum;
	}
	public Limb getHand(){
		return Handnum;
	}
	public  Limb getLeg(){
		return Legnum;
	}	
	public static void printInfo(){
		System.out.println("手的长度："+Handnum.getlength ()+"\n");
		System.out.println("手的重量："+Handnum.getweight()+"\n");
		System.out.println("腿的长度："+Legnum.getlength ()+"\n");
		System.out.println("腿的重量："+Legnum.getweight()+"\n");	
	}
}
