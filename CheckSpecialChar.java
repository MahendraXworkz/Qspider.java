class  CheckSpecialChar
{
	public static void main(String[] args) 
	{
		char ch='#';
		if(!((ch>='A'&&ch<='Z')||(ch>='a' && ch<='z')||(ch>='0'&&ch<='9')))
			{
			System.out.println(ch+" is a special Character");
		}else{
			System.out.println(ch+" is not a special Character");
		}

		/*
		or we can write this as below
		if((ch>='A'&&ch<='Z')||(ch>='a' && ch<='z')||(ch>='0'&&ch<='9'))
			{
			System.out.println(ch+" is not a special Character");
		}else{
			System.out.println(ch+" is a special Character");
		}
		*/
	}
}
