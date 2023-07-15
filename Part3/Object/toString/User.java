package Part3.Object.toString;

public class User {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile pocoX4=new Mobile("POCO","X4",14999);
		Mobile obj=pocoX4;
		Mobile pocoX41=new Mobile("POCO","X4",14999);
		Mobile pocoX4Pro=new Mobile("POCO","X4 Pro",18499);
		
		//overridden toString()
		System.out.println(pocoX4);
		System.out.println(pocoX4Pro);
		
		//Overridden equals()
		System.out.println(pocoX4.equals(pocoX41));//object created with same attributes hence equals true
		System.out.println(pocoX4.equals(pocoX4Pro));//Different configuration so :false
		
		//hashCode
		System.out.println(pocoX4.hashCode());
		System.out.println(pocoX41.hashCode());
		System.out.println(obj.hashCode());
		System.out.println(pocoX4Pro.hashCode());
		
	}

}
