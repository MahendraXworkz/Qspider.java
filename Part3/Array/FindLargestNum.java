package Part3.Array;

public class FindLargestNum {
public static void main(String[] args) {
	int num[]= {23,65,51,90};
	int largest=num[0];
	for(int n:num) {
		if(n>largest) {
			largest=n;
		}
	}
	System.out.println(largest);
}
}
