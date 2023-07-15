package Part3.Array.SortingAlgos;

public class SelectionSort {
	static int[] sort(int[] arr){
		//if we have n elements n-2 times to be iterated
		int count=0;
		for(int i=0;i<=arr.length-2;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				++count;
				if(arr[i]>arr[j]) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		  }
		}
		return arr;
	}
}
