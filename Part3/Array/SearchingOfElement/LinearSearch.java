package Part3.Array.SearchingOfElement;

import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		int array[]= {66,51,6,9,8,15,30,604,897,212};
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(contains(array,n));
		
	}
	static boolean contains(int array[],int n) {
		for(int value:array){
			if(value==n) {
				return true;
			}
		}
		return false;
	}
}
