package interfaces;

public class Main {

	public static void main(String[] args) {
	//	ICustomerDal customerDal= new OracleCustomerDal();
	//	customerDal.Add();
		CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
	//bu 1.kullanımda var--> customerManager.customerDal = new SqlServerCustomerDal();
		customerManager.add();
	}

}
