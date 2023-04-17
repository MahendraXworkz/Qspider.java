import java.util.*;
class LargestOf2 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		double a=sc.nextDouble();
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		System.out.println(a>b?a+" is greater than "+b:b+" is greater than "+a);
	}
}
