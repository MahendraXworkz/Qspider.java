package Part3.Array.SortingAlgos;

import java.util.Arrays;
import java.util.Iterator;

public class BubbleSort {
	//from notes 
	static int[] sort1(int[] arr){
		//if we have n elements n-2 elements to be iterated
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
	//my logic
	static int[] sort(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}
}
