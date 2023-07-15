package Part3.Array;

public class LargestAndSecondLArgestNum {
	public static void main(String[] args) {
		int num[]= {23,65,51,90};
		int largest=num[0];
		int secondLargest=num[1];
		
		for(int n:num) {
			if(n>largest) {
				secondLargest=largest;
				largest=n;
			}
			else if(n>secondLargest) {
				secondLargest=n;
			}
		}
		System.out.println(largest);
		System.out.println(secondLargest);
		
}
}
