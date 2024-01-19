
public class CheckArmstrong {
	
	public static void main(String[] args) {
		
		int num = 1234;
		
		int arm = 0,temp = num;
		
		int digit = digitCount(num);
		
		while(num > 0) {
			int last = num % 10;
			arm += Math.pow(last, digit);
			num = num /10;
		}
		
		if(arm == temp) {
			System.out.println("Armstrong Number");
		}else {
			System.out.println("Not a number");
		}
		
	}
	
	
	static int digitCount(int n) {
		int count =0;
		while(n > 0) {
			count++;
			n = n / 10;
		}
		return count;
	}

}
