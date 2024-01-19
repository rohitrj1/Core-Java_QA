
public class BubbleSort {
	
	public static void main(String[] args) {
		int arr[] = {8,4,3,6,2,9,1};
		int n = arr.length;
		bubbleSort(arr ,n);
		for(int i= 0;i <n ;i++) {
			System.out.print(arr[i] +" ");
		}
	}
	
	public static void bubbleSort(int arr[] , int n) {
		for(int i = 0 ;i < n;i++) {
			for(int j = i + 1; j < n;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

}
