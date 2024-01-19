
public class PalindromeCheck {
	
	public static void main(String[] args) {
		
		int num = 121;
		
		int temp = num;
		int sum = 0;
		
		while(num > 0) {
			int last = num % 10;
			 sum = sum * 10 + last;
			 num = num/10;
		}
		if(sum == temp) {
			System.out.println("Palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}

}
