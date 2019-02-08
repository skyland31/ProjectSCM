
public class Employee {
	private int NumberEmployee;
	private int priceMonth;
	private int price;
	private String name;
	public Employee(int num, String n,int p,int pM) {
		this.NumberEmployee = num;
		this.priceMonth = pM;
		this.price = p;
		this.name = n;
	}
	public double compensation() {
		double c = 0;
		if( this.priceMonth >0 || this.priceMonth <= 50000) {
			c = this.price + ((5/100)*this.price );
		}
		else c = this.price + ((5/100)*this.price );
		return c;
		
	}

}
