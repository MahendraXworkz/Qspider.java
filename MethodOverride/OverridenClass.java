package MethodOverride;

public class OverridenClass {

	public void test() {
		System.out.println("Test from OverridenClass");
		
	}
	public static void main(String[] args) {
		OverridenClass obj=new OverridingClasss();
		obj.test();
		}
}
