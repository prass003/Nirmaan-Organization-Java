package Day10;

public class Emp {
	long Number;
	String Name;
	double Salary;
	
	void Employee() {
		System.out.println("Employee Name : "+Name);
		System.out.println("Employee Number : "+Number);
		System.out.println("Employee Salary : "+ Salary);
		System.out.println();
	}

	public static void main(String[] args) {
		Emp e1 = new Emp();
		e1.Name = "Prasanna";
		e1.Number = 76313;
		e1.Salary = 37770.23;
		e1.Employee();
		
		Emp e2 = new Emp();
		e2.Name = "Perumal";
		e2.Number = 6573613;
		e2.Salary = 653312.12;
		e2.Employee();
		
		Emp e3 = new Emp();
		e3.Name = "Haridsh";
		e3.Number = 6732;
		e3.Salary = 87236.12;
		e3.Employee();
		
		Emp e4 = new Emp();
		e4.Name = "Perumal";
		e4.Number = 6573613;
		e4.Salary = 653312.12;
		e4.Employee();
		
		
		
	}

}
