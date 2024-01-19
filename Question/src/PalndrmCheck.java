
public class PalndrmCheck {
	
	static String plncheck(String str,int start,int end) {
		if(start > end ) return " palindrome ";
		
		if(str.charAt(start)!= str.charAt(end)){
			return " not a palindrome ";
		}else {	
			return plncheck(str,start +1,end -1);
		}
	}
	
	public static void main(String[] args) {
		
		String str = "pop";
		System.out.println(plncheck(str,0,str.length()-1));
	}

}
