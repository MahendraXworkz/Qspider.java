class Typecasting 
{
	public static void main(String[] args) 
	{
		typecastOfByte();
		typecastOfShort();
		typecastOfInt();
		typecastOfLong();
		typecastOfFloat();
		typecastOfDouble();
		typecastOfChar();
	}

	public static void typecastOfByte(){

	System.out.println("**** typecasting of byte ****");
		byte a=35;
		System.out.println("byte :"+a);
		short b=a;
		System.out.println("short :"+b);
		int c=a;
		System.out.println("int :"+c);
		long d=a;
		System.out.println("long :"+d);
		float e=a;
		System.out.println("float :"+e);
		double f=a;
		System.out.println("double :"+f);
		char g=(char)a;
		System.out.println("char :"+g);
		System.out.println();
	}

	public static void typecastOfShort(){

		System.out.println("**** typecasting of short ****");
		short a=1000;
		System.out.println("short :"+a);

		byte b=(byte)a;
		System.out.println("byte :"+b);//why -24 ?

		int c=a;
		System.out.println("int :"+c);
		long d=a;
		System.out.println("long :"+d);
		float e=a;
		System.out.println("float :"+e);
		double f=a;
		System.out.println("double :"+f);
		char g=(char)a;
		System.out.println("char :"+g);
		System.out.println();
	}

	public static void typecastOfInt(){

	System.out.println("**** typecasting of int ****");
		int a=32768;
		System.out.println("int :"+a);
		
		byte c=(byte)a;
		System.out.println("byte :"+c); // why 0 ?
		short b=(short)a;
		System.out.println("short :"+b);//-32768 ?

		long d=a;
		System.out.println("long :"+d);
		float e=a;
		System.out.println("float :"+e);
		double f=a;
		System.out.println("double :"+f);
		char g=(char)a;
		System.out.println("char :"+g);
		System.out.println();
	}

	public static void typecastOfLong(){

	System.out.println("**** typecasting of long ****");
		long a=-32768;
		System.out.println("long :"+a);
		
		byte d=(byte)a;
		System.out.println("byte :"+d);
		short b=(short)a;
		System.out.println("short :"+b); //-32768 ? 

		/* int 32768 converted to short also -32768 and long -32768 converted to short also -32768 ! how ?*/
		int c=(int)a;
		System.out.println("int :"+c);
		
		float e=a;
		System.out.println("float :"+e);
		double f=a;
		System.out.println("double :"+f);
		char g=(char)a;
		System.out.println("char :"+g);
		System.out.println();
	}

	public static void typecastOfFloat(){

	System.out.println("**** typecasting of float ****");
		
		float a=123.1234f;
		System.out.println("float :"+a);

		byte e=(byte)a;
		System.out.println("byte :"+e);
		short b=(short)a;
		System.out.println("short :"+b);
		int c=(int)a;
		System.out.println("int :"+c);
		long d=(int)a;
		System.out.println("long :"+d);
		
		double f=a;
		System.out.println("double :"+f);//why 123.12339782714844 ? why not 123.1234 ?
		char g=(char)a;
		System.out.println("char :"+g);
		System.out.println();
	}

	public static void typecastOfDouble(){

	System.out.println("**** typecasting of double ****");
		double a=123.1234;
		System.out.println("double :"+a);
		
		byte f=(byte)a;
		System.out.println("byte :"+f);
		short b=(short)a;
		System.out.println("short :"+b);
		int c=(int)a;
		System.out.println("int :"+c);
		long d=(long)a;
		System.out.println("long :"+d);
		float e=(float)a;
		System.out.println("float :"+e);
		
		char g=(char)a;
		System.out.println("char :"+g);
		System.out.println();
	}

	public static void typecastOfChar(){

	System.out.println("**** typecasting of char ****");
		char a='#';
		System.out.println("char :"+a);
		
		byte g=(byte)a;
		System.out.println("byte :"+g);
		short b=(short)a;
		System.out.println("short :"+b);
		int c=a;
		System.out.println("int :"+c);
		long d=a;
		System.out.println("long :"+d);
		float e=a;
		System.out.println("float :"+e);
		double f=a;
		System.out.println("double :"+f);
		
		System.out.println();
	}
}
