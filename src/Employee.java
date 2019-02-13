
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
		if( this.priceMonth <= 50000) {
			this.compen = this.price + ((0.05)*this.priceMonth );
		}
		else this.compen = this.price + ((0.1)*this.priceMonth  );
		return this.compen;
		
	}
	public String getName() {
		return this.name;
	}
	
}
