package part2;

 interface Interface {
	 static String str="Static variable of Interface";
	 final String strFinal="final non static variable of Interface";
	 
	 static void staticMethod() {
		 System.out.println("staticMethod");
	 }
	 //can't have constructor in interface
	// Interface(){} 
	    void nonStaticMethod();
}
