package oop;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer individualCustomer = new IndividualCustomer();
		
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setId(1);
		individualCustomer.setPhone("05222222222");
		individualCustomer.setFirstName("Gökçe");
		individualCustomer.setLastName("bilmemne");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setCustomerNumber("54321");
		corporateCustomer.setPhone("05333333333");
		corporateCustomer.setTaxNumber("1111111111");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
	}

}
