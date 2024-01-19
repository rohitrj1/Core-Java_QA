
public class PyramidNumber {
	public static void main(String[] args) {
		
		int n = 5;
		for(int i=0;i<=n;i++) {
			for(int j = 1; j <= n-i;j++) {
				System.out.print(" ");
			}
			for(int k = 1; k <= i;k++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
