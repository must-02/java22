package inheritance;

public class Main {

	public static void main(String[] args) {
		Customer customer = new Customer();
		Employee employee = new Employee();
		
		customer.age= 23;
		employee.salary= 4556.73;
	
		EmployeeManager employeeManager = new EmployeeManager();
		CustomerManager customerManager = new CustomerManager();
	
		customerManager.Add();
		employeeManager.BestEmployee();
	
	}

}
