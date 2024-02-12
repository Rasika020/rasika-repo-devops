package client;

public class BubbleSort {
	public void bubbleSort(int arr[]) {
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		
	}
	public static void main(String[] args) {
		BubbleSort bs = new BubbleSort();
		int arr[] = {9,5,6,10,1};
		bs.bubbleSort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
	}
}
