package OOPs_concepts;

public class Employee_Main {

	public static void main(String[] args) {
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		
		emp1.empName="sohan";
		emp1.empId=200;
		emp1.empSalary=2000;
		
		
		emp2.empName="Mohan";
		emp2.empId=300;
		emp2.empSalary=3000;
		
		emp1.displayEmployeeBonus();
		emp2.displayEmployeeBonus();

	}

}
