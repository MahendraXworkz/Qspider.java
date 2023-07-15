package Part3.Exception;

public class VoterDriver {
public static void main(String[] args) {
	
	/**In the Voter Class 
	 * even if the age is invalid one object is 
	 * getting created with
	 *  states (default values)
	 */
	//object 1 of voter
	Voter v1=new Voter(22,"Mahendra");
	System.out.println(v1);
	
	//object 1 of voter
	Voter v2=new Voter(17,"gouda");
	System.out.println(v2);
	
	
	/**In the Voter2 Class 
	 * only if the age is valid one object is 
	 * getting created with
	 *  and if the values are not valid object 
	 *  will not be created 
	 *  null value will be returned
	 */
	
	//object 1 of Voter2
	Voter2 v3=Voter2.createVoter(22,"Mahendra");
	System.out.println(v3);
	
	//object 2 of Voter2 but is not getting created
	//we can check that in object creation count
	Voter2 v4=Voter2.createVoter(17,"gouda");
	System.out.println(v4);
	
	//object 3 of Voter2
	Voter2 v5=Voter2.createVoter(23,"Sanganagouda");
	System.out.println(v5);
}
}
