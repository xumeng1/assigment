import java.io.*;
public class Read {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ReadTest();

	}


	public static void ReadTest() throws IOException { 
		File file = new File("D:\\assigment\\javacourse\\intern\\x.txt");
		String s = "";
		try {
			InputStreamReader read = new InputStreamReader(new FileInputStream(file), "GBK");
			BufferedReader reader = new BufferedReader(read);
			String line;
			while ((line = reader.readLine()) != null) {
				s += line + "\n";
			}
			reader.close();
			read.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(s);
	}

} 
