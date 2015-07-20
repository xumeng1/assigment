package java3;
import java.io.*;
import java.util.Scanner;
public class Test {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		choose();
	}

	//用户选择
	public static void choose() throws IOException{
		System.out.println("what would you like? please choose:");
		System.out.println("1.create a file   2.read the file   3.write the file    4.delete the file    5.exit !!!");
		System.out.println("请输入对应的数字：");
		Scanner in = new Scanner(System.in);
		int x=in.nextInt();
		if(x<1||x>5)
			System.out.println("您输入有误，请重新输入!!!");
		else{
			switch(x){
			case 1:  CreateTest(); break;
			case 2: ReadTest(); break;
			case 3: WriteTest(); break;
			case 4: DeleteTest(); break;
			case 5: System.out.println("You've already exited " ) ;break;
			}
		}
	}
	//创建文件
	public static void CreateTest() throws IOException {
		File file = new File("D:\\123.txt");
		boolean is_succ = file.createNewFile();
		if (is_succ){
			System.out.println("123.txt has been created");
		}
		else{
			System.out.println("123.txt alraedy exists");  
		}

		choose();
	} 
	//读取文件
	public static void ReadTest() throws IOException { 
		File file = new File("D:\\123.txt");
		InputStream is = new FileInputStream(file);
		char[] chars = new char [1024];
		int len=0;
		for(int i=0;i<1024;i++){
			int x=is.read();
			if(x==-1){
				len=i;
				break;
			}
			chars[i]=(char)x;
		}
		for(int i=0;i<len;i++){
			System.out.println(chars[i]);
		}
		is.close();
		choose();
	} 

	//写文件

	public static void WriteTest() throws IOException {
		File file = new File("D:\\123.txt");
		OutputStream os = new FileOutputStream(file);
		System.out.println ("please write to the file");
		Scanner in = new Scanner(System.in);
		String cont=in.next();
		for(int i=0;i<cont.length();i++){
			char x=cont.charAt(i);
			os.write(x);
		}
		os.close();
		System.out.println("content has been written to file");
		choose();
	}
	//删除文件
	public static void DeleteTest()throws IOException{
		File file = new File("D:\\123.txt");
		boolean is_succ=file.delete();
		if(is_succ){
			System.out.println("123.txt has been deleted!!!");
		}
		else{
			System.out.println("123.txt has not been deleted!!! ");
		}
		choose();
	}

}	
