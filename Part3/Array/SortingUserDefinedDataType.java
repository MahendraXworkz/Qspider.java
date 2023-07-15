package Part3.Array;

import java.util.Arrays;

public class SortingUserDefinedDataType {

	public static void main(String[] args) {
		/*
		//user defined datatype array
		
		Noodles[] n=new Noodles[3];
		n[0]=new Noodles("1to3",10,75);
		n[1]=new Noodles("Maggie",14,150);
		n[2]=new Noodles("Yippee",10,100);

		Arrays.sort(n);
		for(Noodles nn:n) {
			System.out.println(nn);
		}
		
		Exception in thread "main" java.lang.ClassCastException: class 
		Part3.Array.Noodles cannot be cast to class java.lang.Comparable 
		(Part3.Array.Noodles is in unnamed module of loader 'app'; 
		java.lang.Comparable is in module java.base of loader 'bootstrap')
		*/
		
		Noodles[] n=new Noodles[3];
		n[0]=new Noodles("1to3",10,75);
		n[1]=new Noodles("Maggie",14,150);
		n[2]=new Noodles("Yippee",10,100);

		Arrays.sort(n);
		for(Noodles nn:n) {
			System.out.println(nn);
	}
}
}
