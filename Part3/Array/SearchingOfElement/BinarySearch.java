package Part3.Array.SearchingOfElement;

import java.util.Scanner;

public class BinarySearch {
	
	public static void main(String[] args) {
		int array[]= {1,2,3,4,5,6};
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(contains(array,n));
	}
	
	static boolean contains(int array[],int n) {
		int low=0;
		int high=array.length-1;
		int mid=(low+high)/2;
		for(;mid<array.length;) {
			if(array[mid]==n) {
				return true;
			}else if(array[mid]>n) {
				mid-=1;
			}
			else{
				mid+=1;
			}
		}
		
		return false;
		
	}
	
}
