import java.util.Scanner;

public class StringPermut {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		stringPermut(s,"");
	}
	
	public static void stringPermut(String s , String ans) {
		if(s.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0;i < s.length();i++) {
			char ch = s.charAt(i);
			
			String res = s.substring(0 , i) + s.substring(i + 1);
			
			stringPermut(res , ans + ch);
		}
	}
}
