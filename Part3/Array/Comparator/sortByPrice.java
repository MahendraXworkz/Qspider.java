package Part3.Array.Comparator;

import java.util.Comparator;

public class sortByPrice implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Noodles n1=(Noodles)o1;
		Noodles n2=(Noodles)o2;
		if(n1.price>n2.price)
			return +1;
		if(n1.price<n2.price)
			return -1;
		return 0;
	}
}
