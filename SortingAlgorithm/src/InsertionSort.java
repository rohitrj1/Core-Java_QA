
public class InsertionSort {
	
	public static void main(String[] args) {
		int arr[] = {8,4,3,6,2,9,1};
		int n = arr.length;
		insertionSort(arr ,n);
		for(int i= 0;i <n ;i++) {
			System.out.print(arr[i] +" ");
		}
	}

	private static void insertionSort(int[] arr, int n) {
		for(int i =1;i < n; i++) {
			int current = arr[i];
			int j = i -1;
			while(j >=0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = current;
		}
	}

}
