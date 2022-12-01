package interfaces;

public class CustomerManager {
	// bu 1.kullanımda 
	//sade bir şekilde(nasıl diyeceğimi bilemedim)var ---> ICustomerDal customerDal;
	// 2.kullanım parametreli(ya da constructor'lı) yol diyebiliriz.
	
	private ICustomerDal customerDal;
	//2.kullanımda private ifadesi var.
	
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		//burada iş kodları bulunur.
		customerDal.Add();
	}

}
