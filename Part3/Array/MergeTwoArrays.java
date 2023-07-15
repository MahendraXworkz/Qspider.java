package Part3.Array;

public class MergeTwoArrays {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[]= {6,7,8,9,10};
	int c[]=new int[a.length+b.length];
	
//	for(int i=0;i<c.length;i++) {
//		if(i<a.length) {
//			c[i]=a[i];
//		}else {
//			c[i]=b[i-a.length];
//		}
//	}
	
	for(int i=0;i<a.length;i++) {
		c[i]=a[i];
	}
	for(int i=0;i<b.length;i++)
		c[i+a.length]=b[i];
	
	
	
	for(int n:c){
		System.out.println(n);
	}
}
}
