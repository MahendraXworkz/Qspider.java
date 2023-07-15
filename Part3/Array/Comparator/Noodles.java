package Part3.Array.Comparator;

public class Noodles {
	String brand;
	int price ;
	int qty;
	Noodles(String brand,int price,int qty){
		this.brand=brand;
		this.price=price;
		this.qty=qty;
	}
	
	@Override
	public String toString() {
		return brand+":"+price+" "+qty;
	}
	
}
