package Part3.Exception;

public class Voter2 {
	static int count;
 int age;
 String name;
 
 {System.out.println("\n	"+" Voter2 Object created count: "+ ++count );}

private Voter2(int age, String name) {
	super();
	this.age=age;
	this.name=name;
}

public Voter2() {
	super();
}

public static Voter2 createVoter(int age,String name) {
		if(age<18) {
			try {
				throw new AgeException("Not eligible for voting");
			}catch(Exception e) {
				System.out.println(e);
			}
		}else
			return new Voter2(age,name);

		return null;
}

@Override
public String toString() {
	return "Voter [age=" + age + ", name=" + name + "]";
}

 
}
