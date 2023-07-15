package Part3.fileHandling.ObjectOutput;


import java.io.IOException;

public class EmpDriver {
public static void main(String[] args) throws ClassNotFoundException, IOException {
	Emp reddy=new Emp("Reddy",25000);
	Emp mahi=new Emp("Mahendra",25000);
	Emp dinesh=new Emp("Dinesh",25000);
	Emp jyo=new Emp("Jyothi",25000);
	Emp yashu=new Emp("Yashodha",25000);
	Emp venki=new Emp("Venksatesh",25000);
	
	Emp shilpa=new Emp("Shilpa",50000);
	
//	Emp[] emps= {reddy,mahi,dinesh,jyo,yashu};
//	Emp.writeObjects(emps);
//	
//	Emp.writeObject(venki);
//	
	Emp obj=Emp.readObject("Reddy");
	
//	String path="C:\\Users\\mahendrakodimole\\eclipse-workspace\\Qspiders.java\\src\\Part3\\fileHandling\\ObjectOutput\\objectDataFiles\\demo.txt";
//	FileOutputStream fout=new FileOutputStream(path);
//	
//	fout.write(obj.toString().getBytes());
	
	System.out.println(obj);
	
}
}
