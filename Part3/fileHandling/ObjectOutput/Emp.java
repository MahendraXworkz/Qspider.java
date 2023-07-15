package Part3.fileHandling.ObjectOutput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Emp implements Serializable{
int id;
String name;
double sal;
static int count;
//assign id automatically
{
	this.id=++count;
}


public Emp( String name, double sal) throws IOException {
	super();
	this.name = name;
	this.sal = sal;
	//writeObject();
}

void writeObject() throws IOException {
	String fileName=this.name;
	String path="C:\\Users\\mahendrakodimole\\eclipse-workspace\\Qspiders.java\\src\\Part3\\fileHandling\\ObjectOutput\\objectDataFiles\\"+fileName+".txt";
	FileOutputStream fout=new FileOutputStream(path);
	ObjectOutputStream oOut=new ObjectOutputStream(fout);
	oOut.writeObject(this);
	oOut.close();
	System.out.println("Object Written successfully to "+fileName+".txt");
}

static void writeObject(Emp obj) throws IOException {
	String fileName=obj.name;
	String path="C:\\Users\\mahendrakodimole\\eclipse-workspace\\Qspiders.java\\src\\Part3\\fileHandling\\ObjectOutput\\objectDataFiles\\"+fileName+".txt";
	FileOutputStream fout=new FileOutputStream(path);
	ObjectOutputStream oOut=new ObjectOutputStream(fout);
	oOut.writeObject(obj);
	oOut.close();
	System.out.println("Object Written successfully to "+fileName+".txt");
}
static void writeObjects(Emp[] obj1) throws IOException {
	for(Emp obj:obj1) {
	String fileName=obj.name;
	String path="C:\\Users\\mahendrakodimole\\eclipse-workspace\\Qspiders.java\\src\\Part3\\fileHandling\\ObjectOutput\\objectDataFiles\\"+fileName+".txt";
	FileOutputStream fout=new FileOutputStream(path);
	ObjectOutputStream oOut=new ObjectOutputStream(fout);
	oOut.writeObject(obj);
	oOut.close();
	System.out.println("Object Written successfully to "+fileName+".txt");
}
}

@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + ", sal=" + sal + "]";
}
static Emp readObject(String fileName) throws IOException, ClassNotFoundException {
	String path="C:\\Users\\mahendrakodimole\\eclipse-workspace\\Qspiders.java\\src\\Part3\\fileHandling\\ObjectOutput\\objectDataFiles\\"+fileName+".txt";
	FileInputStream fout=new FileInputStream(path);
	ObjectInputStream oOut=new ObjectInputStream(fout);
	Emp obj=(Emp) oOut.readObject();
	oOut.close();
	System.out.println("Object read successful from "+fileName+".txt");
	return obj;
}

}
