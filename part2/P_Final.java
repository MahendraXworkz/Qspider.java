package part2;

final class P_Final {
	final static int A=10;
	final int B=20;
	
	 P_Final(){
		
	}
	
public static void main(String[] args) {
	System.out.println("A:"+A);
	System.out.println("B:"+new P_Final().B);
}
}
