
public class StringPermutation {
	
	
	static void permut(String ques ,String ans) {
		
		if(ques.length() == 0) {
			System.out.println(ans);
			return;
		}
		
		for(int i = 0 ;i < ques.length();i++) {
			char ch = ques.charAt(i);
			String res = ques.substring(0,i) + ques.substring(i + 1);
			permut(res,	ans + ch);
		}
		
	}
	
	public static void main(String[] args) {
		
		String str = "abc"; // abc acb bac bca cab cba
		permut(str," ");
	}

}
