
public class QuickSort {
	
	public static void quickSort(int arr[] , int low ,int high) {
		if(low < high) {
		
			int pIdx = partion(arr,low,high);
			
			quickSort(arr ,low ,pIdx - 1);
			
			quickSort(arr ,pIdx + 1 ,high);
		}
	}
	
	private static int partion(int[] arr, int low, int high) {
		
		int piviot = arr[high];
		int j = low -1;
		
		for(int i = low ; i < high; i++) {
			
			if(arr[i] < piviot) {
				
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		j++;
		int temp = arr[j];
		arr[j] = piviot;
		arr[high] = temp;
		
		return j;
		
	}

	public static void main(String[] args) {
		int arr [] = {6,4,2,8,5,9,3};
		int n = arr.length;
		quickSort(arr, 0 ,n -1);
		for(int i = 0; i < n ;i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
	}

}
