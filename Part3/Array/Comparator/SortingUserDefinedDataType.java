package Part3.Array.Comparator;

import java.util.Arrays;

public class SortingUserDefinedDataType {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	//Sorting using comparator
		Noodles[] n=new Noodles[3];
		n[0]=new Noodles("1to3",10,75);
		n[1]=new Noodles("Maggie",14,150);
		n[2]=new Noodles("Yippee",10,200);

		Arrays.sort(n,new sortByPrice());
		for(Noodles nn:n) {
			System.out.println(nn);
			}
		Arrays.sort(n,new sortByWeight());
		for(Noodles nn:n) {
			System.out.println(nn);
		}
		System.out.println("Length"+n.length);
	
}
}
