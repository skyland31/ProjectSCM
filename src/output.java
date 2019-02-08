
public class output {
	private Employee emp ;
	public output() {
		
	}
	public output(Employee e) {
		this.emp = e;
	}
	
	public void printEmp() {
		System.out.println("Name : " + this.emp.getName() + " Compensation :" + this.emp.getCompensation());
	}
	

}
