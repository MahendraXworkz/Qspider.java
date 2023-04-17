import java.util.*;
class LargestOf3
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		double a=sc.nextDouble();
		System.out.println("Enter b value");
		double b=sc.nextDouble();
		System.out.println("Enter c value");
		double c=sc.nextDouble();
		
		double largest=a>b?a:b;
				largest=largest>c?largest:c;
				
		System.out.println("Largest number of given 3 numbers "+a+", "+b+", "+c+"\nis :"+largest);
	}
}
