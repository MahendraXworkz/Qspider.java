package Part3.Stings;

public class CharacterOccurenceOfString {
public static void main(String[] args) {
	String str="Mahendrakodimole";
	String toLower=str.toLowerCase();
	
	for(char ch='a';ch<='z';ch++) {
		int count=0;
		
		for(int i=0;i<toLower.length();i++) {
			if(toLower.charAt(i)==ch) {
				count++;
			}
		}
		
		if(count>0)
			System.out.print(ch+""+count);
	}
	
}

}
