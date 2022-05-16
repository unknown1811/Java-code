package controlstatement.sortingalgo;

public class MergeSort {
	
	 static int arr[];
	int temparr[];
	int length;
	
	public static void main(String[] args) {
		
		arr = new int [] {10,23,410,1,19,37,41};
		
		MergeSort m = new MergeSort();
		m.divide(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.print(i+" ");
		}
	}

	void divide(int[] arr, int low, int high) {
		if (low < high) {
			int mid = (low + high) / 2;
			divide(arr, low, mid);
			divide(arr, mid + 1, high);
			merge(arr, low, mid,high);
		}
	}

	void merge(int[] arr, int low, int mid,int high) {
		temparr = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temparr[i] = arr[i];
		}
		int i=low,j=low,k=mid+1;
		while(i <=mid && k <= high) {
		if (temparr[i] < temparr[k]) {
			arr[j++] = temparr[i++];
		}
		else {
			arr[j++]= temparr[k++];
		}
	}
		while(i <= mid ) {
			arr[j++] = temparr[i++];
		}
		while(k <= high) {
			arr[j++] = temparr[k++];
		}
}
}