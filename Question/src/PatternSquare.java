
public class PatternSquare {

	public static void main(String[] args) {
	
		int n = 4; 
		int m = 5;
		
//		squarePattern(n , m);
		halfPyramid(n);
		
	}
	
	public static void squarePattern(int n , int m) {
		
		for(int i = 1 ;i <= n; i++) {
			
			for(int j = 1 ; j <= m; j++) {
				
				if(i == 1 || j ==1 || i ==n || j ==m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
	}
	
	public static void halfPyramid(int n) {
		
		for(int i =1 ;i <=n ;i ++) {
			for(int j =i ;j <=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	

}
