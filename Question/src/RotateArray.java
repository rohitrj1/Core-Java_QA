
public class RotateArray {
	
	static void reverseArr(int arr[],int start ,int end) {
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
	
	static void printArr(int arr[]) {
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr [] = {3,4,5,7,8,10};  // 8,10,3,4,5,7
		int k = 3;
		reverseArr(arr, 0, k-1);  // 5,4,3,
		printArr(arr);
		reverseArr(arr, k, arr.length-1); // 10,8,7  // 5,4,3,10,8,7
		printArr(arr);
		reverseArr(arr, 0, arr.length-1);
		printArr(arr);
		
//		int ans[] = new int[arr.length];
//		int start = 0;
//		int end = k;
//		// brute force approach
//		for(int j = 0;j<k;j++) {
//			ans[end++] = arr[j];
//		}
//		for(int i = k; i<arr.length;i++) {
//			ans[start] = arr[i];
//			start++;
//		}
//		
//		for(int i = 0; i< ans.length;i++) {
//			System.out.print(ans[i] +" ");
//		}
	}

}
