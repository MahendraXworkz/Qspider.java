package part2;

  class P {
	 static int i;
	 int a;
	 int b;
	 {
		 System.out.println("Object created: "+ ++i);
	 }
	 P p;
	 
	P(){}
	private P(int a){
		this.a=a; 
	}
	
	protected P(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	void test() {
		System.out.println("Only public,abstract and final are permitted for class "); 
		System.out.println();
	}
	
	void createObject(int a) {
		p=new P(a);
	}
	
}
