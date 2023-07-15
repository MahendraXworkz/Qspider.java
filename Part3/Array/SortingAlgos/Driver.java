package Part3.Array.SortingAlgos;

public class Driver {

	public static void main(String[] args) {
		int values[]= {66,51,6,9,8,15,30,604,897,212};
		int bubbleSorted[]=BubbleSort.sort(values);
		for(int n:bubbleSorted) {
			System.out.println(n);
		}
		
		System.out.println("=========");
		int selectionSorted[]=SelectionSort.sort(values);
		for(int n:selectionSorted) {
			System.out.println(n);
		}
		
	}

}
