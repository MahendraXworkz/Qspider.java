package Part3.Array;

public class Noodles implements Comparable{
	String brand;
	int price ;
	int qty;
	Noodles(String brand,int price,int qty){
		this.brand=brand;
		this.price=price;
		this.qty=qty;
	}
	
	@Override
	public int compareTo(Object o) {
		Noodles n=(Noodles)o;
		if(this.price>n.price) {
			return +1;
		}
		else if(this.price<n.price) {
			return -1;
		}else {
		return 0;
		}
	}
	
	@Override
	public String toString() {
		return brand+":"+price+" "+qty;
	}
	
}
