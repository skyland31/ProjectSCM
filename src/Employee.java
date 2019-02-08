
public class Employee {
	private int NumberEmployee;
	private int priceMonth;
	private int price;
	private String name;
	private double compen;
	public Employee(int num, String n,int p,int pM) {
		this.NumberEmployee = num;
		this.priceMonth = pM;
		this.price = p;
		this.name = n;
	}
	public double getCompensation() {
		if( this.priceMonth >0 || this.priceMonth <= 50000) {
			this.compen = this.price + ((5/100)*this.price );
		}
		else this.compen = this.price + ((5/100)*this.price );
		if(this.compen < 20000) {
			this.compen = 20000;
		}
		if(this.price < 15000)
		{
			if(this.priceMonth > 100001) {
				this.compen += 5000;
			}
		}
		return this.compen;
	}
	public String getName() {
		return this.name;
	}
	
}
