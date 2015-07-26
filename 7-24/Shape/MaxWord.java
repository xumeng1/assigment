package shizxitest; 
2 import java.io.*; 
3 import java.util.ArrayList; 
4 import java.util.Arrays; 
5 import java.util.regex.Matcher; 
6 import java.util.regex.Pattern; 
7 public class Word { 
8 	public static void main(String[] args)throws IOException{ 
9 		FileReader file=new FileReader("D:\\test.txt"); 
10 		BufferedReader br = new BufferedReader(file); 
11 		String s=""; 
13 		while(true){ 
14 			s = br.readLine(); 
15 			if (s == null){ 
16 				break; 
17 			} 
18 			String s1+=s; 
19 		} 
20 		getWord(s1); 
22 	} 
23 
 
24 	private static void getWord(String s) { 
25 		String regex = "[A-Za-z0-9]+"; 
26 		Pattern pattern = Pattern.compile(regex); 
27 		Matcher m = pattern.matcher(s); 
28 		ArrayList<String>word=new ArrayList<String>(); 
29 		while(m.find()){ 
30 			word.add(m.group(0)); 
31 		} 
32 		wordWeight(word); 
33 	} 

       	private static void wordWeight(ArrayList<String> word) { 
36 		ArrayList<Integer>times=new ArrayList<Integer>(); 
37 		int[] weight=new int[word.size()]; 
38 		String[] wordwh=new String[20]; 
39 		String str[]={"am", "is","are","was","been","has","have","had","a","an","the","in","at","on","to","or"}; 
40 		for(int i=0;i<word.size();i++){ 
41 			int count=0; 
42 			for(String s:word){ 
43 				if(word.get(i).equals(s)){ 
44 					count++; 
45 				} 
46 			} 
47 			times.add(count); 
48 		} 
49 		for(int j=0;j<word.size();j++){ 
50 			int a=0; 
51 			for(String s2:str){ 
52 				if(word.get(i).equals(s2)){ 
53 					a=1; 
54 					weight[i]=(int) (times.get(i)*0.2); 
55 					break; 
56 				}	 
57 			} 
58 			if(a==0) 
59 				weight[i]=times.get(i)*1; 
60 		} 
