
public class SelectionSort {
	
	public static void main(String[] args) {
		int arr[] = {8,4,3,6,2,9,1};
		int n = arr.length;
		selectionSort(arr ,n);
		for(int i= 0;i <n ;i++) {
			System.out.print(arr[i] +" ");
		}
	}

	private static void selectionSort(int[] arr, int n) {
	for(int i = 0;i < n -1;i++) {
		int smallest = i;
		for(int j = i + 1; j < n; j++) {
			if(arr[smallest] > arr[j]) {
				smallest = j;
			}
		}
		int temp = arr[smallest];
		arr[smallest] = arr[i];
		arr[i] = temp;
		}
	}
}
		

