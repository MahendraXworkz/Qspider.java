package part2;

public class Test extends P{
public static void main(String[] args) {
	P p=new P();
	p.test();
	p.createObject(10);
	
	Test t=new Test();
	System.out.println(t.p);
	
	//using private constructor through method
	t.createObject(20);
	System.out.println(t.p);
	System.out.println("Whole object:  a:"+t.a+"  b:"+t.b);
	System.out.println("Inner object:  a:"+t.p.a+"  b:"+t.p.b);
	
	//protected cosntructor
	P p2=new P(10,20);
	System.out.println("Object created using \n protected construcotr : a:"+p2.a+" b:");
	
	
	//final
	P_Final finalObject=new P_Final();
	System.out.println(finalObject.A);
	System.out.println(finalObject.B);
	
	
}
}
