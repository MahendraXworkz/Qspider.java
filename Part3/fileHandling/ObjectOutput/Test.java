package Part3.fileHandling.ObjectOutput;

import java.io.IOException;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		Emp reddy=Emp.readObject("reddy");
		Emp mahi=Emp.readObject("mahi");
		Emp dinesh=Emp.readObject("dinesh");
		Emp jyo=Emp.readObject("jyo");
		
		System.out.println(reddy);
		System.out.println(mahi);
		System.out.println(dinesh);
		System.out.println(jyo);
	}

}
