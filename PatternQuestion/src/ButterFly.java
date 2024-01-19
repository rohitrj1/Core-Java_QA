
public class ButterFly {
	
	public static void main(String[] args) {
		
		int n = 5;
		
		// first Half
		
		for(int i = 1; i<=n;i++) {
			// for first star
			for(int j = 1; j <=i;j++) {
				System.out.print("*");
			}
			// space print
			for(int j = 1; j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			// for last star
			for(int j = 1; j <=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
		
		
		// second half
		for(int i= n;i>=1;i--) {
			// for first star
			for(int j = 1; j <=i;j++) {
				System.out.print("*");
			}
			// space print
			for(int j = 1; j<=2*(n-i);j++) {
				System.out.print(" ");
			}
			// for last star
			for(int j = 1; j <=i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
