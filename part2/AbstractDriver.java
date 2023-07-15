package part2;

public class AbstractDriver extends AbstractClass implements Interface{
 public static void main(String[] args) {
	 AbstractClass ac=new AbstractDriver();
	 ac.test();
	 System.out.println("Intenrally converted to static that's we able to access through class name\n"+AbstractDriver.strFinal);
	 ;
	 
	 
}

@Override
void test() {
	// TODO Auto-generated method stub
	System.out.println("test");
	
}

@Override
public void nonStaticMethod() {
	// TODO Auto-generated method stub
	
}


}
