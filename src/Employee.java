
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
		if(  this.priceMonth <= 50000) {
			this.compen = this.price + ((5/100)*this.priceMonth  );
		}
		else this.compen = this.price + ((10/100)*this.priceMonth );
		if(this.compen < 20000) {
			this.compen = 20000;
		}
		return this.compen;
	}
	public String getName() {
		return this.name;
	}
	
}
