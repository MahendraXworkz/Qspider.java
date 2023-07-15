package Part3.Exception;

public class Voter {
	static int count;
 int age;
 String name;
 
 {System.out.println("\n	"+" Voter Object created count: "+ ++count );}
 
@Override
public String toString() {
	return "Voter [age=" + age + ", name=" + name + "]";
}

public Voter(int age, String name) {
	super();
	if(age<18) {
		try {
			throw new AgeException("Not eligible for voting");
		}catch(Exception e) {
			System.out.println(e);
		}
	}else {
		this.age=age;
		this.name = name;
	}
}

public Voter() {
	super();
}
 
}
