import java.util.*;
class SmallestOf2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		double a=sc.nextDouble();
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		System.out.println(a<b?a+" is smaller than "+b:b+" is smaller than "+a);
	}
}
