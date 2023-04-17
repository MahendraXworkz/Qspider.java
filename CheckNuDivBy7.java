import java.util.*;

class CheckNuDivBy7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		double a=sc.nextDouble();
		System.out.println(a%7==0?a+" is Divisible by 7":a+" is not Divisible by 7");
	}
}
