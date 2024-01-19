
public class Fibonacii {
	
	public static void main(String[] args) {
		
		
		// Ternary Operator
		
//		int n =12 , m = 34 ,max;
//		
//		max= (n > m)? n :m;
//		System.out.println(max);
//		
		int n =10;
		
		int num1 = 0 , num2 = 2;
		System.out.println(num1);
		System.out.println(num2);
		
		while(n >=0) {
			int sum = num1 + num2;
			num1 = num2;
			num2 = sum;
			System.out.println(sum);
			n--;
		}
		
//		int my_input, j, sum;
//	      my_input = 10;
//	      System.out.println("The value of N: ");
//	      int fabonacci[] = new int[2 * my_input + 1];
//	      fabonacci[0] = 0;
//	      fabonacci[1] = 1;
//	      sum = 0;
//	      for (j = 2; j <= 2 * my_input; j++) {
//	          fabonacci[j] = fabonacci[j - 1] + fabonacci[j - 2];
//	          if (j % 2 == 0) {
//	            sum += fabonacci[j];
//	          }
//	          System.out.println( sum);
//	      }
//	     
//	      System.out.printf("The even sum of fibonacci series till number %d is %d" , my_input, sum);
		
		}

}
