import java.util.Scanner;
import java.util.ArrayList;
public class Test {
	public static void main(String[] agrs) {
		ArrayList<Employee> emp = new ArrayList<Employee>() ;
		output o ;
		Scanner in = new Scanner(System.in);
		char ch = 'y';
		int num,p,pm;
		String name;
		do {
			System.out.print("Employer Number : ");
			num = in.nextInt();
			System.out.print("Employer Name : ");
			name = in.next();
			System.out.print("Salary : ");
			p = in.nextInt();
			System.out.print("Monthly product sales : ");
			pm = in.nextInt();
			emp.add(new Employee(num,name,p,pm));
			System.out.print("Do you want continue [y/n]: ");
			ch = in.next().charAt(0);
		}while(ch == 'y');
		int i = 0;
		for( i = 0 ; i < emp.size() ; i++) {
			o = new output(emp.get(i));
			o.printEmp();
		}
	}
	

}
