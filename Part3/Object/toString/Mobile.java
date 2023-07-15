package Part3.Object.toString;

public class Mobile {
	double price;
	String brand;
	String model;
	
	Mobile(){}
	Mobile(String brand,String model,double price){
		this.brand=brand;
		this.model=model;
		this.price=price;
	}
	
	public String toString() {
		return "Brand :"+brand+"\n"+
				"Model :"+model+"\n"+
				"Price :"+price+"\n*************";
	}
	
	public boolean equals(Object o) {
		if(this.price==((Mobile)o).price && 
				this.brand==((Mobile)o).brand &&
				this.model==((Mobile)o).model)
			return true;
		return false;
	}
	
	@Override
	public int hashCode() {
		return (int)price;
		
	}
}
