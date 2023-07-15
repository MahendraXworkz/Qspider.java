package Assignments;

public class Driver2{
	 public static void main(String[] args) {
		System.out.println(sub.a);
		System.out.println(sub.b);
	}
}

 class Super {//super
	static int a=10;
	static int b;
	{
		a=10;
		b=20;
		System.out.println("From Super");
	}
	public static void m1() {
		System.out.println("From m1()");
	}
	
}
 class sub extends Super{
	 static int c=10;
	 static int d;
	 {
		 a=10;
		 b=20;
		 System.out.println("From sub");
		 c=15;
		 d=5;
		 System.out.println(c);
		 System.out.println(d);
	 }
	 public static void m2() {
		 System.out.println("From m2()");
	 }
 }
 
 
