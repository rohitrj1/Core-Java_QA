import java.util.Arrays;

public class BinarySearchAlgo {
	
	public static void main(String[] args) {
		
		int arr [] = {8,5,3,4,9,2,13,34,56};
		Arrays.sort(arr);
		int target = 13;
		for(int i = 0; i <arr.length -1; i++) {
			System.out.println(arr[i] +"  " + i);
		}
		System.out.println(binarySearch(arr, target) +" values");
	}
		
	public static int binarySearch(int arr[] , int target ) {
			int start = 0;
			int end  = arr.length-1;
			
			while(start <= end) {
				int mid  = (start + end)/2;
				if(target == arr[mid] ) {
					return mid;
				}else if(target > arr[mid]) {
					start = mid + 1;
				}else if(target < arr[mid]) {
					end = mid -1 ;
				}	
			}
			return -1;
		}
	
}
